package java0831;

import java.util.Scanner;

public class starMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		star01(n);

		star02(n);

		star03(n);

		star04(n);

		star05(n);

		star06(n);
	}

	private static void star06(int n) {
		for (int i = n; i >= 0; i--) {
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	private static void star05(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void star04(int n) {
		for (int i = n; i >= 1; i--) {
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void star03(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void star02(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void star01(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
