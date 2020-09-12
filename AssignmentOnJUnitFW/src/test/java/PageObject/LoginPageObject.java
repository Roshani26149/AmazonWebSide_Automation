package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	private WebDriver driver;

	private By DisplaySignIn =By.xpath("//*[@id=\"hlb-ptc-btn-native\"]");

	public LoginPageObject(WebDriver driver)
	{

		this.driver=driver;
	}

	public void LoginPageObject() throws Exception {

		WebElement login = driver.findElement(DisplaySignIn);
		Thread.sleep(5000);
		if (login.isDisplayed())
		{
			System.out.println("Signin page is display");
		}else {
			System.out.println("Singnin page is not display");
		}


	}

}


