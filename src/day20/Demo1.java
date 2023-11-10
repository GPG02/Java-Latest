package day20;

public class Demo1 {

	public static void addInteger(int i,int j)
	{
		System.out.println("Adding int");
		System.out.println(i+j);
	}
	
	public static void addDouble(double i,double j)
	{
		
		System.out.println("Adding double");
		System.out.println(i+j);
	}
	
	public static void addStringNumber(String s,int i)
	{
		System.out.println(s+i);
	}
	
	public static void main(String[] args) 
	{
		Demo1.addInteger(10,20);
		Demo1.addDouble(10.34,20.20);
		Demo1.addStringNumber("Bhanu", 10);

	}

}
