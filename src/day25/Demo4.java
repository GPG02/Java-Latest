package day25;

class Baby
{
	String name="Akshara";
	
	Baby()
	{
		System.out.println(name);
		System.out.println(this.name);
	}
	
}

public class Demo4 {

	public static void main(String[] args) 
	{
		
		Baby b1=new Baby();
		System.out.println(b1.name);
		
		Baby b2=b1;
		System.out.println(b2.name);
		
	}

}
