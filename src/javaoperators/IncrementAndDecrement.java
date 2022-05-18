package javaoperators;

public class IncrementAndDecrement {
	public static void main(String[] arg) {
		int a=10;
		int b=30;
		System.out.println("a++="+(a++));//post increment-->after printing a=10 it increase value by 1 and store
		System.out.println("a--="+(a--));//post decrement-->now a=11 so it gives 11 as o/p then decrese value by 1
		System.out.println("++b="+(++b));//pre increment-->increase the value by 1 then gives o/p
		System.out.println("--b="+(--b));//pre decrement-->decrese the value by 1 then gives o/p
		
	}

}
