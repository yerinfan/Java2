package chap01;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {

	// 직사각형의 가로와 세로를 키보드로 하나씩 입력받아 넓이를 구하는 프로그램
	// 소수점 이하 1자리까지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.print("직사각형의 가로 길이 : ");
		float a = sc.nextFloat();

		System.out.print("직사각형의 세로 길이 : ");
		float b = sc.nextFloat();

		float c = a + b;
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.", c);
	}

}
