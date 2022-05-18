package javatopicspracice.exception;

public class finallyblock {
	int x;
	public void arthmaticexception(int x1,int x2) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
		int x=x1/x2;
		System.out.println(x);}
		/*catch(ArithmeticException e) {
			System.out.println("start of catch block");
		System.out.println(	e.getCause());
		System.out.println(e.getMessage());
	System.out.println("end of catch block");}*/
		
		
		finally{
		  System.out.println("===========finallyblock===========");
		  try {
				int x=x1/x2;
				System.out.println(x);}
				catch(ArithmeticException e) {
					System.out.println("start of catch block");
				System.out.println(	e.getCause());
				System.out.println(e.getMessage());
			System.out.println("end of catch block");}
		System.out.println(4);
		System.out.println(5);
		System.out.println("======end of finally block==========");}
		System.out.println(6);}
		
		
	

	public static void main(String[] args) {
		
		 finallyblock a1=new  finallyblock();
		 a1.arthmaticexception(4, 0);
		
	}
	
	
}
