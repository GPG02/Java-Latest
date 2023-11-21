package day42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp
{
	private int id;
	private String name;
	
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return name+"_"+id;
	}
}

public class Demo11 {

	public static void main(String[] args) {
		
		List<Emp> allEmp=new ArrayList<Emp>();
		
		allEmp.add(new Emp(3,"Vidya"));
		allEmp.add(new Emp(1,"Akash"));
		allEmp.add(new Emp(2,"Kusuma"));
		
		
		System.out.println(allEmp);
//		Collections.sort(allEmp);
		
		

	}

}
