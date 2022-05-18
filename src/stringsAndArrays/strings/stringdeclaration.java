package stringsAndArrays.strings;

import java.util.Iterator;

public class stringdeclaration {
	
    String s="deepthi";//this store string in string constant poll
 	String s1= new String("deepthi");//this create string object in heap memory
 	
static	String s2= new String("deepthi");//this store string in heap memore by creating object and s1 != s4 
static String s3="deepthi";//this store string in static memory
String s4="deepthi";//s4 and s variables pointing same string 
static String s5="deepthi";//s3 and s5 variables pointing same string
static String[] arr=new String[5];
static String[] arr1=new String[]{"abc","xyz","null"," ","hi"};
static String[] arr2={"abc","xyz","null"," ","hi"};
int[] arrint = new int[] {1,2,3,4};
int[] arrint4 = new int[4] ;
int[] arrint1= {0,1,2};
int[] arrint2= {0,1,2};
 static int[] arrint3= {0,1,2};
	

public static void main(String[] args) {
	stringdeclaration obj = new stringdeclaration();
	arr[0]="kiyara";
	arr[1]="addu";
	//System.out.println(obj.arrint1==obj.arrint2);
	System.out.println(obj.s==obj.s1);
	System.out.println(s3==obj.s1);
	System.out.println(s3==s5);
	System.out.println(obj.s4==obj.s);
//System.out.println(arr);//this is not right thing to call array .u should use for loop or for each loop to retrive values from array
 for(String s:arr) {
	System.out.print(s+" ");
}
 for(int i=0;i<arr1.length;i++) {
	System.out.print(arr1[i]+" ");
}

	}

}
