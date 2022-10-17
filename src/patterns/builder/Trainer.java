package patterns.builder;

public class Trainer {

	public static class Builder {
		private String name;
		private int age = 18;
		private String tech = "N/A";

		public Trainer buildTrainer() {
			Trainer trainer = new Trainer(name, age, tech);
//			Trainer trainer = new Trainer();
//			trainer.age = age;
//			trainer.name = name;
//			trainer.tech = tech;
			return trainer;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder tech(String tech) {
			this.tech = tech;
			return this;
		}

	}

	private String name;
	private int age;
	private String tech;

	public Trainer() {
		super();
	}

	public Trainer(String name, int age, String tech) {
		this.name = name;
		this.age = age;
		this.tech = tech;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", age=" + age + ", tech=" + tech + "]";
	}
}
