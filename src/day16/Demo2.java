package day16;

public class Demo2 {
//enhanced for loop - for each loop
//faster,start end , no update
	public static void main(String[] args) {
		int[] a= {10,20,30};
		for(int v:a)
		{
			System.out.println(v);
		}

		String[] allCity= {"Agra","Bangalore","Chennai"};
		
		for(String city:allCity)
		{
			System.out.println(city);
		}
		
		for(String city:allCity)
		{
			System.out.println("Hi");
		}
	}

}
