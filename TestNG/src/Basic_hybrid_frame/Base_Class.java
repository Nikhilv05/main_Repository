package Basic_hybrid_frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Base_Class 
{
	WebDriver driver;
	WebDriverWait wait;
	@Parameters({"key","value","url"})
	@BeforeMethod
	public void launchapp(String key,String value,String url)
	{
		System.setProperty(key,value);
		driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		wait=new WebDriverWait(driver, 10);
	}
	@AfterMethod
	public void appclose()
	{
		driver.close();
	}

}
