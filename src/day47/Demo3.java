package day47;

class TextBoxNotFoundException extends Exception 
{
	TextBoxNotFoundException()
	{
		super("Bhanu Text Box not found");
	}
}


public class Demo3 {
	
	public static boolean textboxpresent=false;

	public static void main(String[] args) {
		System.out.println("main Starts");
		System.out.println("open the browser");
		System.out.println("enter url");
		try 
		{
				enterUserName("Bhanu");
		}
		catch (TextBoxNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ends");


	}

	
	public static void enterUserName(String un) throws TextBoxNotFoundException
	{
		System.out.println("UN start");
		
		if(textboxpresent)
		{
			System.out.println("Enter the username:"+un);
		}
		else
		{
			throw new TextBoxNotFoundException();// generating the exception

		}
		System.out.println("UN ends");
	}
}
