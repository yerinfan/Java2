package java0927;

public class CountTest {
	public static void main(String[] args) {

		abCountable[] abCnt = { new abBird("뻐꾸기", 5), new abBird("독수리", 2), new abTree("사과나무", 10),
				new abTree("밤나무", 7) };

		for (abCountable a : abCnt) {
			a.count();
		}

		for (abCountable a : abCnt) {
			if (a instanceof abBird) {
				((abBird) a).fly();
			} else if (a instanceof abTree) {
				((abTree) a).ripen();
			}
		}

		ifCountable[] ifCnt = { new ifBird("뻐꾸기", 5), new ifBird("독수리", 2), new ifTree("사과나무", 10),
				new ifTree("밤나무", 7) };

		for (ifCountable i : ifCnt) {
			i.count();
		}

		for (ifCountable i : ifCnt) {
			if (i instanceof ifBird) {
				((ifBird) i).fly();
			} else if (i instanceof ifTree) {
				((ifTree) i).ripen();
			}
		}

	}
}

abstract class abCountable {
	String name;
	int num;

	public abCountable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	void count() {
	}
}

interface ifCountable {
	void count();
}

class abBird extends abCountable {

	public abBird(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다. ");
	}

	void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다. ");
	}
}

class abTree extends abCountable {

	public abTree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다. ");
	}

	void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
}

class ifBird implements ifCountable {

	String name;
	int num;

	public ifBird(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public void count() {
		System.out.println(name + "가 " + num + "마리 있다. ");
	}

	void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다. ");
	}
}

class ifTree implements ifCountable {

	String name;
	int num;

	public ifTree(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public void count() {
		System.out.println(name + "가 " + num + "그루 있다. ");
	}

	void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
}