package MatrixPatternsExamples;

public class StarPattern1 {
	public void pluspattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == n / 2 || j == n / 2) {
					System.out.print("*");
				}

				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
	}
}

class A {
	public static void main(String[] args) {
		// StarPattern1 a1=new StarPattern1();
		StarPattern1 a1 = new StarPattern1();
		a1.pluspattern(5);

	}

}
