/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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

// Entry rule entryRuleFSM
entryRuleFSM
:
{ before(grammarAccess.getFSMRule()); }
	 ruleFSM
{ after(grammarAccess.getFSMRule()); } 
	 EOF 
;

// Rule FSM
ruleFSM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFSMAccess().getGroup()); }
		(rule__FSM__Group__0)
		{ after(grammarAccess.getFSMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getStateAssignment_3_0()); }
		(rule__FSM__StateAssignment_3_0)
		{ after(grammarAccess.getFSMAccess().getStateAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getFSMAccess().getTransitionAssignment_3_1()); }
		(rule__FSM__TransitionAssignment_3_1)
		{ after(grammarAccess.getFSMAccess().getTransitionAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__0__Impl
	rule__FSM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getFSMAction_0()); }
	()
	{ after(grammarAccess.getFSMAccess().getFSMAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__1__Impl
	rule__FSM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getFsmKeyword_1()); }
	'fsm'
	{ after(grammarAccess.getFSMAccess().getFsmKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__2__Impl
	rule__FSM__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getNameAssignment_2()); }
	(rule__FSM__NameAssignment_2)
	{ after(grammarAccess.getFSMAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getAlternatives_3()); }
	(rule__FSM__Alternatives_3)*
	{ after(grammarAccess.getFSMAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateAction_0()); }
	()
	{ after(grammarAccess.getStateAccess().getStateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'state'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getIsInitStateAssignment_2()); }
	(rule__State__IsInitStateAssignment_2)?
	{ after(grammarAccess.getStateAccess().getIsInitStateAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_3()); }
	(rule__State__NameAssignment_3)
	{ after(grammarAccess.getStateAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_4()); }
	(rule__State__Group_4__0)?
	{ after(grammarAccess.getStateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__0__Impl
	rule__State__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getEntryKeyword_4_0()); }
	'entry'
	{ after(grammarAccess.getStateAccess().getEntryKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getEntryAssignment_4_1()); }
	(rule__State__EntryAssignment_4_1)
	{ after(grammarAccess.getStateAccess().getEntryAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
	'transition'
	{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getInputAssignment_1()); }
	(rule__Transition__InputAssignment_1)
	{ after(grammarAccess.getTransitionAccess().getInputAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getStart_stateAssignment_2()); }
	(rule__Transition__Start_stateAssignment_2)
	{ after(grammarAccess.getTransitionAccess().getStart_stateAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getEnd_stateAssignment_4()); }
	(rule__Transition__End_stateAssignment_4)
	{ after(grammarAccess.getTransitionAccess().getEnd_stateAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_5()); }
	'['
	{ after(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
	rule__Transition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getNameAssignment_6()); }
	(rule__Transition__NameAssignment_6)
	{ after(grammarAccess.getTransitionAccess().getNameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_7()); }
	']'
	{ after(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FSM__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__StateAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_0()); }
		ruleState
		{ after(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__TransitionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_0()); }
		ruleTransition
		{ after(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__IsInitStateAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getIsInitStateInitKeyword_2_0()); }
		(
			{ before(grammarAccess.getStateAccess().getIsInitStateInitKeyword_2_0()); }
			'init'
			{ after(grammarAccess.getStateAccess().getIsInitStateInitKeyword_2_0()); }
		)
		{ after(grammarAccess.getStateAccess().getIsInitStateInitKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__EntryAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getEntryEStringParserRuleCall_4_1_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getEntryEStringParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__InputAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Start_stateAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getStart_stateStateCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getStart_stateStateEStringParserRuleCall_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getStart_stateStateEStringParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getStart_stateStateCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__End_stateAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getEnd_stateStateCrossReference_4_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getEnd_stateStateEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getEnd_stateStateEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getEnd_stateStateCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__NameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_6_0()); }
		ruleEString
		{ after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_6_0()); }
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
