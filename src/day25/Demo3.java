package day25;
class A
{
	int x,y,z;
	
	A()
	{
		this(1,2,3);
	}
	A(int i,int j)
	{
		
		x=i;
		y=j;
	}
	
	A(int i,int j,int k)
	{
		this(i,j);
		z=k;
	}
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		A a1=new A(10,20);
		A a2=new A(10,20,30);
		A a3=new A();
	}

}
