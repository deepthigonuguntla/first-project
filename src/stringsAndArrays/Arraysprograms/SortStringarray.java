package stringsAndArrays.Arraysprograms;

import java.util.Arrays;

public class SortStringarray {
	static String s1="i am deepthi. i am staying in bgl. i am studying";
	public static void stringarray() {
		String[] stringarray=s1.split(" ");
		

	
		
		for(String x:stringarray) {
		
			
		System.out.println(x);}
	}
	public static void main(String[] args) {
		SortStringarray a1  = new SortStringarray();
		a1.stringarray();
}

}