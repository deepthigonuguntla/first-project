package practicesession;

public class Staticvariables {
	int x;
	int y;int w;
	static int p;
	static int q=40;
	public Staticvariables() { 
		System.out.println("welcome");//to get this write syso then press control+space and enter
		x=2;y=4;p=3;
		}
	public void printvalues( ) {
		
		System.out.println("x-->"+x);// '+' is a concatenate operator .toget this in () either left side or right side thing should be  string
		//System.out.println("y-->"+y);
		System.out.println("p-->"+p);
		System.out.println("q-->"+q);
		//System.out.println(w);
	}
	public static void add(int x,int y) {
		int z=x+y;
		
	}
		public static void main(String [] arg) {
			//creating object 
			Staticvariables a1 = new Staticvariables(); //step1
			a1.printvalues();//
			add(2,3);
			
			a1.w=250;
			//creating another object 
			Staticvariables a2=new Staticvariables();
			a2.x=100;
			a2.y=200;
			a2.p=300;
			a2.w=10;
			a2.printvalues();
			
		}
		
	}
	
	

