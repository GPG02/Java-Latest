package day40;

public class Demo9 {
//check if the given String is palindrome
	public static void main(String[] args) {
		
		String s1="Mom";
		String s2="";
		
		char[] a = s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+a[i];
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is NOT a palindrome");
		}
	}
}
