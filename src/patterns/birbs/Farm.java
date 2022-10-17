package patterns.birbs;

public class Farm {

	private Duck duck;

	public double getFenceHight() {
		return duck.getStamina();
	}

	public String getScaredNoise() {
		return duck.Quack();
	}

}
