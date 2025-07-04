/*
 * generated by Xtext 2.38.0
 */
package fr.n7.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.ide.contentassist.antlr.internal.InternalPDL1Parser;
import fr.n7.services.PDL1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PDL1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PDL1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PDL1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProcessElementAccess().getAlternatives(), "rule__ProcessElement__Alternatives");
			builder.put(grammarAccess.getWorkSequenceTypeAccess().getAlternatives(), "rule__WorkSequenceType__Alternatives");
			builder.put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup(), "rule__WorkDefinition__Group__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup_2(), "rule__WorkDefinition__Group_2__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup_2_1(), "rule__WorkDefinition__Group_2_1__0");
			builder.put(grammarAccess.getAllocationRessourceAccess().getGroup(), "rule__AllocationRessource__Group__0");
			builder.put(grammarAccess.getRessourceAccess().getGroup(), "rule__Ressource__Group__0");
			builder.put(grammarAccess.getWorkSequenceAccess().getGroup(), "rule__WorkSequence__Group__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup(), "rule__Guidance__Group__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup_2(), "rule__Guidance__Group_2__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup_2_2(), "rule__Guidance__Group_2_2__0");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
			builder.put(grammarAccess.getProcessAccess().getProcessElementsAssignment_3(), "rule__Process__ProcessElementsAssignment_3");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1(), "rule__WorkDefinition__NameAssignment_1");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_0(), "rule__WorkDefinition__NeedsAssignment_2_0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_1_1(), "rule__WorkDefinition__NeedsAssignment_2_1_1");
			builder.put(grammarAccess.getAllocationRessourceAccess().getResourceAssignment_1(), "rule__AllocationRessource__ResourceAssignment_1");
			builder.put(grammarAccess.getAllocationRessourceAccess().getNbRessourceAssignment_2(), "rule__AllocationRessource__NbRessourceAssignment_2");
			builder.put(grammarAccess.getRessourceAccess().getNameAssignment_1(), "rule__Ressource__NameAssignment_1");
			builder.put(grammarAccess.getRessourceAccess().getNbRessourceDisponibleAssignment_2(), "rule__Ressource__NbRessourceDisponibleAssignment_2");
			builder.put(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1(), "rule__WorkSequence__LinkTypeAssignment_1");
			builder.put(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3(), "rule__WorkSequence__PredecessorAssignment_3");
			builder.put(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5(), "rule__WorkSequence__SuccessorAssignment_5");
			builder.put(grammarAccess.getGuidanceAccess().getTexteAssignment_1(), "rule__Guidance__TexteAssignment_1");
			builder.put(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1(), "rule__Guidance__ElementsAssignment_2_1");
			builder.put(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1(), "rule__Guidance__ElementsAssignment_2_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PDL1GrammarAccess grammarAccess;

	@Override
	protected InternalPDL1Parser createParser() {
		InternalPDL1Parser result = new InternalPDL1Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PDL1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
