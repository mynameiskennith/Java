package Files;
import java.io.*;
//import IOException;

public class Fex1  {
public static void main(String args[]) throws IOException {
	int i=0;
	// create new file input stream
	FileInputStream fin = new FileInputStream("Sample.txt");
	System.out.println(fin.available());
	
	while((i=fin.read())!=-1) {
		char c = (char) i;
		System.out.print(c);
	}
	
	FileOutputStream fout = new FileOutputStream("Sample.txt");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter data : ");
	String s = br.readLine();
	byte arr[]=s.getBytes();
	
	System.out.println("Data Added : ");
	fout.write(arr);
	
	while((i=fin.read())!=-1) {
		char c = (char) i;
		System.out.print(c);
	}
	
	fin.close();

}
}
