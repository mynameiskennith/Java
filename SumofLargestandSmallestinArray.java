package CS;

import java.util.Arrays;
import java.util.Scanner;

public class SumofLargestandSmallestinArray {

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
		
		int difference = intArray[limit-1]-intArray[0];
		System.out.println("\nDifference between largest and smallest value = "+difference);


	}

}
