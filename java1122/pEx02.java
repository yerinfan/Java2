package java1122;

import java.util.Scanner;

class thread extends Thread {

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("작업 실행 중...");
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("작업 종료..");
				break;
			}
		}
	}
	
}

public class pEx02 {

	public static void main(String[] args) {
		thread t = new thread(); 
		t.start();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.nextLine().equals("1")) {
				t.interrupt();
				break;
			}
		}
	}
}
