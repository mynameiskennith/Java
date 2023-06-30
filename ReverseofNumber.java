package CS;
import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int rev=0;
		
		s.close();
		
		while(num>0) {
			rev = (rev*10)+(num%10);
			num=num/10;
		}
		
		System.out.println("\nReversed Number = "+ rev);
	}

}
