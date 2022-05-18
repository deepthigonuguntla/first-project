package practicesession;

public class constructor {
	int p=2,r,x;
	float q=1.2f,y;
	
 public constructor (){
	 x=19; r=20;y=2.2f;
	 p=4;
	 
	 //constructor is used to initialize variables
	 System.out.println("i am from default constructor"); 
		
	 System.out.println(x + "  "+ p);
		 
		 
	 }
public constructor(int x) {
	x=13;
	r=15;
	System.out.println("i am from int arg constructor"); 
	
System.out.println(x + "  "+ y);

 }
public  constructor (double y) {
	x=15;
	y=12.5d;System.out.println("i am from double arg constructor"); 
	
System.out.println(x + "  "+ y);

	
}
public static void main(String[] args) {
	constructor c= new constructor(4);//it always calls int arg constructor because its most generic one
	//constructor c= new constructor(0);
}
}
 

