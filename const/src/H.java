//import java.io.IOException;

public class H {

	
	private H(){
		System.out.println("inside H constructor");
	
}
	public static void m1() throws Exception{
		throw new ArithmeticException();
	}
	
	public static void G() {
		try{
			 int n=0;
			if (n==0) {
				n=5/n;
			}
				
		}
		catch (Throwable q) {
			System.out.println("ae ");
		}
		
		
	}
	
	
public static void gh (){
	H h = new H();
}
}


class F{
	public static void main(String[] args)throws Exception {
	
		H.gh();
		H.G();
		H.m1();
		
		
		
		
		
	}
}


/*class G extends H{
	super();
}*/
