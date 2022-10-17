package patterns.birbs;

public class Duck {

	private String noise;
	private Double stamina;

	public Duck(String noise, Double stamina) {
		this.noise = noise;
		this.stamina = stamina;
	}

	public String Quack() {
		return noise;
	}

	public Double Fly() {
		return stamina;
	}

	// Setters and Getters
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public Double getStamina() {
		return stamina;
	}

	public void setStamina(Double stamina) {
		this.stamina = stamina;
	}

}
