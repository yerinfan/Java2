package java1122;

public class ex02 {

	public static void main(String[] args) {
		// 작업 람다식
		Thread t = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("작업 스레드  : "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		});	
		t.start();

		int alphabet = 'a';
		int i = 0;
		while (true) {
			if (t.isInterrupted()) {
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
