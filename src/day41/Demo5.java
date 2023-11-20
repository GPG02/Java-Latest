package day41;

class G<T>{
	private T v;
	G(T v){
		this.v=v;
	}
	
	public void set(T v)
	{
		this.v=v;
	}
	public T get(){
		return v;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		//Type safety: The constructor G(Object) belongs to the raw type G. References to generic type G<T> should be parameterized
		G g1=new G(100);
		g1.set(150);
		Object v = g1.get();
		System.out.println(v);
		
		G<String> g2=new G<String>("Bhanu");
		g2.set("Surya");
		String v2 = g2.get();
		System.out.println(v2);
		
		G<Integer> g3=new G<Integer>(100);
		g3.set(999);
		Integer v3 = g3.get();
		System.out.println(v3);
		
		G<Cat> g4=new G<Cat>(new Cat());
		g4.set(new Cat());
		Cat v4 = g4.get();
		System.out.println(v4);

	}

}
