package patterns;

import patterns.builder.Account;
import patterns.builder.Trainer;

public class Main {

	public static void main(String[] args) {

		Trainer trainer = new Trainer.Builder().age(20).tech("Java").name("Andrew").buildTrainer();
		System.out.println(trainer);

		System.out
				.println(new Account.AccountBuilder().owner("Andrew").branch("Branch").balance(9999.0).buildAccount());
	}

}
