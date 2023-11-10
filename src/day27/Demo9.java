package day27;

//Parent class Base class Super class
class Parent
{
	int i=10;
}
//child class sub class derived class
class Child extends Parent
{
	
}
public class Demo9 {

	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.i);
		
		Child c=new Child();
		System.out.println(c.i);
		
		
	}

}
