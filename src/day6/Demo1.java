package day6;

public class Demo1 {

	
	public static void main(String[] args) {

		byte b;
		b=10;
		short i;
		i=(short)b;//from byte type to short type
		System.out.println(b);
		System.out.println(i);

		byte c;
		c=(byte)i;//from short type to byte type
		System.out.println(c);
	}

}
