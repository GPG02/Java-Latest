package day19;

public class Demo8 {
	//var args
	public static void m1(int... a)//any number of int
	{
		System.out.println("m1 starts");
		System.out.println("Number of elements:"+a.length);
		for(int v:a)
		{
			System.out.println(v);
		}
		
		System.out.println("m1 ends");
	}
	public static void main(String[] args) {
	
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);

	}

}
