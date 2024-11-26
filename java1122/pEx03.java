package java1122;

import java.util.Random;

class c {
	static private int sum = 0;
	static private int num = 0;

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		c.sum = sum;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int i) {
		c.num = i;
	}
}

class thrd extends Thread {
	private int cnt;
	private Random r = new Random();
	private static c c = new c();

	public thrd(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public void run() {
		synchronized (c) {
			while (c.getNum() < cnt) {
				int num = r.nextInt(10);
				int sum = num + c.getSum();
				c.setSum(sum);
				c.setNum(c.getNum() + 1);

				System.out.println(Thread.currentThread().getName() + " : " + num);

				c.notify();
				try {
					if (c.getNum() < cnt) {
						c.wait();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			c.notifyAll();
		}
	}
}

public class pEx03 {

	public static void main(String[] args) {
		thrd thrd1 = new thrd(5);
		thrd thrd2 = new thrd(5);
		thrd1.setName("Thread-01");
		thrd2.setName("Thread-02");
		thrd1.start();
		thrd2.start();

		try {
			thrd1.join();
			thrd2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("누적 값 : " + c.getSum());
	}
}