//Problem 1: Basic Thread Creation
//Task: Create a Java program that spawns three threads, each printing its thread name and a message. Ensure that the main thread waits for all three threads to complete before exiting.
//
//Requirements:
//Use both the Thread class and the Runnable interface.
//Print messages like "Thread 1 is running", "Thread 2 is running", etc.
class ThreadSample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class RunnableSample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

public class P001BasicThread {

    public static void main(String[] args) {
        // Create instances of threads
        ThreadSample threadObj = new ThreadSample();
        Thread runnableObj = new Thread(new RunnableSample());

        // Start the threads
        threadObj.start();
        runnableObj.start();

        try {
            // Wait for both threads to complete
            threadObj.join(); // Wait for ThreadSample to finish
            runnableObj.join(); // Wait for RunnableSample to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have completed execution.");
    }
}
