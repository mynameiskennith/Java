package CS;
import java.util.*;

public class ArrayofStudents {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float total=0,avg;
		System.out.println("Enter number of Students : ");
		int num = s.nextInt();
		
		int[][] Stud = new int[num][4];
		
		for(int i=0;i<Stud.length;i++) {
			for(int j=0;j<Stud[i].length;j++) {
				if(j==0) {
					System.out.println("Enter the roll no. : ");
					Stud[i][j]= s.nextInt();
				}
				else if(j==1) {
					System.out.println("Enter mark of Sub1 : ");
					Stud[i][j]= s.nextInt();
				}
				else if(j==2) {
					System.out.println("Enter mark of Sub2 : ");
					Stud[i][j]= s.nextInt();
				}
				else if(j==3) {
					System.out.println("Enter mark of Sub3 : ");
					Stud[i][j]= s.nextInt();
				}
			}
			
		}
		
		
		System.out.println("Rno\tmark1\tmark2\tmark3\ttotal\taverage");
		for(int i=0;i<Stud.length;i++) {
			total=0;
			for(int j=0;j<Stud[i].length;j++) {
				System.out.print(Stud[i][j]+"\t");
				if(j>0) {
					total=total+Stud[i][j];
				}
			}
			avg=total/3;
			System.out.print(total+"\t"+avg);
			System.out.println("");
		}
		

	}
}

