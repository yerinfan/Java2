package chap01;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03 {

	// 원의 반지름을 입력 받아 원의 넓이를 구하여 출력
	// 상수 Pi = 3.14 사용
	// 소수점 이하 2자리까지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		float a = sc.nextFloat();
		
		final double Pi = 3.14;
		
		System.out.printf("원의 넓이는 %.2fcm입니다.", Pi * a);
		
	}

}
