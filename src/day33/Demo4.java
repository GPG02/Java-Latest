package day33;

import java.io.PrintStream;

class Belt
{
	String color;
	
	Belt(String color)
	{
		this.color=color;
	}
	public void getColor()
	{
		System.out.println(color);
	}
}

class Dog
{
	static Belt belt=new Belt("Black");
	
}
public class Demo4 {

	public static void main(String[] args) {
		
		Belt b = Dog.belt;
		b.getColor();
		
		Dog.belt.getColor();
		
		PrintStream v = System.out;
		v.println();
	}

}
