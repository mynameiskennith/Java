package CS;
import java.util.Scanner;

public class SumandAverageofArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s.nextInt();
		
		int[] intArray = new int[limit];
		
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<limit;i++) {
			intArray[i] = s.nextInt();
		}
		
		s.close();
		
		float sum=0;
		for(int i=0;i<limit;i++) {
			sum = sum +intArray[i];
		}
		System.out.println("Sum ="+sum);
		System.out.println("Average = "+(sum/intArray.length));
	}

}
