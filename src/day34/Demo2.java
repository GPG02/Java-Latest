package day34;

class FD
{
	private int amount;
	private final double ROI=0.07;
	
	FD(int amount)
	{
		this.amount=amount;
	}
	
	public void getMaturityAmount()
	{
	
		double maturityAmount=amount+ amount * ROI;
		System.out.println(maturityAmount);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		FD f1=new FD(100000);
		
		f1.getMaturityAmount();

	}

}
