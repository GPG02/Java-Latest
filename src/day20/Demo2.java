package day20;

public class Demo2 {

	public static void add(int i,int j)
	{
		System.out.println("Adding int");
		System.out.println(i+j);
	}
	
	public static void add(double i,double j)
	{
		
		System.out.println("Adding double");
		System.out.println(i+j);
	}
	
	public static void add(String s,int i)
	{
		System.out.println(s+i);
	}
	
	
	public static void main(String[] args) {
		
		Demo2.add(10,20);
		Demo2.add(10.34,20.45);
		Demo2.add("Abcd",124);
		
		
	}

}
