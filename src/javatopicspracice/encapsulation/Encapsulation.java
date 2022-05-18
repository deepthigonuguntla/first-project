package javatopicspracice.encapsulation;

public class Encapsulation {
	// encapsulation means hiding an information by using private access specifier.

	private int stuSNN;
	private String stuname;
	private int stuage;

	public int getstudentSNN() {

		return stuSNN;
	}

	public String getstudentname() {
		return stuname;
	}

	public int getstudentage() {
		return stuage;
	}

	public void setstudentSNN(int newnumber) {

		stuSNN = newnumber;

	}
	public void setstudentname(String newname) {

		stuname = newname ;

	}
	public void setstudentage(int newage) {

		stuage = newage ;

	}


	public static void main(String[] args) {

	}
}

class encapstest {

	public static void main(String[] args) {
		Encapsulation a1 = new Encapsulation();
		a1.setstudentSNN(1234);
		a1.setstudentname("deepthi");
		a1.setstudentage(14);
		
		
		int VALUE = a1.getstudentSNN();
		System.out.println(VALUE);
		
		String name=a1.getstudentname();
	System.out.println(name);
		 int age =a1.getstudentage();
		 System.out.println(age);
	}
}
