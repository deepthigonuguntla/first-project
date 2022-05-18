package javaoperators;

public class NumdividedBy7 {
	
	
	public static void numberdivededby7(int limit) {
		/*int i=7;int limit=200;
		do
		{
		 System.out.println(i);
		i=i+7;	
		}while(i<=limit);
		
			
	}*/
		int i=7;int num=1;String numbersdevidedby7="";
		do {
			if(num%i==0) {
				 numbersdevidedby7= numbersdevidedby7 + " " + num;	
			}
			num++;
		}while(num<=limit);
		System.out.println(numbersdevidedby7);
	}
	public static void main(String[] arg) {
		numberdivededby7(200);
		numberdivededby7(50);
		
		
	}

}
