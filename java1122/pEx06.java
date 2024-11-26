package java1122;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class proverb2 {
    private List<String> list = new ArrayList<>();

    public proverb2(String msg) {
        StringTokenizer st = new StringTokenizer(msg);
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
    }

    public List<String> getList() {
        return list;
    }
}
class T extends Thread {
	private proverb2 prov;
	private int index = 0;

	public T(proverb2 prov) {
		this.prov= prov;
	}

	@Override
	public void run() {
		synchronized (this) {
			while (true) {
				if (index >= prov.getList().size()) {
					break;
				}
				System.out.println(Thread.currentThread().getName() + " : " + prov.getList().get(index++));
			}
		}
	}
}

public class pEx06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();

		proverb2 prov = new proverb2(msg);

		T t1 = new T(prov);
		T t2 = new T(prov);

		t1.setName("속담1");
		t2.setName("속담2");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
