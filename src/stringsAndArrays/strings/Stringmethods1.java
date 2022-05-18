package stringsAndArrays.strings;

public class Stringmethods1 {
	String s1= "my name is deepthi.i am in bgl.i am learning java";
	//how many times a string occured in a paragraph
	public  void stringaccuredinparagraph() {
		 char[] ch1= {'a','b','c'};
		
		String s4=String.copyValueOf(ch1, 0, 2);//value of array index 0,length2
		String s3=String.copyValueOf(ch1);
		String s5=String.valueOf(ch1);
		String s6=String.valueOf('g');	
		
		System.out.println(s4);
		System.out.println(s3);
		System.out.println(s5);	
		System.out.println(s6);
		
	
	}
public static void main(String[] args) {
	Stringmethods1 refvar =new Stringmethods1();
	refvar.stringaccuredinparagraph();
}
}
