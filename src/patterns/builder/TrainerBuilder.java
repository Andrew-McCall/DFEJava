package patterns.builder;

public class TrainerBuilder {

	private String name;
	private int age = 18;
	private String tech = "N/A";

	public TrainerBuilder() {
		super();
	}

	// Builder Setters
	public TrainerBuilder name(String name) {
		this.name = name;
		return this;
	}

	public TrainerBuilder age(int age) {
		this.age = age;
		return this;
	}

	public TrainerBuilder tech(String tech) {
		this.tech = tech;
		return this;
	}

	public Trainer buildTrainer() {
		return new Trainer(name, age, tech);
	}
}
