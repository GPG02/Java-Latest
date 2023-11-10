package day31;
class Student
{
	int id;
	String name;
	
	Student(int id,String name)
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
public class Demo5 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Akshara");
		System.out.println(s1);
	}

}
