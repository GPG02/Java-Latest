package day3;

class Employee
{
	int id;
	String name;
	String city;
		
	Employee(int id, String name, String city)
	{
		this.name=name;
		this.id=id;
		this.city=name;
	}
}
public class Demo7 {
	public static void main(String[] args) 
	{
		
		Employee e1=new Employee(1,"Akshara","pune");
		
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.city);
	}
}