package stringsAndArrays.strings;

public  class StringConstantPool {
	public static  String s="deepthi";
	public static void  method1(String s) {
		//String s="deepthi";
		
		s= "deepthi";
		//return s;
		System.out.println(s);
	}

	public static void main(String[] args) {
		//String s="deepthi";
		//StringConstantPool pool = new StringConstantPool();
		
		System.out.println(s=s+"abc");
		
		method1( s);
		System.out.println(s);

	}

}
