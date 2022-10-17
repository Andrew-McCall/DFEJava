package patterns;

import patterns.builder.Trainer;
import patterns.builder.Trainer.Builder;

public class Main {

	public static void main(String[] args) {
//
//		Trainer trainer1 = new Trainer("Andrew", 20, "Java");
//		System.out.println(trainer1);

//		Trainer trainer2 = new TrainerBuilder().buildTrainee();
//		System.out.println(trainer2);

//		Trainer trainer3 = new TrainerBuilder().name("Name").buildTrainee();
//		System.out.println(trainer3);
//
//		Trainer trainer4 = new TrainerBuilder().age(-18).tech("Java").name("Name").buildTrainee();
//		System.out.println(trainer4);

//		Trainer trainer5 = new TrainerBuilder().tech("Java").name("Name").buildTrainee();
//		System.out.println(trainer5);

//		TrainerBuilder builder = new TrainerBuilder();
//
//		builder = builder.name("Andrew");
//
//		builder = builder.age(22);
//
//		builder = builder.tech("String");
//
//		Trainer trainer6 = builder.buildTrainer();
//		System.out.println(trainer6);

		Trainer trainer = new Builder().age(20).tech("Java").name("Andrew").buildTrainer();
		System.out.println(trainer);
	}

}
