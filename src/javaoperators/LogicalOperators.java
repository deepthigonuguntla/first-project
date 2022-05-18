package javaoperators;

public class LogicalOperators {
	
	//&&,||,!-->logical operators
	//&& if both operands r true then condition becomes true
	//||-->if any of the 2 operands is true then condition becomes true
	//!-->if condition is true logical not operand make it false
boolean a;
boolean b;
public void method() {
	System.out.println("a&&b="+(a&&b));
	System.out.println("a||b="+(a||b));
	System.out.println("!b="+(!b));
	
}

	public static void main(String[] args) {
		//for calling not static variables we should write object
		LogicalOperators A = new LogicalOperators();
		A.a = true;
		A.b=false;
		A.method();

	}

}
