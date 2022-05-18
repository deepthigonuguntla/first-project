package practicesession;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	 static String str;
	 static int a;
	
	public static void readlinebyline() throws IOException {
		File file=new File("C:\\Users\\Addu\\eclipse-workspace\\java class\\src\\javatopicspracice\\exception\\checkedexception\\deepthi.txt");
		FileInputStream ir =new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(ir);
		BufferedReader br = new BufferedReader(reader);
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		}
	
	public static void readcharbychar() throws IOException {
	 String s1="C:\\Users\\Addu\\eclipse-workspace\\java class\\src\\javatopicspracice\\exception\\checkedexception\\deepthi.txt";
	    File file=new File(s1);
		FileReader reader = new FileReader(s1);
		
		while((a=reader.read())!=-1) 
		{
			
			System.out.print((char)a);	
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		
		readlinebyline();
		readcharbychar() ;
	}
}

