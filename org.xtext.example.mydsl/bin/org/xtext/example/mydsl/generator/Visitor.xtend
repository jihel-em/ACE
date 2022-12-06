package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.FSM
import fr.ice.fsm.model.fsm.State
import fr.ice.fsm.model.fsm.Transition

interface Visitor {
	def StringBuilder visitFSM(FSM f);
	def StringBuilder visitState(State s);
	def StringBuilder visitTransition(Transition t);
}