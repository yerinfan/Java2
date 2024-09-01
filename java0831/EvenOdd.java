package java0831;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자를 입력받아 짝수인지 홀수인지 판단, 0 입력시 종료 1입력시 계속
		int c = 1;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			} else {
				System.out.println(">> 홀수입니다.");
			}
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			c = sc.nextInt();
		} while (c != 0);
		
		System.out.println("종료.");
	}

}
