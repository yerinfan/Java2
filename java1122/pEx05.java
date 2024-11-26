package java1122;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class proverb {
    private List<String> list = new ArrayList<>();

    public proverb(String msg) {
        StringTokenizer st = new StringTokenizer(msg);
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
    }

    public List<String> getList() {
        return list;
    }
}

class threads extends Thread {
    private proverb proverb;
    private int index = 0;

    public threads(proverb proverb) {
        this.proverb = proverb;
    }

    @Override
    public void run() {
        while (true) {
                if (index >= proverb.getList().size()) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " : " + proverb.getList().get(index++));
        }
    }
}

public class pEx05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        proverb proverb = new proverb(msg);

        threads t1 = new threads(proverb);
        threads t2 = new threads(proverb);

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