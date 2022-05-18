package javatopicspracice.constructorchain;

public class This extends Object {
	public This() {
		super();//constructor from object class .kept by compiler itself
		System.out.println("print default constructor");

	}

	public This(int x) {
		this();// its for calling same class default constructor

		System.out.println("print parameterised constructor");
	}

	public static void main(String[] args) {
		This a1 = new This(10);
		for(int i=4;i<0;i--)
		{
			for(int j=i;j<0;j--)	{
				int k=0;
				System.out.print(k);
				k++;
			}
			System.out.println("");
		}
		


	}

}

class B extends  This
{
	public B() {
		super(10);//u should mention super() in first line of constructor itself
		System.out.println("b class default constructor");
	}
	public static void main(String[] args) {
		B a2=new B();
	}
}