package day40;

public class Demo12 {

	public static void main(String[] args) {
		String s="bhanu";   //o/p BHANU without using toUpperCase method
		for(char c:s.toCharArray())
		{
			char b=(char)(c-32);
			System.out.print(b);
			
		}
	}

}
