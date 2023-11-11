package day36;

import java.util.Scanner;

interface Remote
{
	void powerOnOff();
	void changeChannel(int n);
	void info();
	
}

class LGTV1 implements Remote
{

	private boolean isOn=false;
	private int channel=1;
	
	@Override
	public void powerOnOff() {
		
		if(isOn)
		{
			System.out.println("Switching off....");
			isOn=false;
		}
		else
		{
			System.out.println("Switching On....");
			isOn=true;
		}
		
	}

	@Override
	public void changeChannel(int n) {
		
		if(!isOn)
		{
			System.out.println("TV should be switched ON first");
			return;
		}
		if(n>=1 && n<=100)
		{
			System.out.println("Changing Channel to:"+n);
			channel=n;
		}
		else
		{
			System.out.println("Invalid channel number");
		}
		
	}
	
	public void info()
	{
		if(!isOn)
		{
			System.out.println("TV should be switched ON first");
			return;
		}
		System.out.println("Current Channel is:"+channel);
	}
	
}
public class Demo3 {
	
	public static void main(String[] args) {
		Remote r=new LGTV1();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Please select the option \n1.PowerON/Off \n2.ChangeChannel \n3.Info \n4.Exit");
			int option=sc.nextInt();
			if(option==1)
			{
				r.powerOnOff();
			}
			else if(option==2)
			{
				System.out.println("please enter the channel number to change:");
				int n=sc.nextInt();
				r.changeChannel(n);
			}
			else if(option==3)
			{
				r.info();
			}
			else if(option==4)
			{
				System.out.println("Thank You");
				break;
			}
			else
			{
				System.out.println("invalid input please try again");
			}
		}while(true);
		
		sc.close();
	}

}
