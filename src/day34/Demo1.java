package day34;

class Account
{
	//declaration
	private int balance;
	
	
	//initialization
	Account(int balance)
	{
		this.balance=balance;
	}
	
	//utilization
	public int getBalance()
	{
		return balance;
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Account a=new Account(10000);
		System.out.println(a.getBalance());
	}

}
