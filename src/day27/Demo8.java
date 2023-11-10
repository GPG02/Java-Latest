package day27;

public class Demo8 {
	static int i=10;
	int j=20;
	Demo8()
	{
		System.out.println("UDC");
	}
	
	static 
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		
		System.out.println("main");
		Demo8 d=new Demo8();
		System.out.println(d.i);
		System.out.println(d.j);

	}

}
