package day39;

public class Demo5 {

	public static void main(String[] args) {
		String s="Bhanu";
		System.out.println(s.length());//5
		
		System.out.println(s.isEmpty());//no false
		
		System.out.println(s.isBlank());//no false
		
		String s2=" ";
		
		System.out.println(s2.length());//1
		
		System.out.println(s2.isEmpty());//no false
		
		System.out.println(s2.isBlank());//yes true
		
		String s3="";
		
		System.out.println(s3.length());//0
		
		System.out.println(s3.isEmpty());//yes true
		
		System.out.println(s3.isBlank());//yes true

	}

}
