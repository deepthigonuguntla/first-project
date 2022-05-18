package practicesession;

public class TypeCasting {
	public static void main(String a[]) {
		int x=4;//its range is from -2power(31) to 2power(31)-1 i.e -2147483648 to 2147483647
		float y=3.56f;//value range is unlimited
		double d=346789023456d;//range is unlimited and this datatype also used for decimal values just like float
		double d1=234567.78d;
		short z=-32767;//value range is -32768 to 32767
		long l= 12345678;//its range is from -2power(63) to 2power(63)-1
		boolean b=true;//used to store only 2 possible values TRUE/FALSE
		byte c=-128; //range is -128 to 127
		char letterA='a';//used to store charector
		char letterB='-';
		
		x=(int)y;
		System.out.println(x);
		x=(int)d;
		System.out.println(x);
		x=z;
		System.out.println(x);
		x=(int)l;
		System.out.println(x);
		x=c;
		System.out.println(x);
		x=letterA;
		System.out.println(x);//a ascii value is 97,so  output is 97
		y = (float)x;
		y=(float)letterB;
		System.out.println(y);
	    System.out.println(y);//output is 45 because '-' dec. value is ...45
		
		
		
		
		
		
		
	
	
	
	}
}
