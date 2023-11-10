package day32;

class Shape
{
	void calculateArea()
	{
		System.out.println("Use formula to calculate area");
	}
}

class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void calculateArea()
	{
		int area=l*b;
		System.out.println("Area of a rectangle is:"+area);
	}
}

class Circle extends Shape{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	
	void calculateArea()
	{
		double area=3.14*r*r;
		System.out.println("Area of a Circle is:"+area);
	}
	
}

class Student
{
	static void  findArea(Shape shape)
	{
		shape.calculateArea();
	}
}

public class Demo5 {

	public static void main(String[] args) 
	{
		
		Shape[] allShapes= {new Rectangle(10,20),new Circle(20)};
			
			for(Shape shape:allShapes)
			{
				Student.findArea(shape);
			}

	}

}
