import java.util.Queue;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		
		// Create the queue
		Queue<Integer> queue = new LinkedList<>();
		
		// Enqueue elements in the queue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		queue.offer(70);
		queue.offer(80);
		
		// Access and print the first elements of the queue
		System.out.println("The first element of the queue is " + queue.peek());
		// Dequeue elements from the queue and print them
		while(!queue.isEmpty()) {
			int elements = queue.poll();
			System.out.println("Elements of the queue " + elements);
		}

	}

}
