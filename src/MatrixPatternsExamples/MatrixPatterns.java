package MatrixPatternsExamples;

public class MatrixPatterns {
	/* *
	    *
	   **
	  * *
	*****
	     *
	    * *
	   * * *
	  * * * *
	 * * * * *
	***
	 **
	  *
	     *
	    **
	   ***
	  ****
	 *****
	 * * * *
	  * * *
	   * *
	    *
	   *
	  * *
	 * * *
	  * *
	   *
	*****
	*   *
	*   *
	*   *
	******/

	public static void patternstars(int x, int y) {
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

//for arranginns in proper formate of class cntl+shift+f is short cut
	public static void trianglepattern1(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void trianglepattern(int n) {
//5=i,4=j
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void reversetriangle(int n,int m) {
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <=m; j++) {
				if
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	/*public static void diamondpattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = n - i; k > 0; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}*/

	

	public static void trianglepattern11(int n,int m) {

		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j<=n-i)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void starsrectanglepattern(int n, int k) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				if (i == n - 1 || i == 0 || j == 0 || j == k - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}}

		public static void diamond(int m,int n) {

			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					if (j<=n-i)
						System.out.print(" ");
					else
						System.out.print(" *");
				}
				System.out.println();
			}
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					if (j<=i)
						System.out.print(" ");
					else
						System.out.print(" *");
				}
				System.out.println();}
			

		}
	

	public static void main(String[] args) {
		//starspattern1(5);
		//trianglepattern(5);
		 //patternstars(4,4);
	     //trianglepattern1(6);
		//reversetriangle ();
		 //diamondpattern(3);
		diamond(4,4);
		trianglepattern11(4,4);
		//starsrectanglepattern(5, 5);
	}
}
