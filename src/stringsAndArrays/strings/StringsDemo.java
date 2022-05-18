package stringsAndArrays.strings;

public class StringsDemo {
	int x=10;
	static String s1 = "Ashok";
	String s2 = "Ashok";
	
	static String s3 = new String("Ashok");
	static String s4 = new String("Ashok");
	
	String s5 = "Ashok1";
	
	public void isEqual()
	{ 
		
		//System.out.print();
		boolean s1isEqualTos2 = s1 == s2 ;
		boolean s1isEqualTos3 = s1 == s3 ;
		boolean s3isEqualTos4 = s1 == s4 ;
		
		System.out.println("s1 isEqualTo s2 --> " + s1isEqualTos2);//o/p is true
		System.out.println("s1 isEqualTo s3 --> " + s1isEqualTos3);//o/p is false
		System.out.println("s3 isEqualTo s4 --> " + s3isEqualTos4);//o/p is false
		
		// Comparing the content of string vars using String class methods
		
		// CompareTO, Equals
		
		// abc with xyz
		
		System.out.println("s1.compareTo(s3) --> " + s1.compareTo(s3));//this is inbuilt statement in java-->it compares the charactors ASCIIvalues and gives o/p either zero or +ve value or -Ve value
		
		System.out.println("s1.equals(s3) --> " +s1.equals(s3));//this compares the string values irrespective of which adddress it stored
		System.out.println("s5.equals(s4) --> " +s5.equals(s4));
		System.out.println("abc.compareTo(xyz) --> " + "abc".compareTo("xzy"));
		System.out.println("ABC.compareTo(abc) --> " + "ABC".compareTo("abc"));
		System.out.println("ABC.compareToignorcase(abc) --> " + "ABC".compareToIgnoreCase("abc"));
	}
	
	public static void main(String[] args) 
	{
		StringsDemo sd = new StringsDemo();
		sd.isEqual();

	}

}



