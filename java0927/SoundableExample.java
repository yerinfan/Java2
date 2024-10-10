package java0927;

public class SoundableExample {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "몽멍";
	}

}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "야옹";
	}

}

interface Soundable {
	public String sound();
}