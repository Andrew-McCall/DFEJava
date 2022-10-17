package patterns.birbs;

public class Turkey {

	private String noise;
	private Double stamina;

	public Turkey(String noise, Double stamina) {
		this.noise = noise;
		this.stamina = stamina;
	}

	public String Gobble() {
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
