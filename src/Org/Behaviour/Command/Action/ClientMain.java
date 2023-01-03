package Org.Behaviour.Command.Action;

import Org.Behavior.Command.CommandInterface.*;
import Org.Behaviour.Command.Item;
import Org.Behaviour.Command.MainDish;

public class ClientMain {
	
		public static void main(String args[]) {
			
			Item item = new MainDish();
			Waiter waiter = new Waiter(new CancelItem(item));
			waiter.order();
			
		}
}
