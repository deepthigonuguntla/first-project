package javatopicspracice.exception.checkedexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	
	String path="C:\\Users\\Addu\\eclipse-workspace\\java class\\src\\javatopicspracice\\exception\\checkedexception\\abc.txt";
	FileReader reader;
	public void chekedexception()  {
	File abcfile=new File(path);//because it is a checked exception its must and should  to write either try-catch (or)throws exception.
	try {
		reader=new FileReader(abcfile);
		System.out.println(reader.read());
	} catch (FileNotFoundException e) {
	System.out.println("file not found exception of catch block");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	
	public void M1() throws IOException {
		File abcfile=new File(path);
		reader=new FileReader(abcfile);
		System.out.println(reader.read());
		}	
	
public static void main(String[] args) throws IOException
{
	
	CheckedException a1= new CheckedException();
	a1.chekedexception();
	a1. M1();
}
}
