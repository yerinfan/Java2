package java0913;

public class myCat {
	public static void main(String[] args) {
		Cat c = new Cat("코숏");
		c = new Cat("코숏", "노랑");
		c = new Cat("코숏", "노랑", 5);
		
		c.eat("점심");
		c.meow();
		c.scratch();;
	}
	
}

class Cat {
	private String breed;
	private String color;
	private int age;
	
	public Cat(String breed) {
		this.breed = breed;
		System.out.printf("나의 고양이는 %s입니다.\n", breed);
	}
	
	public Cat(String breed, String color) {
		this.breed = breed;
		this.color = color;
		System.out.printf("나의 고양이는 %s %s입니다.\n", color, breed);
	}
	
	public Cat(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
		System.out.printf("나의 고양이는 %d살 %s %s입니다.\n", age, color, breed);
	}
	
	public void eat(String time) {
		System.out.printf("%s에 사료를 먹습니다.\n", time);
	}
	
	public void meow() {
		System.out.println("야옹~");
	}
	
	public void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}