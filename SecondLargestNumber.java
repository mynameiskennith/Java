package CS;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

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
		
		System.out.println("\nSecond largest element in array is : "+intArray[limit-2]);
		
		s.close();

	}

}
