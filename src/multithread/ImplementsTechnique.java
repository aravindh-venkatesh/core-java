package multithread;

public class ImplementsTechnique implements Runnable {
    private Thread thread;

    public ImplementsTechnique(String name) {
        thread = new Thread(this, name);
    }

    public void start() {
        thread.start();
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public boolean isAlive() {
        return thread.isAlive();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
