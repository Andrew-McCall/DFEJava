package patterns.stratgry.exercises;

public class English implements Language {

	@Override
	public String Name() {
		return "English";
	}

	@Override
	public String Farewell() {
		return "Good Bye";
	}

	@Override
	public String Hello() {
		return "Good Day";
	}

}
