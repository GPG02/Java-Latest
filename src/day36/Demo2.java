package day36;

interface Shape
{
	void findArea();
}

class Circle implements Shape
{
	private int r;
	Circle(int r)
	{
		this.r=r;
	}
	@Override
	public void findArea() {
		
		double area=3.14 * r * r;
		System.out.println(area);
	}
	
}

class Rectangle implements Shape
{

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestShape
{
	public static void testShape(Shape[] allShapes)
	{
		for(Shape shape:allShapes)
		{
			shape.findArea();
			
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// call Test Shape method

	}

}
