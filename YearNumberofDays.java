package CS;
import java.util.Scanner;

public class YearNumberofDays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEnter the Year : ");
		int year = s.nextInt();
		System.out.println("\nEnter the Month : ");
		String month = s.next();
		s.close();
		
		month.toLowerCase();
		
		switch(month) {
		case "january" :
		case "march" :
		case "may" : 
		case "july" :
		case "august" :
		case "october" :
		case "december" : System.out.println("\nThe number of days in "+ month +" in the year "+ year + " is 31.");break;
		case "april" :
		case "june" :
		case "september" :
		case "november" : System.out.println("\nThe number of days in "+ month +" in the year "+ year + " is 30.");break;
		case "february" : if (year % 4 == 0 || year % 400 == 0) {
							System.out.println("\nThe number of days in "+ month +" in the year "+ year + " is 29.");
		                    }
		                  else {
								System.out.println("\nThe number of days in "+ month +" in the year "+ year + " is 28.");
							}
						  break;
		default : System.out.println("\nWrong Input!!!");
		}

	}

}
