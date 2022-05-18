package javatopicspracice.finaldemo;

public class finalkeyword {
	//final variables
	final static int x=10;
	final  int z;//final variables(x is global variable here) should initialize at this point itself.
	//if we miss here we can initialize in constructor
	static int y=20;
	public finalkeyword() {
		z=11;
		
	}
	
	public void finalvariable() {
		 // x=30;-->u can not change final variable value at any point of time
		y=5;
		System.out.println("final variable x="+x);
	}
public static void main(String[] args) {
	finalkeyword a1=new finalkeyword();
	
	a1.finalvariable();
	
}
}
