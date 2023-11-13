package day37;

interface P1 //interface with 100% abstract methods
{
	void m1();
	void m2();
}

interface P2//interface with 100% concrete methods
{
	static void m1() {}
	default void m2() {}
}

interface P3//interface with both abstract concrete methods
{
	void m1();
	default void m2() {}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
