package day23;
class D
{
	static String city="Pune";
	int ph=100;
}
public class Demo7 
{

	public static void main(String[] args)
	{
		int ph2=300;
		
		D d1=new D();
		d1.city="Delhi";
		d1.ph=101;
		
		System.out.println(d1.city);
		System.out.println(d1.ph);
		
		D d2=new D();
		
		System.out.println(d2.city);
		System.out.println(d2.ph);
		

	}

}
