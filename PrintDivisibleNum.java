package CS;

public class PrintDivisibleNum {

	public static void main(String[] args) {
		
		System.out.println("\nNumbers divisible by 3 :");
		for(int i= 0;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\nNumbers divisible by 5 :");
		for(int i= 0;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		int count=0;
		System.out.println("\nNumbers divisible by 3 and 5 :");
		for(int i= 0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+"\t");
				count++;
			}
		}
		System.out.println("\nThere are "+count+" numbers divisible by 3 and 5.");

	}

}
