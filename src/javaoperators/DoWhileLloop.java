package javaoperators;

public class DoWhileLloop {
	public static void main(String [] arg)
	{
	if(true) {
		System.out.println(1);
	}

	else if (false) {
		System.out.println(2);
		}
	else if (false) {
		System.out.println(3);
		}
	else if (false) {
		System.out.println(false);
		}
	else {
		System.out.println(true);
	}


	System.out.println("puzzle is completed");
	dowhileloop();
}



static int i=1;
 public static void dowhileloop()
 {
	 
 do{
	 System.out.println(i);
	 i++;
	 }while(i <= 10);
}

 }