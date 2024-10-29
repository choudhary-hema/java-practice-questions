import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P007FutureCallable {

    private static long square(long num) {
        try {
            Thread.sleep(1000); // Simulate time taken for computation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return num * num;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        // Create multiple Callable tasks
        Callable<Long> task1 = () -> square(3);
        Callable<Long> task2 = () -> square(5);
        Callable<Long> task3 = () -> square(7);

        // Submit tasks to ExecutorService and get Future objects
        Future<Long> future1 = executorService.submit(task1);
        Future<Long> future2 = executorService.submit(task2);
        Future<Long> future3 = executorService.submit(task3);

        // Retrieve and print the results
        System.out.println("Square of 3: " + future1.get());
        System.out.println("Square of 5: " + future2.get());
        System.out.println("Square of 7: " + future3.get());

        // Shutdown the executor service
        executorService.shutdown();
    }
}
