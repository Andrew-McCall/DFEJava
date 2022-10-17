package patterns.adapter;

public class SquarePegAsRoundAdapter extends RoundPeg {

	public SquarePegAsRoundAdapter(SquarePeg peg) {
		super(Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
	}

	public SquarePegAsRoundAdapter(double width) {
		super(Math.sqrt(Math.pow((width / 2), 2) * 2));
	}

}
