package day43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+"_"+name;
	}

	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	@Override//D N S O
	public int compareTo(Student s2) {
		Integer id1=this.id;
		Integer id2=s2.id;
		return id1.compareTo(id2);
	}

}

class SortStudentByIDD implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		Integer id1=s1.getID();
		Integer id2=s2.getID();
		return -id1.compareTo(id2);
	}
	
}

class SortStudentByNameAtoZ implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		String name1=s1.getName();
		String name2=s2.getName();
		return name1.compareTo(name2);
	}
	
}

class SortStudentByNameZtoA implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		String name1=s1.getName();
		String name2=s2.getName();
		return -name1.compareTo(name2);
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		List<Student> allStudent=new ArrayList<Student>();
		allStudent.add(new Student(2,"Prem"));
		allStudent.add(new Student(1,"Sunitha"));
		allStudent.add(new Student(3,"Priya"));
		
		System.out.println(allStudent);
		Collections.sort(allStudent);//by default it will sort by ascending order of ID -->Comparable
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByIDD());
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByNameAtoZ());
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByNameZtoA());
		System.out.println(allStudent);

	}

}
