package simplepdl2petrinetEMF;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.RessourceAllocation;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

import petrinet.PetriNet;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Arc;
import petrinet.Node;
import petrinet.Place;
import petrinet.Transition;

public class SimplePDL2PetriNetEMF {

	public static Process loadProcess(String modelPath) {
	    // 1) enregistrer les factories XMI pour .simplepdl (et .xmi si besoin)
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
	        .put("simplepdl", new XMIResourceFactoryImpl());
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
	        .put("xmi",      new XMIResourceFactoryImpl());

	    // 2) enregistrer le package SimplePDL
	    ResourceSet rs = new ResourceSetImpl();
	    rs.getPackageRegistry().put(
	        SimplepdlPackage.eNS_URI, SimplepdlPackage.eINSTANCE);

	    // 3) charger le modèle depuis un URI fichier
	    Resource r = rs.getResource(
	        URI.createFileURI(modelPath), true);

	    return (Process) r.getContents().get(0);
	}


    public static void generatePetriNet(Process process, String modelPath) {
        // Enregistrer le package PetriNet
    	// Préparer le ResourceSet et factories
    	ResourceSet rs = new ResourceSetImpl();
    	rs.getPackageRegistry().put(PetrinetPackage.eNS_URI, PetrinetPackage.eINSTANCE);
    	// IMPORTANT : enregistrer XMI factory pour l'extension .xmi AVANT createResource
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
    	    .put("xmi", new XMIResourceFactoryImpl());

    	// Créer la ressource de sortie sur fichier
    	Resource out = rs.createResource(URI.createFileURI(modelPath));
    	if (out == null) {
    	    throw new IllegalStateException("Impossible de créer la ressource pour " + modelPath);
    	}

        
        PetrinetFactory f = PetrinetFactory.eINSTANCE;
        PetriNet net = f.createPetriNet();
        net.setName(process.getName());
        out.getContents().add(net);

        // Transformer chaque élément
        process.getProcessElements().stream().forEach(pe -> {
            if (pe instanceof WorkDefinition) {
                WorkDefinition wd = (WorkDefinition) pe;
                // Places
                Place ready   = f.createPlace(); ready.setName(wd.getName()+"_ready");   ready.setMarking(1); net.getPetriElements().add(ready);
                Place running = f.createPlace(); running.setName(wd.getName()+"_running"); running.setMarking(0); net.getPetriElements().add(running);
                Place started = f.createPlace(); started.setName(wd.getName()+"_started"); started.setMarking(0); net.getPetriElements().add(started);
                Place finished= f.createPlace(); finished.setName(wd.getName()+"_finished");finished.setMarking(0); net.getPetriElements().add(finished);
                // Transitions
                Transition start = f.createTransition(); start.setName(wd.getName()+"_start"); net.getPetriElements().add(start);
                Transition fin   = f.createTransition(); fin.setName(wd.getName()+"_finish"); net.getPetriElements().add(fin);
                // Arcs
                Arc a1 = f.createArc(); a1.setWeight(1); a1.setIsReadArc(false); a1.setSource(ready);   a1.setTarget(start); net.getPetriElements().add(a1);
                Arc a2 = f.createArc(); a2.setWeight(1); a2.setIsReadArc(false); a2.setSource(start);   a2.setTarget(running); net.getPetriElements().add(a2);
                Arc a3 = f.createArc(); a3.setWeight(1); a3.setIsReadArc(false); a3.setSource(start);   a3.setTarget(started); net.getPetriElements().add(a3);
                Arc a4 = f.createArc(); a4.setWeight(1); a4.setIsReadArc(false); a4.setSource(running); a4.setTarget(fin); net.getPetriElements().add(a4);
                Arc a5 = f.createArc(); a5.setWeight(1); a5.setIsReadArc(false); a5.setSource(fin);     a5.setTarget(finished); net.getPetriElements().add(a5);

            } else if (pe instanceof WorkSequence) {
                WorkSequence ws = (WorkSequence) pe;
                String pred = ws.getPredecessor().getName() +
                    ((ws.getLinkType()==WorkSequenceType.START_TO_START||ws.getLinkType()==WorkSequenceType.START_TO_FINISH)?"_started":"_finished");
                String succ = ws.getSuccessor().getName() +
                    ((ws.getLinkType()==WorkSequenceType.START_TO_START||ws.getLinkType()==WorkSequenceType.FINISH_TO_START)?"_start":"_finish");
                Node src = (Node) net.getPetriElements().stream().filter(n->n instanceof Node).filter(n->((Node)n).getName().equals(pred)).findFirst().get();
                Node trg = (Node) net.getPetriElements().stream().filter(n->n instanceof Node).filter(n->((Node)n).getName().equals(succ)).findFirst().get();
                Arc r = f.createArc(); r.setWeight(1); r.setIsReadArc(true); r.setSource(src); r.setTarget(trg); net.getPetriElements().add(r);

            } else if (pe instanceof Ressource) {
                Ressource res = (Ressource) pe;
                Place pr = f.createPlace();
                pr.setName(res.getName()+ "_resource");
                pr.setMarking(res.getQuantity());
                net.getPetriElements().add(pr);

            }
        });

        // Sauver
        try { out.save(Collections.EMPTY_MAP); System.out.println("Réseau généré: " + modelPath);
        } catch(IOException ex){ ex.printStackTrace(); }
    }

    public static void main(String[] args) {
    	System.out.println("[DEBUG] Starting main, args length=" + args.length);
        if (args.length!=2) throw new IllegalArgumentException("Usage: java SimplePDL2PetriNetEMF <in.simplepdl> <out.petri>");
        Process p = loadProcess(args[0]);
        generatePetriNet(p, args[1]);
    }
}
