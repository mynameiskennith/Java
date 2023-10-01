package Files;
import java.io.*;

public class CopyContent {

	public static void main(String[] args) throws IOException{
		try {
			FileInputStream in = new FileInputStream("File2.txt");
			FileOutputStream out = new FileOutputStream("File1.txt");
			int c;
			while((c=in.read())!= -1) {
				out.write(c);
			}
			System.out.println("File Content Copied");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
