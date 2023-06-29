package CS;
import java.util.Arrays;
import java.util.Scanner;

public class SortingDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s.nextInt();
		
		int[] intArray = new int[limit];
		
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<limit;i++) {
			intArray[i] = s.nextInt();
		}
		Arrays.sort(intArray);
		
		s.close();
		
		System.out.println("\nSorted array is : ");
		for(int i=0;i<4;i++) {
			System.out.print(intArray[i]+"\t");
		}

	}

}
