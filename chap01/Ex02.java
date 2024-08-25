package chap01;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02 {

	//입력된 정수가 짝수인지 홀수인지를 조건 연산자를 사용하여 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}

}
