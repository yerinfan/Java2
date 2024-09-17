package java0913;

import java.util.Scanner;

public class ExecuteBankApp {
	
	public static void main(String[] args) {
	
		BankApplication bka = new BankApplication();
		Start(bka);

	}

	private static void Start(BankApplication bka) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			n = getMenuNum();
			switch (n) {
			case 1:
				makeAccount(bka);
				break;
			case 2:
				viewAccList(bka);
				break;
			case 3:
				accInput(bka);
				break;
			case 4:
				accOutput(bka);
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

	private static void accOutput(BankApplication bka) {
		System.out.println("--------------------------------------------------");
		System.out.println("					  출금						");
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 번호 :");
		String accNum = sc.nextLine();
		System.out.print("출금액 :");
		int money = sc.nextInt();
		
		bka.inputMoney(accNum, money);
		

	}

	private static void accInput(BankApplication bka) {
		System.out.println("------------");
		System.out.println("  입금");
		System.out.println("------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 번호 :");
		String accNum = sc.nextLine();
		System.out.print("예금액 :");
		int money = sc.nextInt();
		
		bka.inputMoney(accNum, money);
		
	}

	private static void viewAccList(BankApplication bka) {
		System.out.println("------------");
		System.out.println("  계좌 목록");
		System.out.println("------------");
		
		for (int i = 0; i < bka.getLength(); i++) {
			bka.showAcc(i);
		}
		
	}

	private static void makeAccount(BankApplication bka) {
		System.out.println("------------");
		System.out.println("  계좌 생성");
		System.out.println("------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 번호 :");
		String accNum = sc.nextLine();
		System.out.print("계좌주 :");
		String name = sc.nextLine();
		System.out.print("초기 입금 금액 :");
		int accTot = sc.nextInt();

		Account acc = new Account(accNum, name, accTot);

		bka.addAcc(acc);
		
		System.out.println("계좌가 생성되었습니다.");
	}

	private static int getMenuNum() {
		Scanner sc = new Scanner(System.in);

		printMenu();
		System.out.print("선택> ");
		int n = sc.nextInt();
		return n;
	}

	private static void printMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("--------------------------------------------------");
	}
}
