package Org.Behaviour.Command;

public class Dessert implements Item{

	@Override
	public void prepare() {
		System.out.println("Dessert is prepared");
		
	}

	@Override
	public void cancel() {
		System.out.println("Dessert is cancelled");
		
	}

}
