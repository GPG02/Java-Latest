package day34;
//example for POJO class
class A
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		A a1=new A();
		a1.setI(100);
		System.out.println(a1.getI());
	}
}
