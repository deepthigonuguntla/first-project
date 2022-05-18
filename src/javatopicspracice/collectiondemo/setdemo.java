package javatopicspracice.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {
	public static void main(String[] arg) {
		//no duplicates
		//set not store values in order 
		//no index ----so to retrieve objects in set we can't use get(gett index i)
	Set<Object> set = new HashSet<Object>();
	set.add("deepthi");
	set.add(1);
	set.add('c');
	set.add(3);
	set.add(";");
	set.add("kiya");
	set.add("kiya");//even though we add duplicates in set in output we dont have that duplicate value in set
	set.contains(";");
	Iterator<Object> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.print(" "+itr.next());
	}
	
	
	}
	
}
