package day27;

public class Demo1 {

	
	public void m1()
		{
			System.out.println("1st m1");
		}
	
	private	static void m1(int i)
		{
		System.out.println("2nd  m1");
		}
		
		String m1(String s)
		{
			System.out.println("3rd m1");
			return s;
		}
	
	public static void main(String[] args) {
		
		Demo1 d1=new Demo1();
		d1.m1();
		
		Demo1.m1(10);
		
		d1.m1("Bhanu");
	}

}
