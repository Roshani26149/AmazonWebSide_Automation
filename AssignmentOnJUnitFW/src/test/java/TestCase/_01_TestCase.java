package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Automation_Utility.Browse_Factory;
import PageObject.CommonPageObject;
import PageObject.Log4jConcept;
import PageObject.LoginPageObject;
import PageObject.ProductPage;
import PageObject.ShoopingCardPageObject;



public class _01_TestCase {

	private WebDriver driver;
	//	@Before
	//	public void loginApp()
	//	{
	//		Browse_Factory browser=new Browse_Factory();
	//        driver=Browse_Factory.startapplication(driver, "chrome","https://www.amazon.in/");
	//	}
     @Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\web driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");	
	}

	@Test
	public void _01_SearchProduct() throws Exception {

		CommonPageObject common=new CommonPageObject(driver);

		System.out.println(common.DisplaySearchBox());
		System.out.println(common.DisplayClickButton());
		System.out.println(common.DisplayAccountNandlist());
		System.out.println(common.DisplayLaungagebutton());
		System.out.println(common.Displayaddtocard());
		System.out.println(common.DisplayReturn());

		ProductPage product = new  ProductPage (driver);
		product.clickelement();
		Thread.sleep(3000);


		ShoopingCardPageObject shooping=new ShoopingCardPageObject(driver);
		shooping.Displaycard();


		LoginPageObject login=new LoginPageObject(driver);
		login.LoginPageObject();
		login.LoginPageObject();

		Log4jConcept log1 = new Log4jConcept();
		log1.getClass();

	}

	@After
	public void cleanUp() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
