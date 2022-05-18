package stringsAndArrays.Arraysprograms;

public class ArrayDemo {
	int a1[] = new int[10];
	int[] a2 = new int[20];
	float f1[] = new float[12];
	String[] s1 = { "abc", "def", "ghi" };

	public static void main(String[] args) {

		int b1[] = new int[20];
		
		// b1[0]=1;
		// b1[1]=2;
		// other way to assign values for array is
		for (int i = 0; i < b1.length; i++) {
			b1[i] = i * i;
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < b1.length; i++) {
			
			
			//System.out.println("length of array"+b1.length);
			System.out.print(" "+b1[i]);

		}
		/*ArrayDemo arr = new ArrayDemo();// object creation for non static arrays
		arr.a2[1] = 20;
		System.out.println(arr.f1.length);
		System.out.println(arr.a1.length);
		System.out.println(b1.length);
		System.out.println(arr.a2[19]);
		System.out.println(b1[19]);*/

	}
}