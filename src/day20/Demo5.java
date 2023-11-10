package day20;

public class Demo5 {

	public static void calculateArea(int length,int width)
	{
		int area=length*width;
		System.out.println("Area of Rectangle is:"+area);
	}
	
	public static void calculateArea(int radius)
	{
		double area=Math.PI * radius *radius;
		System.out.println("Area of Circle is:"+area);
	}
	
	public static void calculateArea(double base,double height)
	{
		double area=0.5 * base *height;
		System.out.println("Area of Triangle is:"+area);
	}
	
	public static void main(String[] args) {
		
		calculateArea(10,5);
		calculateArea(7);
		calculateArea(10,8.3);
		
	}

}
