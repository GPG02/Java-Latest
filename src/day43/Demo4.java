package day43;

import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		Vector<String> a=new Vector<String>();
		a.addElement("Apple");
		a.addElement("Mango");
		a.addElement("Chiku");
		a.removeElement("Mango");
		System.out.println(a);
	}

}
