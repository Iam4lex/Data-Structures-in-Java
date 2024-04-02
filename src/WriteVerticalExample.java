//==================== Import the necessary packages ==================================//
import java.util.*;


//                 Class
public class WriteVerticalExample {

//	WriteVerticalExample method
	public static void WriteVerticalExample(int n) {
		if (n < 10) {
			System.out.println(n);
		}
		else {
			WriteVerticalExample(n / 10);
			System.out.println(n % 10);
		}
	}
	
	// Main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		WriteVerticalExample(number);
		

	}

}
