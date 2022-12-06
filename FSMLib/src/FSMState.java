import java.util.HashMap;
import java.util.Map;

public class FSMState {
	FSMContext context;
	public String entry;
	Map<String,FSMTransition> transitions;
	
	FSMState(FSMContext context, String entry){
		this.context = context;
		this.entry = entry;
		this.transitions = new HashMap<String,FSMTransition>();
	}
	
	void addTransition(String input, String name, FSMState end_state) {
		transitions.put(input, new FSMTransition(name, end_state));
	}
	
	//Si input est la clef d'une transition, alors on l'effectue.
	public void transition(String input) {
		if (transitions.containsKey(input)){
			FSMTransition t = transitions.get(input);
			FSMState s = t.getEndState();
			context.changeState(s);
		}
		else {
			System.out.println("\"" + input + "\" is not a valid input for the current state.");
		}
		
	}

	//On repr�sente les transitions comme un couple (nom, �tat d'arriv�e) li� � une clef, qui est l'input d�clencheur de la transition.
	//On ne pr�cise pas l'�tat de d�part, car chaque transition est contenue dans son �tat de d�part (FSMState.transitions).
	class FSMTransition{
		private String name;
		private FSMState end_state;
		
		FSMTransition(String name, FSMState end_state){
			this.name = name;
			this.end_state = end_state;
		}
		
		public String getName() {
			return name;
		}
		public FSMState getEndState() {
			return end_state;
		}
	}
}
