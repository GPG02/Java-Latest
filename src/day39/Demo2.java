package day39;

public class Demo2 {
	 public static String getAddress(Object obj)
	 {
	        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
	  }
	public static void main(String[] args) {
		String s1="Bhanu";
		String s2="Bhanu";
		String s3="Ravi";
		String s4="ravi";
		s2="Surya";
		
		System.out.println(getAddress(s1));
		System.out.println(getAddress(s2));
		System.out.println(getAddress(s3));
		System.out.println(getAddress(s4));
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(s4);

	}

}
