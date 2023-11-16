package day39;

public class Demo4 {

	public static void main(String[] args) {
		int i=10;
		//convert this into String
		String v = String.valueOf(i);//static method
		String v2=""+i;
		
		System.out.println(i);
		System.out.println(v);
		
		System.out.println(i+1);
		System.out.println(v+1);
		
		System.out.println(v2+1);
		
		int j=Integer.valueOf(v);//converting "10" into 10
		System.out.println(j);
		System.out.println(j+1);

	}

}
