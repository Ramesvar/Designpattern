package Org.Behavior.Command.CommandInterface;

import Org.Behaviour.Command.Item;

public class CancelItem implements Command{

	Item item;
	
	public CancelItem(Item item) {
		this.item = item;
	}

	public void execute() {
		item.cancel();
		
	}




}
