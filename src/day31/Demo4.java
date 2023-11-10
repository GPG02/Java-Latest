package day31;

class Emp
{
	int id;
	String name;
	
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return id+"-"+name;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Emp e1=new Emp(1,"Akash");
		System.out.println(e1);
		
	}

}
