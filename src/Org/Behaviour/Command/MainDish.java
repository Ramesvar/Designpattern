package Org.Behaviour.Command;

public class MainDish implements Item {

	@Override
	public void prepare() {
		System.out.println("Main dish is prepared");
		
	}

	@Override
	public void cancel() {
		System.out.println("Main dish is cancelled");
		
	}
	
	
}
