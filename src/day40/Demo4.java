package day40;

public class Demo4 {

	public static void main(String[] args) {
		String s=" Akshara Training ";
		String s2 = s.strip();
		
		System.out.println("*"+s+"*");
		System.out.println("*"+s2+"*");
		
		String s3 = s.replace(' ','-');
		System.out.println("*"+s3+"*");
		
		String s4 = s.replaceAll(" ","");
		System.out.println("*"+s4+"*");
		

	}

}
