package Org.Behaviour.Command.Action;

import Org.Behavior.Command.CommandInterface.Command;

public class Waiter {
	
	Command command;
	
	public Waiter(Command command) {
		this.command = command;
	}
	
	public void order() {
		command.execute();
	}
	

}
