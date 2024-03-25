//import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriolityQueueExample {

	public static void main(String[] args) {
		
		// Create the priority queue
		Queue<Double> queue = new PriorityQueue<>();
		
		// Add elements in the queue
		queue.offer(5.5);
		queue.offer(4.6);
		queue.offer(9.4);
		queue.offer(6.5);
		queue.offer(2.4);
		queue.offer(3.4);
		queue.offer(5.4);

		// Print the elements of the queue
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
