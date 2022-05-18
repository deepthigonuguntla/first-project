package practicesession;

public class ObjectDemo {
	public static int p, q;//static variable
	int z;//non static variable
	public ObjectDemo ()//constructor
	{
		System.out.println("welcomtoconstructor");
		int a=10,b=12;
		}
	public static void add(int x,int y) {
		int addresult =x+y;
		System.out.println(addresult);
		}
	
	public static void main(String[] args)//main method syntax
	{
		add(4,5);
		//object-->to call one class in another class we need to create object
       //syntax for object creation
		//classname referencevariable = new constructorofthatclass
	
		ObjectDemo refvar = new ObjectDemo();
		//if there is no constructor inside class it takes default constructor
		refvar.z=2;
		//z is anon static variable
		refvar.p=8;//p is static variable(we can call static and non static members inside object)
		refvar.add(12, 14);
		System.out.println(refvar.z);
		System.out.println(refvar.p);
	
		ObjectDemo refvar1 = new ObjectDemo();
		System.out.println(refvar.q);
		System.out.println("endofoutputanalization");
		
		
		
		
		

		
		
		
		
		
		
		
				
				
		
	
	}
}
