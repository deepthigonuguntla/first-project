package stringsAndArrays.Arraysprograms;
import java.util.Arrays;

public class  removeduplicatesfromarray{
static int[] arr= {1,10,19,1,2,10,19,15,15};
int[] arr1;

public  void sortarray() {
Arrays.sort(arr);//inbuilt arrays method

/*for(int i=0;i<arr.length;i++)
{System.out.print(" ");
	System.out.print(arr[i]);
}*/
for(int x:arr) {
	 
System.out.print(" "+ x);
}

}
	
public static void main (String[] args) {
	removeduplicatesfromarray a =new removeduplicatesfromarray();
	a.sortarray();
}
}