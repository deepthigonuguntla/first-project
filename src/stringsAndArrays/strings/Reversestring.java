package stringsAndArrays.strings;

public class Reversestring {

	public static void main(String[] args) {
		String s= "advaitha";
	
		int n=s.length();
		String s1="";
		for(int i=n-1; i>=0;i--) {
	
		s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
