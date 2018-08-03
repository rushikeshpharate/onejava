package casting;

public class test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.test1();
		Child  c = (Child)p;
		c.test1();
	}

}
