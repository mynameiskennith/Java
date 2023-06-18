package CS;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num%2==0 && num>0)
			System.out.println("The number entered is Even");
		else if(num%2!=0 && num>0)
			System.out.println("The entered number is Odd");
		else if(num==0)
			System.out.println("The entered number is Zero");
		else
			System.out.println("Wrong Input");
		sc.close();
		

	}

}
