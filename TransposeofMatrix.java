package CS;

import java.util.Scanner;

public class TransposeofMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int row,colmn;
		System.out.println("Enter the Rows of Matrix A : ");
		row = s.nextInt();
		System.out.println("\nEnter the Columns of Matrix A : ");
		colmn = s.nextInt();
		int[][] A = new int[row][colmn];
		int[][] trans = new int[colmn][row];
		
		
		System.out.println("Enter the elements of Matrix A : ");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				A[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				trans[j][i]=A[i][j];
			}
		}
		
		
		System.out.println("\nOriginal Matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<colmn;j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("\n");
		s.close();
		
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<colmn;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(trans[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
