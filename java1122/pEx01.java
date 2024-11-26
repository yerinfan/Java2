package java1122;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class r implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			System.out.println("runnable : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class pEx01 {

	public static void main(String[] args) {
		Thread t = new Thread(new r());
		t.start();
		
		//ThreadPool 1sec
		Runnable r2 = () -> {	
			for (int i = 1; i < 100; i++) {
				System.out.println("pool : "+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		};
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(r2);
	}
}
