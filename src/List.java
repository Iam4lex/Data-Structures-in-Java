
public class List {

	  
	  static void smartBubbleSort(int arr[], int n) {
	    int i, j;
	    boolean swapped;

	    for (i = 0; i < n - 1; i++) {
	      swapped = false;

	      for (j = 0; j < n - i - 1; j++) {
	        if (arr[j] > arr[j + 1]) {
	          
	          swap(arr, j, j + 1);
	          swapped = true;
	        }
	      }

	      if (!swapped) {
	        break;
	      }
	    }
	  }

	  static void swap(int arr[], int a, int b) {
	    int temp = arr[a];
	    arr[a] = arr[b];
	    arr[b] = temp;
	  }

	  static void printArray(int arr[], int size) {
	    for (int i = 0; i < size; i++)
	    	System.out.print(arr[i] + " ");
	    System.out.println();
	  }

	  
	  public static void main(String args[]) {
		  int arr[] = { 64, 34, 25, 12, 22, 11, 90,85 };
	    int n = arr.length;
	    smartBubbleSort(arr, n);
	    System.out.println("Sorted array is ");
	    printArray(arr, n);
	  }

	public static Object smartBubbleSort(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
	}