package CS;

public class ArrayDem1 {

	public static void main(String[] args) {
		int[] Arr = new int [10];
		
		System.out.println("Array length = "+Arr.length);
		
		for(int i=0;i<Arr.length;i++) {
			Arr[i]=i*2;
			System.out.println(Arr[i]);
		}
		
		

	}

}
