package day43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp
{
	int id;
	String name;
	
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return name+"_"+id;
	}
}

class SortEmpByIDA implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		
		Integer id1=e1.id;
		Integer id2=e2.id;
		return id1.compareTo(id2);
		
	}
	
}

class SortEmpByIDD implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		
		Integer id1=e1.id;
		Integer id2=e2.id;
		return -id1.compareTo(id2);
		
	}
	
}

class SortEmpByNameA implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1, Emp e2) {
	
		String name1=e1.name;
		String name2=e2.name;
		return name1.compareTo(name2);
	}
}

class SortEmpByNameD implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1, Emp e2) {
	
		String name1=e1.name;
		String name2=e2.name;
		return -name1.compareTo(name2);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
		List<Emp> allEmp=new ArrayList<Emp>();
		
		allEmp.add(new Emp(2,"Vidya"));
		allEmp.add(new Emp(1,"Akash"));
		allEmp.add(new Emp(3,"Kusuma"));
		
		
		System.out.println(allEmp);
		Collections.sort(allEmp,new SortEmpByIDA());
		System.out.println(allEmp);
		
		
		Collections.sort(allEmp,new SortEmpByIDD());
		System.out.println(allEmp);
		
		Collections.sort(allEmp,new SortEmpByNameA());
		System.out.println(allEmp);
		
		Collections.sort(allEmp,new SortEmpByNameD());
		System.out.println(allEmp);

	}

}
