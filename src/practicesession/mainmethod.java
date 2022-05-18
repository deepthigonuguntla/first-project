package practicesession;

public class mainmethod {
	
	// variable declaration
	int q=40;
	public static int w=5;
	
	//writing structure 
	public mainmethod () {
		int x=7,y=3;
	}
//writing a static & non static method
	/*
	 * static method syntax-->public static returntype methodname(parameters)
	 * within static method we can call only static members(structures and methods)
	 */
	public static void mul(int a,int b)
	{
		int mulresult = a*b;
		System.out.println(mulresult);
		System.out.println(w);	
		}
	//non static method
	/*
	 * syntax -->public returntype methodname(parameters)
	 * in non static method we can call both static and non static members
	 */
	public int div(int x,int y) {
		int z=x/y;
		
		System.out.println(z);
		return z;
	}
	public static float div1(float t,float r ) {
		float quotient=t/r;
		float reminder= t%r;
		System.out.println(quotient);
		System.out.println(reminder);
		return quotient;
		
		}
	public static int add(int a,int b) {
		int f=a+b;
		return f;	
	}
	/*main method syntax--->public static void main (string a[])
	*in order to execute a class writing main method is must and should
	*/
	public static void main (String a[]) {
		
		System.out.println("welcom to main method");
	    mul(2,3);
		add(4,5);
		//because division method is non static method we can'n call it in static method
		//if we do that we get error
		int valuereturnedfromadd = add(4,5) ;
		System.out.println(valuereturnedfromadd);
		div1(10,3);	
		
	}
	}
	
	

