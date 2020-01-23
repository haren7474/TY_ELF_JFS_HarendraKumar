package hebbal.abstracts.browser_WithInterface;

public class BrowserFactory 
{
	public Browser getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			return new Chrome();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			return new Opera();
		} 
		else
		{
			return new Mozilla();
		}
	}
}

