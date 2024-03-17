
public class ArrayStack implements Stack{
	// Variables
	private String[] myArray;
	private int size;
	private int top;
	
	// Parameterized constructor
	public ArrayStack(int cap) {
		myArray = new String[cap];
		top = -1;
	}

	public String peek() {
		return null;
	}

	public String pop() {
		return null;
	}

	public void push(String e) {
		top++;
		myArray[top] = e;
	}

	public void size() {
		
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}



}
