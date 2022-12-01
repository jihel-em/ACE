/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FSM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFSMAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFsmKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cStateStateParserRuleCall_3_0_0 = (RuleCall)cStateAssignment_3_0.eContents().get(0);
		private final Assignment cTransitionAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_3_1_0 = (RuleCall)cTransitionAssignment_3_1.eContents().get(0);
		
		//FSM returns FSM:
		//    {FSM}
		//    'fsm' name=EString
		//        (state+=State | transition+=Transition)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{FSM}
		//'fsm' name=EString
		//    (state+=State | transition+=Transition)*
		public Group getGroup() { return cGroup; }
		
		//{FSM}
		public Action getFSMAction_0() { return cFSMAction_0; }
		
		//'fsm'
		public Keyword getFsmKeyword_1() { return cFsmKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//(state+=State | transition+=Transition)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//state+=State
		public Assignment getStateAssignment_3_0() { return cStateAssignment_3_0; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_0_0() { return cStateStateParserRuleCall_3_0_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_3_1() { return cTransitionAssignment_3_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_3_1_0() { return cTransitionTransitionParserRuleCall_3_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIsInitStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsInitStateInitKeyword_2_0 = (Keyword)cIsInitStateAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEntryKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cEntryAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cEntryEStringParserRuleCall_4_1_0 = (RuleCall)cEntryAssignment_4_1.eContents().get(0);
		
		//State returns State:
		//    {State}
		//    'state' isInitState?="init" name=EString ('entry' entry=EString)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{State}
		//'state' isInitState?="init" name=EString ('entry' entry=EString)?
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//isInitState?="init"
		public Assignment getIsInitStateAssignment_2() { return cIsInitStateAssignment_2; }
		
		//"init"
		public Keyword getIsInitStateInitKeyword_2_0() { return cIsInitStateInitKeyword_2_0; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//('entry' entry=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'entry'
		public Keyword getEntryKeyword_4_0() { return cEntryKeyword_4_0; }
		
		//entry=EString
		public Assignment getEntryAssignment_4_1() { return cEntryAssignment_4_1; }
		
		//EString
		public RuleCall getEntryEStringParserRuleCall_4_1_0() { return cEntryEStringParserRuleCall_4_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStart_stateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStart_stateStateCrossReference_2_0 = (CrossReference)cStart_stateAssignment_2.eContents().get(0);
		private final RuleCall cStart_stateStateEStringParserRuleCall_2_0_1 = (RuleCall)cStart_stateStateCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEnd_stateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cEnd_stateStateCrossReference_4_0 = (CrossReference)cEnd_stateAssignment_4.eContents().get(0);
		private final RuleCall cEnd_stateStateEStringParserRuleCall_4_0_1 = (RuleCall)cEnd_stateStateCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftSquareBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cInputAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cInputEStringParserRuleCall_5_1_0 = (RuleCall)cInputAssignment_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		
		//Transition returns Transition:
		//    'transition' name=EString
		//        start_state=[State|EString]
		//        '->'
		//        end_state=[State|EString]
		//        ('[' input=EString ']')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' name=EString
		//    start_state=[State|EString]
		//    '->'
		//    end_state=[State|EString]
		//    ('[' input=EString ']')?
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//start_state=[State|EString]
		public Assignment getStart_stateAssignment_2() { return cStart_stateAssignment_2; }
		
		//[State|EString]
		public CrossReference getStart_stateStateCrossReference_2_0() { return cStart_stateStateCrossReference_2_0; }
		
		//EString
		public RuleCall getStart_stateStateEStringParserRuleCall_2_0_1() { return cStart_stateStateEStringParserRuleCall_2_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//end_state=[State|EString]
		public Assignment getEnd_stateAssignment_4() { return cEnd_stateAssignment_4; }
		
		//[State|EString]
		public CrossReference getEnd_stateStateCrossReference_4_0() { return cEnd_stateStateCrossReference_4_0; }
		
		//EString
		public RuleCall getEnd_stateStateEStringParserRuleCall_4_0_1() { return cEnd_stateStateEStringParserRuleCall_4_0_1; }
		
		//('[' input=EString ']')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_5_0() { return cLeftSquareBracketKeyword_5_0; }
		
		//input=EString
		public Assignment getInputAssignment_5_1() { return cInputAssignment_5_1; }
		
		//EString
		public RuleCall getInputEStringParserRuleCall_5_1_0() { return cInputEStringParserRuleCall_5_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5_2() { return cRightSquareBracketKeyword_5_2; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Boolean");
		private final Keyword cInitKeyword = (Keyword)rule.eContents().get(1);
		
		//Boolean returns type::Boolean:
		//    'init' /* TODO: implement this rule and an appropriate IValueConverter */;
		@Override public ParserRule getRule() { return rule; }
		
		//'init'
		public Keyword getInitKeyword() { return cInitKeyword; }
	}
	
	
	private final FSMElements pFSM;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final EStringElements pEString;
	private final BooleanElements pBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFSM = new FSMElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pEString = new EStringElements();
		this.pBoolean = new BooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FSM returns FSM:
	//    {FSM}
	//    'fsm' name=EString
	//        (state+=State | transition+=Transition)*
	//;
	public FSMElements getFSMAccess() {
		return pFSM;
	}
	
	public ParserRule getFSMRule() {
		return getFSMAccess().getRule();
	}
	
	//State returns State:
	//    {State}
	//    'state' isInitState?="init" name=EString ('entry' entry=EString)?
	//;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition returns Transition:
	//    'transition' name=EString
	//        start_state=[State|EString]
	//        '->'
	//        end_state=[State|EString]
	//        ('[' input=EString ']')?
	//;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Boolean returns type::Boolean:
	//    'init' /* TODO: implement this rule and an appropriate IValueConverter */;
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
