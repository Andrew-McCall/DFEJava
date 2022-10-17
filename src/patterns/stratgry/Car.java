package patterns.stratgry;

public class Car implements Vehicle {

	@Override
	public void Drive() {
		System.out.println("Brrrumb bbrrum");

	}

	@Override
	public void Horn() {
		System.out.println("MEEP MEPP");

	}

}
