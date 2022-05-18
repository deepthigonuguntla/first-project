package practicesession;

public class NonstaticDoubt {

	 static int a=9;
	public static void add(int x, int y) {
		int z=x+y;
		
		
	}
	public static int add1(int e,int f) {
		int addresult = e+f;
		System.out.println(a);
		return addresult;
	}
		public static void main (String [] arg) {
			System.out.println(add1(10,9));
			
			
			//System.out.println(add(4,5));-->this give error
			//because add method has void as return type so this method is not returning anything but system.out.pritln() statement expect some value
			
			}
		
		}

