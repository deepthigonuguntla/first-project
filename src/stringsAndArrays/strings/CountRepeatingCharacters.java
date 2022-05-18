package stringsAndArrays.strings;

public class CountRepeatingCharacters {
	String s1 = "karnataka";
	

	private void countchars() {
		int count=1;
		while(s1.length()>=1) {
			
			char chartocheck = s1.charAt(0);
			System.out.println(chartocheck);
			
			for (int i = 1; i < s1.length(); i++) {
				
				if (chartocheck == s1.charAt(i)) {
					
					count++;
				}
			}
			System.out.println("  "+chartocheck + "--" + count);
			
			s1 = s1.replaceAll(s1.valueOf(s1.charAt(0)), "");
			//s1.replace('k', '0');
			
			//null means--string is not initialized,""---means string is initialized with empty
			System.out.println(s1);
			count = 1;
		}

	}

	public static void main(String[] args) {
		CountRepeatingCharacters a1 = new CountRepeatingCharacters();
		a1.countchars();
	}
}