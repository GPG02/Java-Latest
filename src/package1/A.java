package package1;

public class A {
	
	public static int i=10;
	protected static int j=20;
	static int k=30;
	private static int l=40;
	
	//non-static primitive/non primitive final/non final
	public static void main(String[] args) {
		System.out.println(A.i);
		System.out.println(A.j);
		System.out.println(A.k);
		System.out.println(A.l);
	}

}
