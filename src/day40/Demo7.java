package day40;

public class Demo7 {
//print the given String vertically 
	public static void main(String[] args) {
		String s="TCS";
		char[] a = s.toCharArray();
		for(char v:a)
		{
			System.out.println(v);
		}

		System.out.println("--------");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
