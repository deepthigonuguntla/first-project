package javatopicspracice.finaldemo;

public final class FinalClass {
	public void test() {
		System.out.println("method from final class");
		
	}
	
public static void main(String[] args) {
	
}
}

  class C{
	  public void test() {
			System.out.println("method from B class");
			
		}
	  public static void main(String[] args) {
		  
		  FinalClass a1=new FinalClass();
		  a1.test();
	  }
	
}
  
  
  
  
//final class can't be inherited.final class does not have any child classes.only we can create object. 
 /* class c extends FinalClass{
	  public void test() {
			System.out.println("method from c class");
			
		}
	
} */