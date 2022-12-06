package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;

@SuppressWarnings("all")
public interface Visitor {
  StringBuilder visitFSM(final FSM f);
  
  StringBuilder visitState(final State s);
  
  StringBuilder visitTransition(final Transition t);
}
