import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		/* Create the stack
		 * It is a data structure that follows the LIFO principle
		 * It has 5 methods
		 * push() :- Add elements in the stack
		 * pop() :- Delete and return the top element
		 * peek() :- Return the top element of the stack
		 * size() :- Return the size of the stack
		 * isEmpty() :- Check if the stack is empty.
		 * */
		
		// Create the stack
		Stack<String> stack = new Stack<String>();
		
		// Add elements in the stack
		stack.push("Footbal");
		stack.push("Netball");
		stack.push("Soccer");
		stack.push("Tenis");
		stack.push("Golf");
		
		// Access the elements in the stack
		// Return the top element
		System.out.println(stack.peek()); // Returns Golf
		
		// Delete and return the top element
		System.out.println(stack.pop()); // Returns Golf
		
		// Return the size of the stack
		System.out.println(stack.size()); // Returns 4 because 1 element is deleted
		
		// Check if the stack is empty
		System.out.println(stack.isEmpty()); // Returns false
		
		// Print the elements of the stack
		System.out.print(stack);

	}

}
