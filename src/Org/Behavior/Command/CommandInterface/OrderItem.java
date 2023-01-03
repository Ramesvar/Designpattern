package Org.Behavior.Command.CommandInterface;

import Org.Behaviour.Command.Item;

public class OrderItem implements Command {
	
	Item item;
	
	public OrderItem(Item item) {
		this.item = item;
	}
	
	public void execute() {
		item.prepare();
	}

}
