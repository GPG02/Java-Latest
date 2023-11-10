package day31;
class C
{
	
	
}

class D
{
	public String toString()
	{
		String s=super.toString();
		String msg="Hi Bhanu address is:"+s;
		return msg;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		C c1=new C();
		String addr = c1.toString();
		System.out.println(addr);
		
		D d1=new D();
		String addr2= d1.toString();
		System.out.println(addr2);
		
		System.out.println(d1);
		
		
	}

}
