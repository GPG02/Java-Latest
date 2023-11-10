package day24;
class G
{
	int i=10;
	int j=20;
	
	G()
	{
		int j=30;
		
		System.out.println(i);//10
		System.out.println(j);//30
		
	}
}
public class Demo5 {

	public static void main(String[] args) {
		
		new G();

	}

}
