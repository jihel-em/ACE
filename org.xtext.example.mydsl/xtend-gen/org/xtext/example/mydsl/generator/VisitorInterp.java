package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class VisitorInterp implements Visitor {
  private Scanner scanner;
  
  private String userInput;
  
  private State currentState;
  
  private State validTransitionState;
  
  @Override
  public StringBuilder visitFSM(final FSM f) {
    StringBuilder res = new StringBuilder();
    String name = f.getName();
    EList<State> _state = f.getState();
    for (final State s : _state) {
      this.accept(s, this);
    }
    Scanner _scanner = new Scanner(System.in);
    this.scanner = _scanner;
    System.out.println("Veuillez entrer un mot-clef pour lancer une transition.");
    this.userInput = this.scanner.nextLine();
    while ((!Objects.equal(this.userInput, "EXIT FSM"))) {
      {
        EList<Transition> _transition = f.getTransition();
        for (final Transition t : _transition) {
          this.accept(t, this);
        }
        if ((this.validTransitionState != null)) {
          this.currentState = this.validTransitionState;
          String _entry = this.currentState.getEntry();
          String _plus = ("Entry :" + _entry);
          System.out.println(_plus);
          this.validTransitionState = null;
        } else {
          System.out.println("No valid entry found.");
        }
        this.userInput = this.scanner.nextLine();
      }
    }
    return res;
  }
  
  @Override
  public StringBuilder visitState(final State s) {
    boolean _isIsInitState = s.isIsInitState();
    if (_isIsInitState) {
      if ((this.currentState != null)) {
        System.out.println("You declared several init states for a same FSM.");
      } else {
        this.currentState = s;
        String _entry = s.getEntry();
        String _plus = ("Initial entry: " + _entry);
        System.out.println(_plus);
      }
    }
    return new StringBuilder();
  }
  
  @Override
  public StringBuilder visitTransition(final Transition t) {
    if ((Objects.equal(t.getInput(), this.userInput) && Objects.equal(t.getStart_state(), this.currentState))) {
      if ((this.validTransitionState != null)) {
        System.out.println("Non determinism");
      } else {
        this.validTransitionState = t.getEnd_state();
      }
    }
    return new StringBuilder();
  }
  
  public StringBuilder accept(final State state, final VisitorInterp v) {
    return v.visitState(state);
  }
  
  public StringBuilder accept(final Transition transition, final VisitorInterp v) {
    return v.visitTransition(transition);
  }
}
