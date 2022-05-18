package javaoperators;

public class forloopexample {
	/*public static void main(String [] arg) {
		//rows -->2
		//Columns-->3
		//writing to print matrix
		for(int i=1;i<3;i++)//for rows 
			{
			for(int j=1;j<4;j++)//for columns
			{
				System.out.print(i*j+" ");//after printing i*j give space
			}
			//when second for loop condition fails it goes to new line and first for loop
			System.out.println();//start printing in new line
		}
		
	}*/
	//program to print * in triangle form matrix

	public static void main(String [] arg) {
	
		for (int i=1;i<4;i++) {
			for (int j=1;j<4;j++) {
				if(j<=i) 
					{System.out.print('*'+" ");}
				else
					System.out.print("  ");
			}
				System.out.println();	
				
				
			}
		}
		
	}
	
	

