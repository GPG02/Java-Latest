package day8;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(true && true);//t
		System.out.println(true && false);//f
		System.out.println(false && true);//f
		System.out.println(false && false);//f
		
		System.out.println(true || true);//t
		System.out.println(true || false);//t
		System.out.println(false || true);//t
		System.out.println(false || false);//f
		
		System.out.println(!true);//f
		System.out.println(!false);//t

	}

}
