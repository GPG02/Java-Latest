package day20;

public class Demo8 {

	public static void add(double i,double j,double... a)
	{
		double sum=i+j;
		for(double v:a)
		{
			sum=sum+v;
		}
		
		System.out.println(sum);
	}
	

	public static void main(String[] args) 
	{

		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(10.2,20,30,40);
		
	}

}
