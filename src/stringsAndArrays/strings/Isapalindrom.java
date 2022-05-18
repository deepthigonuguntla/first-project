package stringsAndArrays.strings;

public class Isapalindrom {

	String s1 = "gadag";
	int flag = 0;
	int n = s1.length();

	public void isapolyndrom1() {
		for (int i = 0; i < n - 1; i++) {
			if (s1.charAt(i) != s1.charAt(n - i - 1)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("given string is not a polyndrom");

		} else
			System.out.println("given string is polyndrom");

	}

	public static void main(String[] args) {

		Isapalindrom a = new Isapalindrom();

		a.isapolyndrom1();
	}
}
