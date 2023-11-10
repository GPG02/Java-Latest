package day24;
// constructor overloading
class E
{

	E()
	{
		System.out.println("No arg");
	}
	
	E(int i)
	{
		System.out.println("One arg:"+i);
	}
	
	E(int i,int j)
	{
		System.out.println("2 arg:"+i+" "+j);
	}
	
	E(String s)
	{
		System.out.println("1 arg:"+s);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		E e1=new E();
		E e2=new E(10);
		E e3=new E(10,20);
		E e4=new E("ABC");
		

	}

}
