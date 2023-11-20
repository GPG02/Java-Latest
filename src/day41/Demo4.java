package day41;

class A{
	private String v;
	A(String v){
		this.v=v;
	}
	
	public String getString(){
		return v;
	}
}

class B{
	private Integer v;
	
	B(Integer v){
		this.v=v;
	}
	public Integer getInteger(){
		return v;
	}
}

class C{
	private Cat v;
	C(Cat v){
	 this.v=v;	
	}
	public Cat getCat(){
		return v;
	}
}
public class Demo4 {
	public static void main(String[] args) {
		A a1=new A("Bhanu");
		String v1 = a1.getString();
		System.out.println(v1);
		
		B b1=new B(100);
		Integer v2 = b1.getInteger();
		System.out.println(v2);
		
		C c1=new C(new Cat());
		Cat v3 = c1.getCat();
		System.out.println(v3);
	}
}
