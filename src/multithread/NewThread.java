package multithread;

public class NewThread implements Runnable {
    public Thread thread;
    private TestObject testObject;
    private String name;

    public NewThread(TestObject testObject, String name) {
        thread = new Thread(this);
        this.testObject = testObject;
        this.name = name;
    }

    @Override
    public void run() {
        if (name.equals("suspend")) {
            testObject.suspendMethod();
        } else if (name.equals("resume")) {
            testObject.resumeMethod();
        }
    }
}
