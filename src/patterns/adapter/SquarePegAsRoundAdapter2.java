package patterns.adapter;

public class SquarePegAsRoundAdapter2 extends RoundPeg {

	private SquarePeg peg;

	public SquarePegAsRoundAdapter2(double width) {
		super();
		this.peg = new SquarePeg(width);
	}

	public SquarePegAsRoundAdapter2(SquarePeg peg) {
		super();
		this.peg = peg;
	}

	@Override
	public double getRadius() {
		return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
	}

	public SquarePeg getPeg() {
		return peg;
	}

	public void setPeg(SquarePeg peg) {
		this.peg = peg;
	}

}
