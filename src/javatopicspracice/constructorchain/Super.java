package javatopicspracice.constructorchain;
//every independent class extends object class
public class Super extends Object {
	public Super() {
		super();//compiler keeps this code.super means it calls super class constructor (that is object class)
		System.out.println("output from super class");
	}
public static void main(String[] args) {
	new Super();
	
	
}
}

class A extends Super {
	public A() {
		super ();//internally compiler will keep this code
		System.out.println("output from A class ");
	}
}
class C extends A{
	public C(int x) {
		
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		new C(10);
		
	}
}