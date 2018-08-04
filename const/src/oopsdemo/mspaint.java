package oopsdemo;

import java.util.Scanner;

class agenegative extends Exception
{
	public void Display(int a)
	{
		System.out.println("age is negative"+ a);
	}
}
public class mspaint 
{
	public static void main(String[] args)throws Exception 
	{
		int age = 0;
		try {
			Scanner t=new Scanner(System.in);
			System.out.println("Enter name and age");
			String name=t.next();
			age= t.nextInt();
			if(age<=0)
			{
				throw new agenegative();
			}
			else
			{
				System.out.println("Name="+name);
				System.out.println("Age="+age);
			}
		}
		catch(agenegative ae)
		{
			ae.Display(age);
		}
	}
}
