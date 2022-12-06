package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class VisitorCompil implements Visitor {
  private final String NEWLINE = "\r\n";
  
  private final String TAB = "\t";
  
  private int numState = 0;
  
  private int numStateInit = (-1);
  
  private HashMap<String, Integer> mapState = new HashMap<String, Integer>();
  
  @Override
  public StringBuilder visitFSM(final FSM f) {
    String name = f.getName();
    StringBuilder res = new StringBuilder();
    res.append((("import java.util.Scanner;" + this.NEWLINE) + this.NEWLINE));
    res.append((((((((((("public class " + name) + " {") + this.NEWLINE) + 
      this.TAB) + "public static void main(String[] args) {") + this.NEWLINE) + 
      this.TAB) + this.TAB) + "//Initialization") + this.NEWLINE));
    res.append((((this.TAB + this.TAB) + "//We start by creating the context.") + this.NEWLINE));
    res.append(((((this.TAB + this.TAB) + "FSMContext context = new FSMContext();") + this.NEWLINE) + this.NEWLINE));
    res.append((((this.TAB + this.TAB) + "//Then we create the states.") + this.NEWLINE));
    EList<State> _state = f.getState();
    for (final State s : _state) {
      res.append(this.accept(s, this));
    }
    res.append(this.NEWLINE);
    res.append((((this.TAB + this.TAB) + "//We put the init state into the context.") + this.NEWLINE));
    res.append(((((((this.TAB + this.TAB) + "context.changeState(s") + Integer.valueOf(this.numStateInit)) + ");") + this.NEWLINE) + this.NEWLINE));
    res.append((((this.TAB + this.TAB) + "//We create the transitions.") + this.NEWLINE));
    EList<Transition> _transition = f.getTransition();
    for (final Transition t : _transition) {
      res.append(this.accept(t, this));
    }
    res.append(this.NEWLINE);
    res.append((((((((((((((((((((((((((((((this.TAB + this.TAB) + "//Main") + this.NEWLINE) + 
      this.TAB) + this.TAB) + "Scanner scanner = new Scanner(System.in);") + this.NEWLINE) + 
      this.TAB) + this.TAB) + "while(true) {") + this.NEWLINE) + 
      this.TAB) + this.TAB) + this.TAB) + "context.getInput(scanner.nextLine());") + this.NEWLINE) + 
      this.TAB) + this.TAB) + this.TAB) + "System.out.println(\"Enter the fire condition of a transition.\");") + this.NEWLINE) + 
      this.TAB) + this.TAB) + "}") + this.NEWLINE) + 
      this.TAB) + "}") + this.NEWLINE) + 
      "}"));
    return res;
  }
  
  @Override
  public StringBuilder visitState(final State s) {
    String entry = s.getEntry();
    String name = s.getName();
    boolean init = s.isIsInitState();
    int numCurrentState = (-1);
    boolean _containsKey = this.mapState.containsKey(name);
    boolean _not = (!_containsKey);
    if (_not) {
      this.mapState.put(name, Integer.valueOf(this.numState));
    }
    if (init) {
      if ((this.numStateInit != (-1))) {
        System.out.println((((("Attention ! Plus d\'un état est désigné comme initial !" + this.NEWLINE) + 
          "L\'état ") + Integer.valueOf(this.numStateInit)) + " est gardé comme état initial."));
      }
      this.numStateInit = this.numState;
    }
    StringBuilder res = new StringBuilder();
    int _plusPlus = this.numState++;
    String _plus = (((this.TAB + this.TAB) + "FSMState s") + Integer.valueOf(_plusPlus));
    String _plus_1 = (_plus + " = new FSMState(context, \"");
    String _plus_2 = (_plus_1 + entry);
    String _plus_3 = (_plus_2 + "\");");
    String _plus_4 = (_plus_3 + this.NEWLINE);
    res.append(_plus_4);
    return res;
  }
  
  @Override
  public StringBuilder visitTransition(final Transition t) {
    String input = t.getInput();
    String name = t.getName();
    String end_state = t.getEnd_state().getName();
    int num_end_state = (-1);
    boolean _containsKey = this.mapState.containsKey(end_state);
    if (_containsKey) {
      num_end_state = (this.mapState.get(end_state)).intValue();
    } else {
      int _plusPlus = this.numState++;
      num_end_state = _plusPlus;
      this.mapState.put(end_state, Integer.valueOf(num_end_state));
    }
    String start_state = t.getStart_state().getName();
    int num_start_state = (-1);
    boolean _containsKey_1 = this.mapState.containsKey(start_state);
    if (_containsKey_1) {
      num_start_state = (this.mapState.get(start_state)).intValue();
    } else {
      int _plusPlus_1 = this.numState++;
      num_start_state = _plusPlus_1;
      this.mapState.put(start_state, Integer.valueOf(num_start_state));
    }
    StringBuilder res = new StringBuilder();
    res.append((((((((((((this.TAB + this.TAB) + "s") + Integer.valueOf(num_start_state)) + ".addTransition(\"") + input) + "\", \"") + name) + "\", s") + Integer.valueOf(num_end_state)) + ");") + this.NEWLINE));
    return res;
  }
  
  public StringBuilder accept(final State state, final VisitorCompil v) {
    return v.visitState(state);
  }
  
  public StringBuilder accept(final Transition transition, final VisitorCompil v) {
    return v.visitTransition(transition);
  }
}
