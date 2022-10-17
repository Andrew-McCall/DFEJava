package patterns.birbs.exercise;

public class DuckAdapter implements Turkey {

	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		duck.fly();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

}
