package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPageObject {
	//declare a driver object 
	private WebDriver driver;
	WebDriverWait wait;

	//declare locators of home page
	private By SearchElement =By.name("field-keywords");
	private By SearchClickButton =By.id("nav-search-submit-text");
	private By DisplayLanguageTitle=By.className("icp-nav-link-inner");
	private By DisplayAccountAndList = By.id("nav-link-accountList");
	private By DisplayReturnAndOrder= By.id("nav-orders");
	private By DisplayAddToCard = By.id("nav-cart");

	//constructor
	public CommonPageObject(WebDriver driver){
		this.driver=driver;
		wait = new WebDriverWait(driver, 20);
	}

	public boolean DisplaySearchBox()
	{

		WebElement display1=driver.findElement(SearchElement);
		wait.until(ExpectedConditions.visibilityOf(display1));
		boolean r1 = display1.isDisplayed();
		System.out.println("search box display is" );
		return r1;
	}
	public boolean DisplayClickButton()
	{
		WebElement display2=driver.findElement(SearchClickButton);
		wait.until(ExpectedConditions.visibilityOf(display2));
		boolean r2=display2.isDisplayed();
		System.out.println("search clickbutton display is ");
		return r2;
	}
	public boolean DisplayLaungagebutton()
	{
		WebElement display3=driver.findElement(DisplayLanguageTitle);
		wait.until(ExpectedConditions.visibilityOf(display3));
		boolean r3=display3.isDisplayed();
		System.out.println("choose languagetitle display is" );
		return r3;
	}
	public boolean DisplayAccountNandlist()
	{
		WebElement display4=driver.findElement(DisplayAccountAndList);
		wait.until(ExpectedConditions.visibilityOf(display4));
		boolean r4=display4.isDisplayed();
		System.out.println("account and list element display is ");
		return r4;
	}
	public boolean DisplayReturn()
	{
		WebElement display5=driver.findElement(DisplayReturnAndOrder);
		boolean r5=display5.isDisplayed();
		System.out.println("Return and order element is display");
		return r5;
	}
	public boolean Displayaddtocard()
	{
		WebElement display6=driver.findElement(DisplayAddToCard);
		boolean r6=display6.isDisplayed();
		System.out.println("Add to Card element is display");
		return r6;
	}
}