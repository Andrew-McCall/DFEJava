package patterns;

import patterns.stratgry.exercises.Russian;
import patterns.stratgry.exercises.Translator;

public class Main {

	public static void main(String[] args) {

		Translator translator = new Translator();
		System.out.println(translator.getName());
		System.out.println(translator.getHello());
		System.out.println(translator.getFarewell());

		translator.setLanguage(new Russian());
		System.out.println(translator.getName());
		System.out.println(translator.getHello());
		System.out.println(translator.getFarewell());

	}

}
