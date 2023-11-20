package day41;

public class Demo3 {
//StringBuilder in JDK 1.5 and it is not thread safe -it will allow multiple threads- fast
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Mom");
		int l=s1.length();
		System.out.println(l);
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("m"));
		System.out.println(s1.toString());
		s1.replace(0,1,"P");
		System.out.println(s1);
		//--------------------------------------------
		s1.reverse();
		System.out.println(s1);
		
		s1.append("Dad");
		System.out.println(s1);

		s1.insert(3, "-");
		System.out.println(s1);
		
		s1.delete(3,4);
		System.out.println(s1);

	}

}
