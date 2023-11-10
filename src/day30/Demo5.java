package day30;
class Father
{
	public  void marriage()
	{
		System.out.println("Arranged Marriage");
	}
	
	void property()
	{
		System.out.println("House Land gold FD Shares Car Bike");
	}
	
	
}

class Son extends Father
{
	@Override //annotation
	public  void marriage()
	{
		System.out.println("Love Marriage");
		
		
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		Son s1=new Son();
		s1.property();
		s1.marriage();
	}
}
