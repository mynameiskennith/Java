package trys;

import java.util.*;
import java.io.*;

public class FileDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,i;
		
		try {
			File f = new File("num.txt");
			if(f.exists())
				System.out.println("File already Exists");
			else {
				f.createNewFile();
				System.out.println("File");
			}
			System.out.println("Enetr the number of inputs : ");
			n=s.nextInt();
			
			FileOutputStream fn = new FileOutputStream("num.txt");
			System.out.println("Enter the elements : ");
			for(i=0;i<n;i++) {
				int a = s.nextInt();
				fn.write(a);
			}
			
			File fo = new File("odd.txt");
			File fe = new File("even.txt");
			
			if(fo.exists())
				System.out.println("File already Exists");
			else {
				fo.createNewFile();
				System.out.println("File");
			}
			if(fe.exists())
				System.out.println("File already Exists");
			else {
				fe.createNewFile();
				System.out.println("File");
			}
			
			FileInputStream fs = new FileInputStream("num.txt");
			FileOutputStream foo = new FileOutputStream("odd.txt");
			FileOutputStream fee = new FileOutputStream("even.txt");
			int c;
			while((c=fs.read())!=-1) {
				if(c%2==0)
					fee.write(c);
				else 
					foo.write(c);
			}
			
			
			
			
		}catch(Exception e) {
			
		}
	}

}
