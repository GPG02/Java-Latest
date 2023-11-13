package day37;
interface Car //has 3 abstract methods
{
	void body();
	void engine();
	void interiors();
}

abstract class Line1 implements Car //has 2 abstract methods & 1 concrete method-incomplete class
{
	public  void body()
	{
		System.out.println("Car body");
	}

	
}

abstract class Line2 extends Line1{//has 1 abstract methods & 2 concrete method-incomplete class
	public void engine()
	{
		System.out.println("Car engine");
	}
}

class Line3 extends Line2{//has 3 concrete methods-complete class
	public void interiors()
	{
		System.out.println("Car interiors");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Car mycar=new Line3();
		mycar.body();
		mycar.engine();
		mycar.interiors();
	}

}
