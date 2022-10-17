package patterns.stratgry.exercises;

public class Translator {

	private Language language = new English();

	public Translator() {
	}

	public String getName() {
		return language.Name();
	}

	public String getHello() {
		return language.Hello();
	}

	public String getFarewell() {
		return language.Farewell();
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}
