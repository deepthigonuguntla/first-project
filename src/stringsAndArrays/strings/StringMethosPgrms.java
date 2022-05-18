package stringsAndArrays.strings;

public class StringMethosPgrms {

	String s = "  my name is deepthi  ";
	String s1 = new String("kiyaara");
	String s4 = new String("kiyaara");
	String s2 = "kiyaara";
	String s3 = "kiyaara";

	public void isequals() {
		boolean s2isEqualTos3 = s2 == s3;
		System.out.println(s2isEqualTos3);
		boolean s1isEqualTos4 = s1 == s4;
		System.out.println(s1isEqualTos4);
		boolean s3isEqualstos4 = s3 == s4;
        System.out.println( s3isEqualstos4);
	}

//Comparing the content of string vars using String class methods
//CompareTO, Equals---
	public void compareTo() {
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s));
	}

	public void equals() {
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
	}

	public void split() {
		String[] arr = s.split(" ");
		for (String x : arr)
			System.out.println(x);

	}

	public void touppercase() {
		String s4 = s.toUpperCase();
		System.out.println(s4);
	}

	public void contains() {
		boolean iscontains = s.contains(s1);
		System.out.println(iscontains);
	}

	public void removespace() {
		String removespaceatend = s.trim();
		System.out.println(removespaceatend);
	}

	public void indexofchar() {
		String a = "my name is ravi";
		int indexofchar = a.indexOf('i');
		System.out.println(indexofchar);
	}

	public void replaceword() {
		String a = "my name is ravi";
		String replaceword = a.replace("ravi", "advaitha");
		String replacechar = a.replace('r', 'k');
		String replacefirstchar = a.replaceFirst("i", "v");
		String replaceall = a.replaceAll("i", "m");
		System.out.println(replaceword);
		System.out.println(replacechar);
		System.out.println(replacefirstchar);
		System.out.println(replaceall);

	}

	public static void main(String[] args) {
		StringMethosPgrms a = new StringMethosPgrms();
		//a.isequals();
		 a.compareTo();
		 a.equals();
		/*a.split();
		a.touppercase();
		a.contains();
		
		a.indexofchar();
		a.replaceword();*/
		 a.removespace();
	}
}
