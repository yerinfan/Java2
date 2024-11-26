package java1122;

class Echo { 
	void echo(String msg) {
		for (int i = 0; i < 3; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class nEchoer extends Thread {
	private String msg;
	Echo e = new Echo();

	public nEchoer(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		e.echo(msg);
	}
}

class Echoer extends Thread {
	private String msg;
	static Echo e = new Echo();

	public Echoer(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		synchronized (e) {
			e.echo(msg);
			e.notify();
			try {
				e.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class pEx04 {

	public static void main(String[] args) {
		
		nEcho();
		Echo();
		
	}
	
	public static void nEcho() {
		nEchoer p1 = new nEchoer("환영");
		nEchoer p2 = new nEchoer("야호...");
		nEchoer p3 = new nEchoer("자바");

		p1.start();
		p2.start();
		p3.start();

	}
	
	public static void Echo() {
		Echoer p1 = new Echoer("환영");
		Echoer p2 = new Echoer("야호...");
		Echoer p3 = new Echoer("자바");

		p1.start();
		p2.start();
		p3.start();
	}
}
