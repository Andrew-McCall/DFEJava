package patterns.adapter;

public class RoundHole {

	private RoundPeg peg;
	private double holeRadius;

	public RoundHole(double holeRadius) {
		this.holeRadius = holeRadius;
	}

	public RoundHole(double holeRadius, RoundPeg peg) {
		this.peg = peg;
		this.holeRadius = holeRadius;
	}

	public boolean fit() {
		return peg.getRadius() <= holeRadius;
	}

	public RoundPeg getPeg() {
		return peg;
	}

	public void setPeg(RoundPeg peg) {
		this.peg = peg;
	}

}
