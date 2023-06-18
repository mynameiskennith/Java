package CS;
import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("\nEnter a Charecter : ");
		char ch = s.next().charAt(0);
		s.close();
		
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : System.out.println("\nThe charecter is a Vowel");
		default : if(ch>'a'&& ch<'z') {
					System.out.println("\nThe Charecter is a Consonant");
					}
				  else if(ch>'0' && ch<'9') {
						System.out.println("\nThe Input is a Number");
					}
				  else {
						System.out.println("\nThe input is a Special Charector");
					}
		}
		
		

	}

}
