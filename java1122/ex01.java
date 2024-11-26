package java1122;

class Worker extends Thread {

	@Override
	public void run() {
		// for 문 1초마다 ++ 
		for (int i = 0; i < 5; i++) {
			System.out.println("작업 스레드 : " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ex01 {

	public static void main(String[] args) {
		int alphabet = 'a';
		
		// 작업스레드 생성 시작
		Worker w = new Worker();
		w.start();
		
		// 작업하는동안 메인 수행
		int i = 0;
		while (true) {
			if (w.isInterrupted()) {
				break;
			}
			System.out.println("메인 스레드 : " + (char)(alphabet + i++));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
