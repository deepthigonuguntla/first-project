package stringsAndArrays.strings;

public class Numberofstringsinarray {
	public void countstrings() {
		int count=0,count1=0;String s1="i am deepthi. i am from banglore. i am housewife? my daughters r addu and kiyaa";

		String[] arr = s1.split(" ");
		String[] arr1=s1.split("[!?.:]");
	for(String x:arr) {
		count++;
		System.out.println(x);
	}
	System.out.println("number of words in s1="+count);
	System.out.println();
	for(String s:arr1) {
		count1++;
	}
	
	System.out.println("number of sentences in s1="+count1);
	
	}
	
	
public static void main(String[] args) {
	Numberofstringsinarray a1=new Numberofstringsinarray();
	a1.countstrings();
}
}
