/*
 * generated by Xtext 2.38.0
 */
grammar InternalPDL1;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.n7.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.n7.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.services.PDL1GrammarAccess;

}
@parser::members {
	private PDL1GrammarAccess grammarAccess;

	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleProcess
entryRuleProcess
:
{ before(grammarAccess.getProcessRule()); }
	 ruleProcess
{ after(grammarAccess.getProcessRule()); } 
	 EOF 
;

// Rule Process
ruleProcess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcessAccess().getGroup()); }
		(rule__Process__Group__0)
		{ after(grammarAccess.getProcessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProcessElement
entryRuleProcessElement
:
{ before(grammarAccess.getProcessElementRule()); }
	 ruleProcessElement
{ after(grammarAccess.getProcessElementRule()); } 
	 EOF 
;

// Rule ProcessElement
ruleProcessElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcessElementAccess().getAlternatives()); }
		(rule__ProcessElement__Alternatives)
		{ after(grammarAccess.getProcessElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition
:
{ before(grammarAccess.getWorkDefinitionRule()); }
	 ruleWorkDefinition
{ after(grammarAccess.getWorkDefinitionRule()); } 
	 EOF 
;

// Rule WorkDefinition
ruleWorkDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getGroup()); }
		(rule__WorkDefinition__Group__0)
		{ after(grammarAccess.getWorkDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAllocationRessource
entryRuleAllocationRessource
:
{ before(grammarAccess.getAllocationRessourceRule()); }
	 ruleAllocationRessource
{ after(grammarAccess.getAllocationRessourceRule()); } 
	 EOF 
;

// Rule AllocationRessource
ruleAllocationRessource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAllocationRessourceAccess().getGroup()); }
		(rule__AllocationRessource__Group__0)
		{ after(grammarAccess.getAllocationRessourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRessource
entryRuleRessource
:
{ before(grammarAccess.getRessourceRule()); }
	 ruleRessource
{ after(grammarAccess.getRessourceRule()); } 
	 EOF 
;

// Rule Ressource
ruleRessource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRessourceAccess().getGroup()); }
		(rule__Ressource__Group__0)
		{ after(grammarAccess.getRessourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence
:
{ before(grammarAccess.getWorkSequenceRule()); }
	 ruleWorkSequence
{ after(grammarAccess.getWorkSequenceRule()); } 
	 EOF 
;

// Rule WorkSequence
ruleWorkSequence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getGroup()); }
		(rule__WorkSequence__Group__0)
		{ after(grammarAccess.getWorkSequenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGuidance
entryRuleGuidance
:
{ before(grammarAccess.getGuidanceRule()); }
	 ruleGuidance
{ after(grammarAccess.getGuidanceRule()); } 
	 EOF 
;

// Rule Guidance
ruleGuidance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuidanceAccess().getGroup()); }
		(rule__Guidance__Group__0)
		{ after(grammarAccess.getGuidanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule WorkSequenceType
ruleWorkSequenceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
		(rule__WorkSequenceType__Alternatives)
		{ after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProcessElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
		ruleWorkDefinition
		{ after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); }
		ruleWorkSequence
		{ after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); }
		ruleGuidance
		{ after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); }
		ruleRessource
		{ after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
		('s2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
		('f2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
		('s2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
		('f2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__0__Impl
	rule__Process__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
	'process'
	{ after(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__1__Impl
	rule__Process__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getNameAssignment_1()); }
	(rule__Process__NameAssignment_1)
	{ after(grammarAccess.getProcessAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__2__Impl
	rule__Process__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__3__Impl
	rule__Process__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
	(rule__Process__ProcessElementsAssignment_3)*
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__0__Impl
	rule__WorkDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }
	'wd'
	{ after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__1__Impl
	rule__WorkDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
	(rule__WorkDefinition__NameAssignment_1)
	{ after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getGroup_2()); }
	(rule__WorkDefinition__Group_2__0)?
	{ after(grammarAccess.getWorkDefinitionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group_2__0__Impl
	rule__WorkDefinition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_0()); }
	(rule__WorkDefinition__NeedsAssignment_2_0)
	{ after(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getGroup_2_1()); }
	(rule__WorkDefinition__Group_2_1__0)*
	{ after(grammarAccess.getWorkDefinitionAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkDefinition__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group_2_1__0__Impl
	rule__WorkDefinition__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkDefinition__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_1_1()); }
	(rule__WorkDefinition__NeedsAssignment_2_1_1)
	{ after(grammarAccess.getWorkDefinitionAccess().getNeedsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AllocationRessource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllocationRessource__Group__0__Impl
	rule__AllocationRessource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllocationRessourceAccess().getNeedKeyword_0()); }
	'need'
	{ after(grammarAccess.getAllocationRessourceAccess().getNeedKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllocationRessource__Group__1__Impl
	rule__AllocationRessource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllocationRessourceAccess().getResourceAssignment_1()); }
	(rule__AllocationRessource__ResourceAssignment_1)
	{ after(grammarAccess.getAllocationRessourceAccess().getResourceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AllocationRessource__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAllocationRessourceAccess().getNbRessourceAssignment_2()); }
	(rule__AllocationRessource__NbRessourceAssignment_2)
	{ after(grammarAccess.getAllocationRessourceAccess().getNbRessourceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ressource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__0__Impl
	rule__Ressource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getResourceKeyword_0()); }
	'resource'
	{ after(grammarAccess.getRessourceAccess().getResourceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__1__Impl
	rule__Ressource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getNameAssignment_1()); }
	(rule__Ressource__NameAssignment_1)
	{ after(grammarAccess.getRessourceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getNbRessourceDisponibleAssignment_2()); }
	(rule__Ressource__NbRessourceDisponibleAssignment_2)
	{ after(grammarAccess.getRessourceAccess().getNbRessourceDisponibleAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkSequence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__0__Impl
	rule__WorkSequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); }
	'ws'
	{ after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__1__Impl
	rule__WorkSequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
	(rule__WorkSequence__LinkTypeAssignment_1)
	{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__2__Impl
	rule__WorkSequence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); }
	'from'
	{ after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__3__Impl
	rule__WorkSequence__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); }
	(rule__WorkSequence__PredecessorAssignment_3)
	{ after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__4__Impl
	rule__WorkSequence__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); }
	'to'
	{ after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); }
	(rule__WorkSequence__SuccessorAssignment_5)
	{ after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guidance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group__0__Impl
	rule__Guidance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); }
	'note'
	{ after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group__1__Impl
	rule__Guidance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); }
	(rule__Guidance__TexteAssignment_1)
	{ after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getGroup_2()); }
	(rule__Guidance__Group_2__0)?
	{ after(grammarAccess.getGuidanceAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guidance__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group_2__0__Impl
	rule__Guidance__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); }
	'for'
	{ after(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group_2__1__Impl
	rule__Guidance__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); }
	(rule__Guidance__ElementsAssignment_2_1)
	{ after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getGroup_2_2()); }
	(rule__Guidance__Group_2_2__0)*
	{ after(grammarAccess.getGuidanceAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Guidance__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group_2_2__0__Impl
	rule__Guidance__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Guidance__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); }
	(rule__Guidance__ElementsAssignment_2_2_1)
	{ after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Process__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
		ruleProcessElement
		{ after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NeedsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNeedsAllocationRessourceParserRuleCall_2_0_0()); }
		ruleAllocationRessource
		{ after(grammarAccess.getWorkDefinitionAccess().getNeedsAllocationRessourceParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NeedsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNeedsAllocationRessourceParserRuleCall_2_1_1_0()); }
		ruleAllocationRessource
		{ after(grammarAccess.getWorkDefinitionAccess().getNeedsAllocationRessourceParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__ResourceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAllocationRessourceAccess().getResourceRessourceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getAllocationRessourceAccess().getResourceRessourceIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAllocationRessourceAccess().getResourceRessourceIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getAllocationRessourceAccess().getResourceRessourceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AllocationRessource__NbRessourceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAllocationRessourceAccess().getNbRessourceINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAllocationRessourceAccess().getNbRessourceINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__NbRessourceDisponibleAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getNbRessourceDisponibleINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getRessourceAccess().getNbRessourceDisponibleINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__LinkTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
		ruleWorkSequenceType
		{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__PredecessorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__SuccessorAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__TexteAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__ElementsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Guidance__ElementsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
