package stringsAndArrays.strings;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s="army";
		String s1="mary";
		
		char[] arr=s.toCharArray();
		char[] arr1=s.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr, arr1)) {
			System.out.print(s +"  "+ s1+"  are anagrams");
			
		}
		else
			System.out.print(s +"  "+ s1+"are not anagrams");
		
	}

}
