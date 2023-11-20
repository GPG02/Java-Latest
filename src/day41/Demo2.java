package day41;

public class Demo2 {
//method present only in StringBuffer
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Mom");
		s1.reverse();
		System.out.println(s1);
		
		s1.append("Dad");
		System.out.println(s1);

		s1.insert(3, "-");
		System.out.println(s1);
		
		s1.delete(3,4);
		System.out.println(s1);
		
		System.out.println(10/0);
	}

}
