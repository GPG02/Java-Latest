package day16;

public class Demo6 {

	//once array is created we cant resize it

//	default value -if array type 
//byte short int long--> 0
//float double--> 0.0
//char --> ' '
//boolean--> false
//everything else (String)--null
	
	public static void main(String[] args) {
		char[] a=new char[3];
		
		for(char v:a)
		{
			System.out.println("*"+v+"*");
		}

	}
}
