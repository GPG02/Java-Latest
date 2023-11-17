package day40;

public class Demo8 {
//reverse the given String
	public static void main(String[] args) {
		String s="IBM";
		char[] a = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

	}

}
