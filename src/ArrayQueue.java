import java.util.Scanner;


public class ArrayQueue implements Queue {

    private int front;
    private int rear;
    private String Q[];  // Array variable
    private int capacity;
    
    

    // Parameterized constructor
    public ArrayQueue(int cap) {
        front = 0;
        rear = 0;
        capacity = cap;
        Q = new String[capacity];
    }

    public boolean isEmpty() {
        return front == rear && Q[front] == null;
    }

    public String front() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null; // or throw an exception if preferred
        } else {
            return Q[front];
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null; // or throw an exception if preferred
        } else {
            String temp = Q[front];
            Q[front] = null;
            front = (front + 1) % capacity;
            return temp;
        }
    }

    // Additional method to enqueue an element
    public void enqueue(Object value) {
        if ((rear + 1) % capacity == front && Q[front] != null) {
            System.out.println("The queue is full");
            // You might want to resize the array or throw an exception in a real-world scenario
        } else {
            Q[rear] = (String) value;
            rear = (rear + 1) % capacity;
            if (rear == front) {
                // Queue is full, reset rear to avoid confusion
                rear = front - 1;
            }
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(5);

        // Example usage
        System.out.println("Enter a value to enqueue : ");
        Object value = sc.next();
        queue.enqueue(value);
       

        System.out.println("Front: " + queue.front());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Front: " + queue.front());
    }

	@Override
	public Object rear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object flont() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
