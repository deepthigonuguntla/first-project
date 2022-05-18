package javatopicspracice.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class  Listdemo {
	//array list is a class of  list interface
	public static void arraylist() {
	int[] arr= new int[18];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=3;
	//arr[4]="somala"; -->this is an integer array.we can add only int values
	ArrayList lst=new ArrayList();
	System.out.println("size of arraylist before adding objects  ="+"   " + lst.size());
	lst.add(1);
	lst.add("addu");
	lst.add(4.4f);
	lst.add(":");
	System.out.println("size of arraylist after adding objects  ="+"   " + lst.size());//to check size of arraylist
	System.out.println("size of array   =" +"   "+ arr.length);//to see length of array
	}
public static void  addmethod() {
	ArrayList a=new ArrayList();
	List lst1=new ArrayList();//creating object with parent in LHS and child in RHS
	a.add(1);
	a.add("dee");
	a.add(2, "!");//which adds ! at index 2 of 'a' arraylist
	System.out.println(a);
	ArrayList b=new ArrayList();
	a.add(2);
	a.add("dee");
	a.add(2, "pp");
	System.out.println(b);
	b.addAll(a);
	System.out.println("after adding a to b"+"  "+b);
	System.out.println(b.contains(1));
	b.add(5, "addu");
	System.out.println("after adding object at index 5"+"  "+b);
	/*int[] arr= new int[3];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[1]=10;
	//System.out.print("after replacing value in ndex 1 of arr"+ "  ");
*/	/*for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);		
	}*/
	
	/*ListIterator itr =  b.listIterator();
	while(itr.hasPrevious()){
		System.out.print("  "+itr.previous());
	}*/
	//we can retrieve values from list just with reference variable or by using iterator
	ListIterator itr= b.listIterator();
	
	while(itr.hasNext())
	{
	Object obj =	itr.next();
	System.out.println(obj);
		//System.out.print(" "+itr.next());
		
	}
	//System.out.println(itr.hasPrevious());
	
	
	

	
		
	}

	public static void main(String[] args) {
		arraylist();
		addmethod();
	}
}