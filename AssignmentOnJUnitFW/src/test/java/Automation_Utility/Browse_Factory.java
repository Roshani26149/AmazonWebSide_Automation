package Automation_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browse_Factory {
	public static WebDriver startapplication(WebDriver driver,String browserName,String appURL)
	{
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\gickoDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(browserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
}
