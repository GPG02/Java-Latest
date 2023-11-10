package day18;

public class Demo3 {
/*code optimization
 * 
 * 1. there should be a common variable b/w 2 statement
 * 2. there must be a = for that common variable in 1st statement
 * 3. then we can replace the common variable in 2nd statement with RHS from 1st statement
 * 4. delete 1st statement
 */
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
//		int k=i+j;
//		System.out.println(k);
		
		System.out.println(i+j);

	}

}
