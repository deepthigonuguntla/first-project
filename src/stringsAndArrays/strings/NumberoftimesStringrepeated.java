package stringsAndArrays.strings;

import java.util.Arrays;

public class NumberoftimesStringrepeated {
	public static void main(String[] args) {
		String s="i am deepthi. i came from bgl. i have 2 daughters";
		String[] s1=s.split(" ");
		
		int count=0;
		for(String x:s1) {
			count++;
			System.out.println(x);
		}
		System.out.println("no. of words--"+count);
		
	}
	
}
			
		
	


