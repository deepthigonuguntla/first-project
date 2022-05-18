package practicesession;

public class GlobalAndLocalVariables {
	int x,y;
	
public GlobalAndLocalVariables(int p, int q) {
	
y=q;
x=p;
int z=9;
 
 System.out.println(z);//scope of variables p,q,z r only in this constructor because its a local to this.
	
}
public static void main(String[] args) {
	
	GlobalAndLocalVariables var=new GlobalAndLocalVariables(10,20);
	System.out.println(var.x);
	System.out.println(var.y); 
	 
}
}
