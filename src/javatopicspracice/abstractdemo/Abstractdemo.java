package javatopicspracice.abstractdemo;

abstract class class1 {
	int x=10;
	public 
	String s="abc";
	public static void m1() {
		System.out.println("i am in m1 method");
		
	}
	public abstract void m2();
	//if a class having atleast one abstact method  that class must be declared as abstact class
	//we can declare a class as abstact class even though we can declare a class as abstact class`
	
	

}

 public class Abstractdemo extends class1{
	 public static void main(String[] args) {
		 //class1 c= new class1(); u can't instanciate abstact class
		m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}


	
 }