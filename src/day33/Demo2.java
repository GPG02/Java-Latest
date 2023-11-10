package day33;
class B{
	public C m1(){
		System.out.println("m1 of B");
		C c1=new C();
		return c1;
	}
}

class C{
	public D m2(){
		System.out.println("m2 of C");
		D d1=new D();
		return d1;
	}
}

class D{
	public void m3(){
		System.out.println("m3 of D-end");
	}
}
public class Demo2 {

	public static void main(String[] args) {
//		B b1=new B();
//		C c1 = b1.m1();
//		D d1 = c1.m2();
//		d1.m3();
		
		B b1=new B();
		b1.m1().m2().m3();
		
		
	}

}
