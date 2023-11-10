package day33;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("Hi");
		Demo6 d=new Demo6();
		d.main(10);
	}

	private final int main(int args) {
		System.out.println("bye");
		return 0;
	}
}
