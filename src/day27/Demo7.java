package day27;

class D
{
	final int i=10;
	final int j;
	final int k;
	int l;
	
	{			//instance initialization block (IIB)
		j=20; //we can initialize non-static final variable
		l=30;//we can initialize non-static non-final variable
	}
	
	D()
	{
		k=20;
	}
	
}

public class Demo7 {

	public static void main(String[] args) {
		
		D d1=new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.k);
		System.out.println(d1.l);

	}

}
