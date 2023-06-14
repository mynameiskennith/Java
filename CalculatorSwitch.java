package CS;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char repeat;
		do
		{
			System.out.println("Enter two numbers : ");
			int firstNumber = s.nextInt();
			int secondNumber = s.nextInt();
			
			System.out.println("\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\nEnter the Operation to Perform :");
			char operator = s.next().charAt(0);
			
			int calc;
			
			switch(operator) {
			case '1' :
			case '+' : calc = firstNumber + secondNumber;System.out.println("\nSum = "+calc);break;
			case '-' : 
			case '2' : calc = firstNumber - secondNumber;System.out.println("\nDifference = "+calc);break;
			case '*' :
			case '3' : calc = firstNumber * secondNumber;System.out.println("\nProduct = "+calc);break;
			case '/' : 
			case '4' : calc = firstNumber / secondNumber;System.out.println("\nQuotient = "+calc+ "\nReminder = "+firstNumber%secondNumber);break;
			default : System.out.println("Wrong Input");
			
			}
			
			System.out.println("\nDo you want to calculate more? (Y/y) :  ");
			repeat = s.next().charAt(0);
			
		}while(repeat == 'y'|| repeat == 'Y' );
		
		
		
		s.close();


	}

}

