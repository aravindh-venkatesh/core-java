package multithread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestObject {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public synchronized void suspendMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(dateFormat.format(new Date()) + " : " + "Suspend Method : " +
                        " suspending # " + i + " start");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(dateFormat.format(new Date()) + " : " + "Suspend Method : " +
                    " suspending # " + i + " end");
            System.out.println();
        }
    }

    public void resumeMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
                System.out.println(dateFormat.format(new Date()) + " : " + "Resume  Method : " +
                        " resuming # " + i + " and sleeping for 5 seconds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                notify();
            }
        }
    }
}
