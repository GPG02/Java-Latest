package day23;

class Account
{
	static final String bank="SBI";
	static String city="Pune";
	final int PAN=4567;
	int pin=123;
}
public class Demo6 {
	
	public static void main(String[] args) 
	{
		System.out.println(Account.bank);//static way
//		System.out.println(Account.pin);
		Account a1=new Account();
		System.out.println(a1.bank);//The static field Account.bank should be accessed in a static way
		System.out.println(a1.pin);
		
		Account a2=new Account();
		System.out.println(a2.bank);
		System.out.println(a2.pin);

	}

}
