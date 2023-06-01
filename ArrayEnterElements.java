package CS;
import java.util.Scanner;

public class ArrayEnterElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEnter the number of elements : ");
		int limit = s.nextInt();
		System.out.println("Enter the Elements : ");
		int[] intArray = new int[limit];
		for(int i=0;i<limit;i++) {
			intArray[i] = 2 *(s.nextInt());
		}
		
		s.close();
		
		System.out.println("Final Array : ");
		for(int i=0;i<limit;i++) {
			System.out.println(intArray[i]);
		}

	}

}
