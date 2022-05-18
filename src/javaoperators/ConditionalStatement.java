package javaoperators;

public class ConditionalStatement {
	static int a=850; static int b=900; static int c=1000; static int d=1100;static int e=3000;
	
	 
	public static void findinglargesnumber() {
		if(a>b && a>c)
		{
		 if(a>d&&a>e){
			 System.out.println(a);}
			 else if(d>e){
				  System.out.println(d);
			 }
				  else  {
					  System.out.println(e);
				  }
			  }
				  	 
		 else if (b>c)
		 {
			 if (b>d&&b>e) 
			 { System.out.println(b);}
			else if (d>e) {
				System.out.println(d);}
			else {
					System.out.println(e);
				}
			
			}
			
		 
			 
		 
	 else {
		 if(c>d&&c>e)
		 { System.out.println(c);}
		      else if (d>e) {
					System.out.println(d);}
					else {
						System.out.println(e);
					}
				
				 }

	}
		 
	
		
		
		 public static void main (String[] arg)
		{
			findinglargesnumber();
		}

}
		
			 		
		
	
	


