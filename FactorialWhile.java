package CS;
import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int factorial=1;
		
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		
		s.close();
		
		int i=1;
		while(i<=num) {
			factorial = factorial*i;
			i++;
		}
		
		System.out.println("\nFactorila = "+factorial);

	}

}
