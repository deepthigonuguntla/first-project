package javatopicspracice.differentwaysofcreatingobject;
//object class is the super class of all classes
public class Object {
	public void M1() {
		System.out.println("message from M1 method");
	}
   public static void main(String[] args) {
	
}
}


class B extends Object{
	
	public void M2() {
		System.out.println("message from M2 method");
		}
	public void M1() {
		System.out.println("overriding M1 method");
	}
}

class C{
	
	public static void main(String[] args) {
		
		//1#	
	Object b1=new Object();
	System.out.println("=====case 1=======");
	b1.M1();
	
	//2#
	B b=new B();
	System.out.println("=====case 2=======");
	b.M1();
	b.M2();
	

	
	//#3
	//LHS is parent class and RHS is child class
	
	Object b2=new B();
	System.out.println("=====case 3=======");
	b2.M1();//it can call only over ridden method of parent class
	
	
	
	
	

	
		//object is created during runtime	.in above case b2 is pointing B() class during runtime.so o/p is from class B(M1)method
	}
}