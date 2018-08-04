package oopsdemo;

import java.util.Scanner;
interface p2{
	
}
public class D {

	int a;
	float b;
	String c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
		System.out.println("inside it a");
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
		//System.out.println("inside b");
		
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
		//System.out.println("inside  c");
	}
/*	@Override
	public String toString() {
		return "D [a=" + a + ", b=" + b + ", c=" + c + ", getA()=" + getA() + ", getB()=" + getB() + ", getC()="
				+ getC() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}*/
	
	
	
}

class F extends D{

	
	int a;
	float b;
	String c;
	public int getA() {
		System.out.println("inside getter a");
		return a;
	}
	public void setA(int a) {
		this.a = a;
		super.setA(a);
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
		super.setB(b);
	}
	public String getC() {
		//super.setC(c);
		return c;
		
	}
	public void setC(String c) {
		this.c = c;
		super.setC(c);
		//System.out.println("inside child c ");
	}
	
	
	
}

class App{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		float b= s.nextFloat();
		String c= s.next();
		
		
		
		
		D d = new F();
		d.setA(a);
		d.setB(b);
		d.setC(c);
		System.out.println(d.getA());
		System.out.println(d.getB());
		System.out.println(d.getC());
	}
}
