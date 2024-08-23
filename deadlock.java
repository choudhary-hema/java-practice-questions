public class Main {
 //Object lock that is required by the thread for execution.
 private static final Object lock1 = new Object();
 private static final Object lock2 = new Object();
 
 public static void main(String[] args) {
     Thread thread1 = new Thread(() -> {
     System.out.println("test");
         synchronized (lock1) {
            System.out.println("Thread 1 acquired lock 1");
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
          synchronized (lock2) {
         	System.out.println("Thread 1 acquired lock 2");
         }
        
     });
     Thread thread2 = new Thread(() -> {
     System.out.println("test");
         synchronized (lock2) {
            System.out.println("Thread 2 acquired lock 2");
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
         synchronized (lock1) {
         	System.out.println("Thread 2 acquired lock 1");
         }
        
     });
     thread1.start();
     thread2.start();
}
}
 
