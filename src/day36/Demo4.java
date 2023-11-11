package day36;

//Architect
interface Browser
{
	void openBrowser();
	void maximizeBrowser();
	void enterUrl(String url);
	void closeBrowser();
}

class Chrome implements Browser
{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
		
	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Maximize Chrome Browser");
		
	}

	@Override
	public void enterUrl(String url) {
		System.out.println("Enter url in Chrome Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
		
	}
	
}

class Firefox implements Browser
{

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Browser");
		
	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Maximize Firefox Browser");
		
	}

	@Override
	public void enterUrl(String url) {
		System.out.println("Enter url in Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Browser");
		
	}
	
}

class AutomationScript
{
	static void  testRun(Browser b)
	{
		b.openBrowser();
		b.maximizeBrowser();
		b.enterUrl("fb.com");
		b.closeBrowser();
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Browser f=new Firefox();
		AutomationScript.testRun(f);
		System.out.println("-------------");
		Browser c=new Chrome();
		AutomationScript.testRun(c);
	

	}

}
