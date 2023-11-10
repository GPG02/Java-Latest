package day16;

public class Demo5 {
	//once array is created we cant resize it
		public static void main(String[] args) {
			String[] students=new String[3];
			students[0]="Asha";
			students[1]="Bindu";
			students[2]="Chandra";
			
//			for(String name:students)
//			{
//				System.out.println(name);
//			}
			
			students=new String[4];
			students[3]="Divya";
			
//			for(String name:students)
//			{
//				System.out.println(name);
//			}

			System.out.println(students[3]);
		}


}
