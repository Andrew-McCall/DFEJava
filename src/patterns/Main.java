package patterns;

import patterns.birbs.exercise.Duck;
import patterns.birbs.exercise.TurkeyAdapter;
import patterns.birbs.exercise.WildTurkey;

public class Main {

	public static void main(String[] args) {

		Duck duck = new TurkeyAdapter(new WildTurkey());
		duck.quack();

	}

}
