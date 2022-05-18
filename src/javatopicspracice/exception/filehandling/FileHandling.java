package javatopicspracice.exception.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import practicesession.mainmethod;

public class FileHandling {
	// read by character
	int c;
	File file;
	FileReader reader;
	// read by word
	FileInputStream fis;
	InputStreamReader isr;
	BufferedReader br;
	String str;

	public void filemanaging(String path) throws IOException {

		file = new File(path);// this object is to provide file access

		FileReader reader = new FileReader(file);// this is to read file witch location is provided by file ref.var
		

		while( (c = reader.read()) != -1)

		{

			System.out.print((char) c);
		} // to convert int to char
	}

	public void filereadbyline(String path) throws IOException {
        file = new File(path);
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);
		
		while ((str=br.readLine())!= null) {
		/*do {
			str=br.readLine();
			System.out.println(str);

		}while(str!=null);*/
		System.out.println(str);}

	}

	public static void main(String[] args) {

	}
}

class B {
	public static void main(String[] args)  {
		FileHandling a1 = new FileHandling();
		try {
			//a1. filereadbyline("C:\\Users\\Addu\\eclipse-workspace\\java class\\src\\javatopicspracice\\exception\\checkedexception\\deepthi.txt");
			a1.filemanaging("C:\\Users\\Addu\\eclipse-workspace\\java class\\src\\javatopicspracice\\exception\\checkedexception\\deepthi.txt");
		} catch (Exception e) {
			// TODO: handle exception
		
		
			e.printStackTrace();
		}
		
	}

}
