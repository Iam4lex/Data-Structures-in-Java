import java.util.Scanner;

public class WritenVertical {
	
    public static void writeVertical(int n) {
        if (n < 10) { // Check if a number is less than 10, if its less, print the number.
            System.out.println(n);
        } else {
            writeVertical(n / 10);  // Use n / 10 to get the remaining digits
            System.out.println(n % 10); // Print the last number of the digits.
        }
    }

    public static void main(String[] args) {
        // Example usage
    	Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        writeVertical(number);
    }
}
