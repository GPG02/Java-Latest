package day26;

class Emp
{
	int id;
	String name;
	
	Emp(int id,String name)
	{
		this(name,id);
	}
	
	Emp(String name,int id)
	{
		this(name);
		this.id=id;
	}
	
	Emp(String name)
	{
		this.name=name;
	}
	
}

public class Demo1 {

	public static void main(String[] args) 
	{
		Emp e1=new Emp(1,"Akshara");

	}

}
