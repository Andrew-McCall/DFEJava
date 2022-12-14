package patterns.adapter;

public class SquarePeg {

	private double width;

	public SquarePeg(double width) {
		this.width = width;
	}

	public double getSquare() {
		return width * width;
	}

	public double getWidth() {
		return width;
	}

}
