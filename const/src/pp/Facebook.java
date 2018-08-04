package pp;

public class Facebook {
	
	int id;
	static int i;
	
    static void likepic()
    {
    	i++;
    	System.out.println("like" +i);
    }
}

class Testfacebook
{
	public static void main(String[] args) {
		
		Facebook.likepic();
		Facebook.likepic();
		Facebook.likepic();
		
		
		
	}
}
