package patterns.birbs;

public class TukeryAsDuckApdater extends Duck {

	private Turkey turkey;

	public TukeryAsDuckApdater(Turkey turkey) {
		super("", turkey.getStamina());
		this.turkey = turkey;
	}

	@Override
	public String Quack() {
		return "*Quack* " + turkey.Gobble() + " *Quack*";
	}

}
