/**
 * generated by Xtext 2.38.0
 */
package fr.n7.pDL1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.pDL1.PDL1Factory
 * @model kind="package"
 * @generated
 */
public interface PDL1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pDL1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.n7.fr/PDL1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pDL1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDL1Package eINSTANCE = fr.n7.pDL1.impl.PDL1PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.ProcessImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.ProcessElementImpl <em>Process Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.ProcessElementImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getProcessElement()
   * @generated
   */
  int PROCESS_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Process Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.WorkDefinitionImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Needs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NEEDS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.AllocationRessourceImpl <em>Allocation Ressource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.AllocationRessourceImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getAllocationRessource()
   * @generated
   */
  int ALLOCATION_RESSOURCE = 3;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION_RESSOURCE__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Nb Ressource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION_RESSOURCE__NB_RESSOURCE = 1;

  /**
   * The number of structural features of the '<em>Allocation Ressource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION_RESSOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.RessourceImpl <em>Ressource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.RessourceImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getRessource()
   * @generated
   */
  int RESSOURCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nb Ressource Disponible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__NB_RESSOURCE_DISPONIBLE = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ressource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.WorkSequenceImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkSequence()
   * @generated
   */
  int WORK_SEQUENCE = 5;

  /**
   * The feature id for the '<em><b>Link Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__PREDECESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__SUCCESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Work Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.impl.GuidanceImpl
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 6;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXTE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__ELEMENTS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL1.WorkSequenceType <em>Work Sequence Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.pDL1.WorkSequenceType
   * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkSequenceType()
   * @generated
   */
  int WORK_SEQUENCE_TYPE = 7;


  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see fr.n7.pDL1.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL1.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.pDL1.Process#getProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Elements</em>'.
   * @see fr.n7.pDL1.Process#getProcessElements()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElements();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Element</em>'.
   * @see fr.n7.pDL1.ProcessElement
   * @generated
   */
  EClass getProcessElement();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see fr.n7.pDL1.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.WorkDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL1.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.pDL1.WorkDefinition#getNeeds <em>Needs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Needs</em>'.
   * @see fr.n7.pDL1.WorkDefinition#getNeeds()
   * @see #getWorkDefinition()
   * @generated
   */
  EReference getWorkDefinition_Needs();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.AllocationRessource <em>Allocation Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocation Ressource</em>'.
   * @see fr.n7.pDL1.AllocationRessource
   * @generated
   */
  EClass getAllocationRessource();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL1.AllocationRessource#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see fr.n7.pDL1.AllocationRessource#getResource()
   * @see #getAllocationRessource()
   * @generated
   */
  EReference getAllocationRessource_Resource();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.AllocationRessource#getNbRessource <em>Nb Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nb Ressource</em>'.
   * @see fr.n7.pDL1.AllocationRessource#getNbRessource()
   * @see #getAllocationRessource()
   * @generated
   */
  EAttribute getAllocationRessource_NbRessource();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.Ressource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ressource</em>'.
   * @see fr.n7.pDL1.Ressource
   * @generated
   */
  EClass getRessource();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.Ressource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL1.Ressource#getName()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.Ressource#getNbRessourceDisponible <em>Nb Ressource Disponible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nb Ressource Disponible</em>'.
   * @see fr.n7.pDL1.Ressource#getNbRessourceDisponible()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_NbRessourceDisponible();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence</em>'.
   * @see fr.n7.pDL1.WorkSequence
   * @generated
   */
  EClass getWorkSequence();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.WorkSequence#getLinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Type</em>'.
   * @see fr.n7.pDL1.WorkSequence#getLinkType()
   * @see #getWorkSequence()
   * @generated
   */
  EAttribute getWorkSequence_LinkType();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL1.WorkSequence#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.n7.pDL1.WorkSequence#getPredecessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Predecessor();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL1.WorkSequence#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see fr.n7.pDL1.WorkSequence#getSuccessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Successor();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL1.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see fr.n7.pDL1.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL1.Guidance#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see fr.n7.pDL1.Guidance#getTexte()
   * @see #getGuidance()
   * @generated
   */
  EAttribute getGuidance_Texte();

  /**
   * Returns the meta object for the reference list '{@link fr.n7.pDL1.Guidance#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see fr.n7.pDL1.Guidance#getElements()
   * @see #getGuidance()
   * @generated
   */
  EReference getGuidance_Elements();

  /**
   * Returns the meta object for enum '{@link fr.n7.pDL1.WorkSequenceType <em>Work Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Sequence Type</em>'.
   * @see fr.n7.pDL1.WorkSequenceType
   * @generated
   */
  EEnum getWorkSequenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDL1Factory getPDL1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.ProcessImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.ProcessElementImpl <em>Process Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.ProcessElementImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getProcessElement()
     * @generated
     */
    EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.WorkDefinitionImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DEFINITION__NEEDS = eINSTANCE.getWorkDefinition_Needs();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.AllocationRessourceImpl <em>Allocation Ressource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.AllocationRessourceImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getAllocationRessource()
     * @generated
     */
    EClass ALLOCATION_RESSOURCE = eINSTANCE.getAllocationRessource();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALLOCATION_RESSOURCE__RESOURCE = eINSTANCE.getAllocationRessource_Resource();

    /**
     * The meta object literal for the '<em><b>Nb Ressource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOCATION_RESSOURCE__NB_RESSOURCE = eINSTANCE.getAllocationRessource_NbRessource();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.RessourceImpl <em>Ressource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.RessourceImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getRessource()
     * @generated
     */
    EClass RESSOURCE = eINSTANCE.getRessource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__NAME = eINSTANCE.getRessource_Name();

    /**
     * The meta object literal for the '<em><b>Nb Ressource Disponible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__NB_RESSOURCE_DISPONIBLE = eINSTANCE.getRessource_NbRessourceDisponible();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.WorkSequenceImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkSequence()
     * @generated
     */
    EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

    /**
     * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE__LINK_TYPE = eINSTANCE.getWorkSequence_LinkType();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.impl.GuidanceImpl
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUIDANCE__TEXTE = eINSTANCE.getGuidance_Texte();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUIDANCE__ELEMENTS = eINSTANCE.getGuidance_Elements();

    /**
     * The meta object literal for the '{@link fr.n7.pDL1.WorkSequenceType <em>Work Sequence Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.pDL1.WorkSequenceType
     * @see fr.n7.pDL1.impl.PDL1PackageImpl#getWorkSequenceType()
     * @generated
     */
    EEnum WORK_SEQUENCE_TYPE = eINSTANCE.getWorkSequenceType();

  }

} //PDL1Package
