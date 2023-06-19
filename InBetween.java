package CS;
import java.util.Scanner;

public class InBetween {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter two numbers between 15 and 85 :\n ");
		int inputNum1 = s.nextInt();
		int inputNum2 = s.nextInt();
		
		s.close();
		
		if((inputNum1>15 && inputNum1<85) && (inputNum2>15 && inputNum2<85)) {
			int Digit1 = inputNum1%10;
			inputNum1/=10;
			int Digit2 = inputNum1;
			
			int Digit3 = inputNum2%10;
			inputNum2/=10;
			int Digit4 = inputNum2;
			
			if(Digit1 == Digit3 || Digit1 == Digit4 || Digit2 == Digit3 || Digit2 == Digit4) {
				System.out.println("\nTrue. Common Digits Exists ");
			}
			else {
				System.out.println("\n Common Digits do not exist ");
			}
		}
		else {
			System.out.println("\n\tInvalid input!!!");
		}

	}

}
