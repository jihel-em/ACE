import java.util.Scanner;

public class FSMContext {
	FSMState currentState;
	
	FSMContext(FSMState initState){
		currentState = initState;
	}
	
	FSMContext(){}
	
	void changeState(FSMState newState) {
		currentState = newState;
	}
	
	void transition(String input) {
		currentState.transition(input);
	}
	
	//On r�cup�re un input de l'utilisateur, puis on essaie de changer d'�tat.
	void getInput(String input) {
		currentState.transition(input);
	}
	
}