package CS;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Operation to Perform :"+"\n"+"1. Addition (+)\n"+"2. Subtraction (-)\n"+"3. Multiplication (*)\n"+"4. Division (/)\n");
		String operator = s.next();
		
		System.out.println("Enter two numbers : ");
		int firstNumber = s.nextInt();
		int secondNumber = s.nextInt();
		int calc;
		
		switch(operator) {
		case "1" :
		case "+" : calc = firstNumber + secondNumber;System.out.println("Sum = "+calc);break;
		case "-" : 
		case "2" : calc = firstNumber - secondNumber;System.out.println("Difference = "+calc);break;
		case "*" :
		case "3" : calc = firstNumber * secondNumber;System.out.println("Product = "+calc);break;
		case "/" : 
		case "4" : calc = firstNumber / secondNumber;System.out.println("Quotient = "+calc);break;
		default : System.out.println("Wrong Input");
		
		}
		
		s.close();

	}

}
