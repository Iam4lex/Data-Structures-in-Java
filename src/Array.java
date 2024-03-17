// Accessing elements in an array.
public class Array {

	public static void main(String[] args) {
		
		int sum = 0;
		// Declare and initialize array of integers
		int myArray[] = {10,20,30,40,50,60,70};
		
		for(int i = 0; i < myArray.length; i++) {
			 sum += myArray[i];
		}
		
		System.out.println(sum);
		
		// Print the elements of the array
		System.out.println("Elements of the array");
		for (int elementsOfTheArray:myArray) {
			System.out.println(elementsOfTheArray);
		}

	}

}
