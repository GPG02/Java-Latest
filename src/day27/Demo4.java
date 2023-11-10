package day27;

class B
{
	
	final static int i=10;
	final static int j;
	static int k;
	
	static // SIB
	{
		j=20;
		k=30;
	}
	
}

public class Demo4 {

	public static void main(String[] args) {
		
		System.out.println(B.i);
		System.out.println(B.j);
		System.out.println(B.k);
	}

}
