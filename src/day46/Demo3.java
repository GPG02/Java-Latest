package day46;

public class Demo3 {
	public static String s;
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
				int l=s.length();//risky code
				System.out.println(l);
		}
		catch (Exception e) {
				System.out.println("Hi i got exception");//recovery code
		}
		System.out.println("Main Ends");
	}

}
