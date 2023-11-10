package day15;

public class Demo7 {
//we can write and read array element in any order
	public static void main(String[] args) {
		
		int[] a=new int[3];
		
		a[1]=20; //writing
		a[0]=10;
		a[2]=30;
		
		System.out.println(a[2]);//reading
		System.out.println(a[0]);
		System.out.println(a[1]);
		

	}

}
