package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoopingCardPageObject {
	private WebDriver driver;
	WebDriverWait wait;

	private By showingCard = By.xpath("//a[@aria-label='1 item in cart']");
	private String LoginPageObject;
	public ShoopingCardPageObject(WebDriver driver) 
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, 20);
	}
	public boolean Displaycard()
	{

		WebElement display1=driver.findElement(showingCard);
		wait.until(ExpectedConditions.visibilityOf(display1));
		boolean r1 = display1.isDisplayed();
		System.out.println("Added one item  display is true " );
		return r1;
	}
	public void signin() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(LoginPageObject);

	}
}


