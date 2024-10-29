//Problem 2: Synchronized Counter
//Task: Create a program with a shared counter that multiple threads increment. Use synchronization to ensure that the counter is incremented correctly.
//
//Requirements:
//Create a Counter class with a method to increment the count.
//Create multiple threads that call the increment method.
//Print the final value of the counter after all threads have finished.

class Counter {
 private static int counter = 0;

 // Synchronized method to increment the counter
 public synchronized void increment() {
     counter++;
 }

 // Method to get the counter value
 public int getCounter() {
     return counter;
 }
}

class CounterThread extends Thread {
 private Counter counter;

 public CounterThread(Counter counter) {
     this.counter = counter;
 }

 @Override
 public void run() {
     // Increment the counter multiple times
     for (int i = 0; i < 1000; i++) {
         counter.increment();
     }
 }
}

public class P003SynchronizedCounter {
 public static void main(String[] args) throws InterruptedException {
     Counter counter = new Counter();

     // Create multiple threads that will increment the counter
     CounterThread thread1 = new CounterThread(counter);
     CounterThread thread2 = new CounterThread(counter);
     CounterThread thread3 = new CounterThread(counter);

     // Start the threads
     thread1.start();
     thread2.start();
     thread3.start();

     // Wait for all threads to complete
     thread1.join();
     thread2.join();
     thread3.join();

     // Print the final value of the counter
     System.out.println("Final Counter Value: " + counter.getCounter());
 }
}
