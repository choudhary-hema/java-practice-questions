import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

//Problem 4: Thread Pool Usage
//Task: Rewrite the producer-consumer problem from Problem 3 using 
//an ExecutorService (thread pool) to manage the threads.
//Requirements:
//Use Executors.newFixedThreadPool() to create a thread pool.
//Submit producer and consumer tasks to the thread pool.
//Ensure the same functionality as in Problem 3.
class IntegerLinkedBlockingQueue {
	
	private final LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10); // Capacity of 10

	public void addItem(Integer input) throws InterruptedException {
		queue.put(input);
	}

	public void removeItem() throws InterruptedException {
		queue.take();
	}
	public void printQueue() {
		System.out.println("Items in Queue : ");
		queue.stream().forEach(System.out::print);
	}
}
public class P004ExecutorService {

	public static void main(String[] args) throws InterruptedException {

		IntegerLinkedBlockingQueue integerLinkedBlockingQueue = new IntegerLinkedBlockingQueue();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Runnable producerTask = () -> {
			 try {
	                for (int i = 1; i <= 10; i++) {
	                	integerLinkedBlockingQueue.addItem(i);
	                    //Thread.sleep(500); // Simulate time taken to produce an item
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
		};
		Runnable consumerTask = () -> {
			try {
                for (int i = 1; i <= 10; i++) {
                	integerLinkedBlockingQueue.removeItem();
                    //Thread.sleep(1000); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
		};
		executorService.submit(producerTask);
        executorService.submit(consumerTask);

		executorService.shutdown();
        if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
            System.out.println("Tasks did not finish in the allotted time.");
            executorService.shutdownNow();
        } else {
            System.out.println("All tasks completed.");
            integerLinkedBlockingQueue.printQueue();
        }
	}

}
