package javatopicspracice.finaldemo;



public class FinalMethod {
 final int x=10;
 final int y=20;
 public final void add(int a, int b) {
	 //final class can't be inherited.only we can create object for final class
	 //final method can't be overridden.
	 System.out.println(a+b);	 
}
 public void sub(int z) {
	// x=20;final variable can not be changed once it is inialized
	 z=x-y;
	 System.out.println(z);
 }
 
}
 class d {
//final method move from class to class with creating object.but we can not over ride final method.
	//only we can access it through object
	//public final void add(int c, int d) {  }
	
	public static void main(String[] args) {
		
		 FinalMethod a1=new FinalMethod();
		 a1.add(3, 4);
	}

}
