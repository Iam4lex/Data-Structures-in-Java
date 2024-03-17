import java.util.*;

public class LinkedListExample {
	
	public static void main(String[] args) {
		// Creating the linked list -> Declare and initialize the linked list
		LinkedList<Integer> myList = new LinkedList<>();
		//Adding items -> use the add method
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		System.out.println(myList);
		//Accessing elements 
		int list = myList.get(1);
		System.out.println("The accessed list is " + list);
		// Modifying or update items using the set method
		int updatedItem = myList.set(0, 200);
		System.out.println("The updated item is " + updatedItem);
		
		// Check if the linked list contains an element or not
		boolean containsElement = myList.contains(200);
		System.out.println("My list contains element 20 " + containsElement);
		
		// Clear the linked list
		myList.clear();
		System.out.println("List cleared" + myList);
		
		
	}

}
