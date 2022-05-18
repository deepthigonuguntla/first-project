package javatopicspracice.mainmethodoverride;

public class MainMethod {
	
 public static void main(String[] args) {
	String[] s1= {"abc","xyz"}	;
	String[] s3= new String[]{"abc","xyz"}	;
	String s2= new String();
	
	main(s1);
main("hi");
MainMethod.Main(0);
	}

	//we can overload main method but we can't override main method
	
	public static void main(String s) {
		System.out.println("i an in overloaded mainmethod");
	}
    public static void Main(int x) {
		System.out.println("i am in overloaded main method with 2 perameters");
	}
    public static void Main(String[] s1) {
    	System.out.println(s1);
    }
	 
}
