package Assignment;

import java.util.Scanner;

interface Food {
	public void setType(String type);

	public double calculatePrice();
}

class Pizza implements Food {
	Scanner ps = new Scanner(System.in);
	private String size, type;

	public void setType(String type) {
		this.type = type.toLowerCase();
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double calculatePrice() {
		double price = 0;

		if (size.equals("small")) {
			if (type.equals("veg"))
				price = 80;
			else if (type.equals("nonveg"))
				price = 125;
			else
				System.out.println("..Order not available..");
		} else if (size.equals("medium")) {
			if (type.equals("veg"))
				price = 175;
			else if (type.equals("nonveg"))
				price = 225;
			else
				System.out.println("..Order not available..");
		} else if (size.equals("large")) {
			if (type.equals("veg"))
				price = 250;
			else if (type.equals("nonveg"))
				price = 275;
			else
				System.out.println("..Order not available..");
		}
		return price;
	}
}

class Lasagne implements Food {
	Scanner ls = new Scanner(System.in);
	private String type;

	public void setType(String type) {
		this.type=type;
	}

	public double calculatePrice() {
		double price = 0;

		if (type.equals("veg"))
			price = 200;
		else if (type.equals("nonveg"))
			price = 300;
		else
			System.out.println("..Order not available..");

		return price;
	}

}

public class RoushadResto {
	static double total = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch;
		System.out.println("....Welcome to Roushad Restro....");
		do {
			System.out.println("What do you like to have? \n1.Pizza\n2.Lasagne");
			int choice = s.nextInt();
			switch (choice) {
			default:
				System.out.println("..Wrong Input!!!!..");
				break;
			case 1:
				Pizza P = new Pizza();
				System.out.println("Please select your Pizza size (Small/Medium/Large) : ");
				String size = s.next();
				P.setSize(size.toLowerCase());
				System.out.println("Please select your type (Veg/Nonveg) : ");
				String type = s.next();
				P.setType(type.toLowerCase());
				total = total + P.calculatePrice();
				break;
			case 2:
				Lasagne L = new Lasagne();
				System.out.println("Please select your type (Veg/Nonveg) : ");
				type = s.next();
				L.setType(type.toLowerCase());
				total = total + L.calculatePrice();
			}
			System.out.println("Do you want to purchase more? (Y/N) : ");
			ch = s.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		if (total != 0)
			System.out.println("The total amount to be paid = " + total);

		System.out.println("....Thankyou Please Visit Again....");

		s.close();
	}

}
