package day40;

public class Demo13 {

	public static void main(String[] args) {
		String s="Bhanu-123";   //o/p BHANU without using toUpperCase method
		for(char c:s.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				char b=(char)(c-32);
				System.out.print(b);
			}
			else
			{
				System.out.print(c);
			}
			
		}
	}

}
