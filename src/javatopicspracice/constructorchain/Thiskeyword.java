package javatopicspracice.constructorchain;

public class Thiskeyword {
	int x=10;
	//this keyword is used to repersent global variable of that class inside constructor or method in that class
	
	public Thiskeyword(int y) {
		//this.x=y;
	}
public  void m1(int x) {
	this.x=x;
	//x=x;this wont work
	//x=z;
}
		public static void main(String[] args) {
			
			Thiskeyword obj = new Thiskeyword(30);
			obj.m1(0);
			System.out.println(obj.x);
			for(int i=4;i<0;i--)
			{
				for(int j=i;j<0;j--)	{
					int k=0;
					System.out.print(k);
					System.out.print("\t");
					k++;
				}
			}
			System.out.println("");
		}

	}

