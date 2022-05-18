package stringsAndArrays.strings;

public class indent {
	String s1="i am deepthi.my hub is ravi.my house is in bgl";
	String s2="  string";
	public void indent() {
    String stringafterspacesincerted= s1.indent(4);
   String stringafterspacesremoved=s2.indent(-1);
   String stringafterspacesremoved1=s1.indent(-8);
   
    System.out.println(stringafterspacesincerted);
    System.out.println("stringafterspacesremoved="+stringafterspacesremoved);
    System.out.println("stringafterspacesremoved1="+stringafterspacesremoved1);
		
	}
public static void main(String[] args) {
	indent n=new indent();
	n.indent();
	
}
}
