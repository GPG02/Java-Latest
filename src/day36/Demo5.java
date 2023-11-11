package day36;

interface Animal1
{
	
}

class Dog1 implements Animal1
{
	//Dog1 has-a Belt
	Belt belt1=new Belt();//HAS relationship --> if class contains object of another class
	String name="Pinki";
	//Dog Has a name (String)
}


class Belt
{
	
}
//Dog1 IS-A Animal1 -inheritance --> IS-A
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
