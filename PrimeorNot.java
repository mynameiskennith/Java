package CS;
import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int flag =0;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println(num+" is a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is not a prime number.");
		}
		
		s.close();

	}

}
