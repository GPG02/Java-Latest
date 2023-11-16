package day39;

public class Demo3 {

	public static void main(String[] args) {
		
		String s1="Bhanu";
		String s2="Bhanu";
		
		String s3=new String("Bhanu");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s3));
		
		

	}

}
