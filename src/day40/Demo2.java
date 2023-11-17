package day40;

public class Demo2 {

	public static void main(String[] args) {
		String s="Akshara Training";
		String[] a = s.split(" ");
		System.out.println(a.length);
		for(String v:a)
		{
			System.out.println(v);
		}

		String b = String.join("-", a);
		System.out.println(b);
	}

}
