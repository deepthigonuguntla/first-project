package javatopicspracice.exception;

public class Runtimeexception {
	A  a1;//default value of a1 is null;
	String s1;
	static int x;
	//null point exception
	public  void m1() {
		System.out.println("i am in m1 method");
		
	}
	public void nullpointexception() {
		System.out.println("null point exception tessting");
		// a1=new A();
		//a1.test();
		x=10;
		m1();
	
	try
	{
		System.out.println("before exception");
		a1.test();	
		System.out.println("after exception");
	}
	
catch(NullPointerException ex) {
			
		System.out.println(ex.getMessage()); 
		
	}
catch(RuntimeException ec) {
		System.out.println(ec.getMessage());
		
	}
		
	System.out.println("null point exception cleared");
	}
	
	public static void main(String[] args) {
		Runtimeexception a2=new Runtimeexception();
		a2.nullpointexception();
		
	}

}
class A{
	public  void test()  {
		System.out.println("classA");
	}
	
}