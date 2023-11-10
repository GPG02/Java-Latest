package day25;

class Student
{
	int id;
	String name;
	//default constructor - no-arg 
	
}

class Emp
{
	int id;
	String name;
	
	Emp(int i,String s)//user defined - param
	{
		id=i;
		name=s;
	}
	
}
public class Demo1 {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.id=1;
		s1.name="Abhimanyu";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		Student s2=new Student();
		s2.id=2;
		s2.name="Arjuna";
		
		Student s3=new Student();
		s3.id=3;
		s3.name="Karna";
		
		Emp e1=new Emp(1,"Abhimanyu");
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		Emp e2= new Emp(2,"Arjuna");
		Emp e3=new Emp(3,"Karna");

	}

}
