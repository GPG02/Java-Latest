package day39;

public class Demo7 {

	public static void main(String[] args) {
		String s="abcd";
//		char v = s.charAt(0);//StringIndexOutOfBoundsException
//		System.out.println(v);
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		char[] a = s.toCharArray();
		for(char v:a)
		{
			System.out.println(v);
		}
	}

}
