package CS;
import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s.nextInt();
		s.close();
		int i=0,sum=0;
		do {
			sum+=i;
			i++;	
		}while(i<=limit);
		
		System.out.println("Sum = "+sum);

	}

}
