package CS;
import java.util.Scanner;

public class NoofEvenOddArray {

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
		
		int even=0,odd=0;
		for(int i=0;i<limit;i++) {
			if(intArray[i]%2==0 && intArray[i]>0) {
				even++;
			}
			else if(intArray[i]%2!=0 && intArray[i]>0) {
				odd++;
			}
		}
		System.out.println("\nNumber of Even numbers = "+even+"\nNumber of Odd Numbers : "+odd);
	}

}
