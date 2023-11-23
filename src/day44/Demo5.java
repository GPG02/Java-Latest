package day44;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>
{
	String name;
	int token;
	Patient(String name,int token){
		this.name=name;
		this.token=token;
	}
	
	public String toString() {
		return name+"-"+token;
	}

	@Override
	public int compareTo(Patient p2) {
	    Integer token1=this.token;
	    Integer token2=p2.token;
	    return token1.compareTo(token2);
	}
	
	
}
public class Demo5 {

	public static void main(String[] args) {
		PriorityQueue<Patient> hospital=new PriorityQueue<Patient>();
		hospital.offer(new Patient("Ravi",3));
		hospital.offer(new Patient("Bhanu",1));
		hospital.offer(new Patient("Surya",2));
		
		System.out.println(hospital.poll());
		System.out.println(hospital.poll());
		System.out.println(hospital.poll());

	}

}
