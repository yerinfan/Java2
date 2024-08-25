package chap01;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex04 {

	// 2개의 변수에 있는 숫자를 입력받아, swapping한 결과 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = sc.nextInt();

		int c = a;
		a = b;
		b = c;
		System.out.println("Swapping 결과 >");
		System.out.printf("변수 a의 값 = %d \n", a);
		System.out.printf("변수 b의 값 = %d", b);
	}

}
