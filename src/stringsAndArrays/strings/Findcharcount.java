package stringsAndArrays.strings;
import java.util.Arrays;

public class Findcharcount {
	//sort string array
	String s1="karnataka";
	public void sortarray() {
		char[] chararray=s1.toCharArray();
	
		Arrays.sort(chararray);
		int count=0;
		for(char i:chararray) {
			count++;
			
			System.out.println(i);
			}
		System.out.println(count);
	}
	
			
			
		
	
			
				
		
			
		public static void main(String[] args) {
	Findcharcount a1=new Findcharcount();
	a1.sortarray();
	
		
	}
	
}

