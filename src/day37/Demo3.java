package day37;

abstract class P  //contains only abstract methods
{
	public abstract void m1();
	protected abstract void m2();
}

abstract class Q  //contains only concrete methods
{
	public void m1() {}
	protected void m2() {}
}

abstract class R  //contains both abstract & concrete methods
{
	public abstract void m1();
	protected void m2() {}
}

public class Demo3 {

	public static void main(String[] args) {
		

	}

}
