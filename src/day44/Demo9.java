package day44;

import java.util.TreeSet;

class Cat implements Comparable<Cat>{
	String name;
	Cat(String name){
		this.name=name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Cat cat2) {
		String name1=this.name;
		String name2=cat2.name;
		return -name1.compareTo(name2);
	}
}
public class Demo9 {
//Homework: TreeSet<Dog> with Comparator
	public static void main(String[] args) {
		TreeSet<Cat> cats=new TreeSet<Cat>();
		cats.add(new Cat("Pinki"));
		cats.add(new Cat("Chinki"));
		cats.add(new Cat("Dinki"));
		
		System.out.println(cats);
	}

}
