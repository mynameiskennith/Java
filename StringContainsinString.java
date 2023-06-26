package CS;
import java.util.Scanner;

public class StringContainsinString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first String :");
		String str1 = s.nextLine();
		System.out.println("Enter the second String :");
		String str2 = s.nextLine();
		
		s.close();
		
		if(str1.contains(str2)) {
			System.out.println(str1 + " contains "+ str2);
		}
		else {
			System.out.println(str1+" does not contain "+str2);
		}
		System.out.println(str1.indexOf(" "));
	}

}
