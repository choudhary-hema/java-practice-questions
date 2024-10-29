import java.util.List;
import java.util.PriorityQueue;

//Problem 3: Producer-Consumer Problem
//Task: Implement a producer-consumer scenario using a shared buffer (queue). 
//Use synchronization to ensure that the producer adds items to the queue and the consumer removes items correctly.
//Requirements:
//Use wait() and notify() for thread communication.
//Print messages indicating when an item is produced and consumed.
class StringQueue {
	
	private PriorityQueue<String> queue = new PriorityQueue<>();
	
	public void addItem(List<String> input) {
		queue.addAll(input);
	}

	public void removeItem(String input) {
		queue.remove(input);
	}
	public void printQueue() {
		queue.stream().forEach(System.out::print);
	}
}
public class P002ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {

		StringQueue stringQueue = new StringQueue();
		Runnable target = () -> {
			stringQueue.addItem(List.of("a1","b1","c1","d1","e1"));
		};
		Thread t1 = new Thread(target);
		synchronized (t1) {
			t1.start();			
			t1.wait();
		}
		Runnable target2 = () -> {
			stringQueue.removeItem("e1");
		};
		Thread t2 = new Thread(target2);
		t2.start();
		stringQueue.printQueue();
	}

}
