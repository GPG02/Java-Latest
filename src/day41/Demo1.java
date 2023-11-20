package day41;

public class Demo1 {
/*String JDK1.0 and it is immutable
 * StringBuffer JDK1.0  and it is mutable
 * 
 * 
 */
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Bhanu");
		int l=s.length();
		System.out.println(l);
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("h"));
		System.out.println(s.toString());
		s.replace(0,1,"P");
		System.out.println(s);
		
		String s2="Bhanu";
		String s3 = s2.replace('B','P');
		System.out.println(s3);
		

	}

}
