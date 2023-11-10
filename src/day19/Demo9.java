package day19;

public class Demo9 {

	public static void m1(int i,String... a)
	{
		System.out.println(i);
		for(String s:a)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		m1(10);
		m1(10,"Bhanu");
		m1(10,"Bhanu","Surya","Ravi");

	}

}
