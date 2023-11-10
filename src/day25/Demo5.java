package day25;

class C
{
	int i=10;
	int j=20;
	
	C()
	{
		int i=100;
		System.out.println(i);//100
		System.out.println(j);//20
		
		System.out.println(this.i);//10
		System.out.println(this.j);//20
	}
}
public class Demo5 {

	public static void main(String[] args) {
		
		C c1=new C();

	}

}
