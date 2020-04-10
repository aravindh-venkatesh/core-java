package multithread;

// with extends technique class is limited to extended only one class, in this case Thread
public class ExtendTechnique extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of " + getName());
    }
}
