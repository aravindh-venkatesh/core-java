package multithread;

public class Main {

    public static void main(String[] args) {
        // extendTechniqueMethod();
        // implementsTechniqueMethod();
        synchronizeDemo();
    }

    public static void synchronizeDemo() {
        TestObject testObject = new TestObject();
        NewThread thread1 = new NewThread(testObject, "suspend");
        NewThread thread2 = new NewThread(testObject, "resume");

        thread1.thread.start();
        thread2.thread.start();

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void extendTechniqueMethod() {
        ExtendTechnique thread1 = new ExtendTechnique();
        thread1.setName("Thread 1 - Extend Technique");

        // start thread1 - calling start method will in turn call run method which is overridden
        thread1.start();
        System.out.println("Thread 1 is alive? " + thread1.isAlive());
        try {
            // Main thread will wait till thread1 completes its execution and joins back here
            System.out.println("Main thread is waiting for thread 1 to complete its execution and join");
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 is alive? " + thread1.isAlive());
        System.out.println("End of main thread");
    }

    public static void implementsTechniqueMethod() {
        ImplementsTechnique thread1 = new ImplementsTechnique("Thread 1 - Implement technique");
        thread1.start();
        System.out.println("Thread 1 is alive? " + thread1.isAlive());
        try {
            // Main thread will wait till thread1 completes its execution and joins back here
            System.out.println("Main thread is waiting for thread 1 to complete its execution and join");
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 is alive? " + thread1.isAlive());
        System.out.println("End of main thread");
    }
}
