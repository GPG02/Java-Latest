package day30;
class Parent
{
	public void m1() {System.out.println("Hi");}
	protected void m2(int i) {System.out.println("Hi");}
	int m3(){return 100;}
	
	private  int m4(){return 100;}
}
class Child extends Parent
{
	@Override
	public void m1() {System.out.println("Bye");}
	
	@Override
	protected void m2(int i) {System.out.println("Bye");}
	
	@Override
	public int m3() {return 200;}
	
//	@Override
//	public  int m4(){return 300;}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
