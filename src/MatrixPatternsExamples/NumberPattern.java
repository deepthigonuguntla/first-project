package MatrixPatternsExamples;

public class NumberPattern {
	static public void peramidpattern() {
		int n = 5;
		for (int i = 1; i < n; i++) {
			int num = 1;
			for (int j = i; j > 0; j--) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		peramidpattern();

	}
}