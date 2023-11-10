package day35;

interface A
{
	int I=10;//public static final global (primitive/non-primitive)
	public static final int J=20;
	String S=new String("Bhanu");
	
}
 

public class Demo1 {


	public static void main(String[] args) {
	
		System.out.println(A.I);
		System.out.println(A.J);
		System.out.println(A.S);
	}

}
