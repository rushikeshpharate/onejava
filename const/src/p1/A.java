package p1;

public class A {
	
	A(){
		this(5);
		System.out.print("A");
	}
	A(int x){
		System.out.println("AA"+x);
	}
	

	void m1() {
		System.out.println("insidde A");
	}


/*class B extends A{
	B(int x){
		//super(5);
		
		System.out.println("B"+x);
	}
	
	
	void m1() {
		System.out.println("inside B");
		super.m1();
	}
	
	
	*/
	public static void main(String[] args) {
		//B b = new B(4);

		//b.m1();
		
		new A();
	}
}
