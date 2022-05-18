package practicesession.objectdmo1;
public class A {
	int x= 3;
	char b;
	public A(int p) 
		{
		x=p;
		}
		public int returnvalue()
		{
			//System.out.println("return value from returnvalue method ");
			return x;
		}
	public static A returnobjectofAclass()
	{
	A a1 = new A(10);
	return a1;
	}
	public static void main (String[] arg) {}
	}
		  
	 class B{
		public static void main(String[] args) {
		
	A a2 = new A(23);
		int value= a2.returnvalue();
		System.out.println("value returned from return value method-->"+value);
		A a3=A.returnobjectofAclass();//static methods can be accessed using its class name
		System.out.println(a3.returnvalue());
		
	}
	

}
