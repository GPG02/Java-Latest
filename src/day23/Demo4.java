package day23;
class C
{
	final int pin_code=560085;//constant ---> final variable
	int OTP=123;//variable---> Non final variable
	final String name="akshara";
}
public class Demo4 {

	public static void main(String[] args) {
		
		final int p1=10;
		int p2=20;
		
		C c1=new C();
//		c1.pin_code=560056;
		c1.OTP=456;
		System.out.println(c1.pin_code);
		System.out.println(c1.OTP);
		
//		p1=20;
		p2=30;
		System.out.println(p1);
		System.out.println(p2);
	}

}
