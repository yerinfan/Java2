package java1122;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ex03 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable task = () -> {
			// for 1sec ++
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			exec.shutdown();
		};

		exec.execute(task);
		int alphabet = 'a';
		int i = 0;
		while (!exec.isShutdown()) {
			System.out.println((char)(alphabet + i));
			i += 1;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
