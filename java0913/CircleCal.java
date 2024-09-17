package java0913;

import java.util.Scanner;

class Circle {
	static final double PI = 3.14;
	public int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public void calArea() {
		System.out.printf("반지름이 %d인 원의 넓이는 %.2f입니다.\n", r, r*PI);
	}
	
}

public class CircleCal {
	public static void main(String[] args) {
		System.out.print("원의 반지름: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		Circle c = new Circle(r);
		c.calArea();
	}
	
}