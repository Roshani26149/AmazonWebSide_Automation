package PageObject;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	private WebDriver driver;
	WebDriverWait wait;

	//define locators
	private By SearchBox =By.id("twotabsearchtextbox");
	private By Searchclick =By.xpath("//input[@type='submit' and @class='nav-input']");
	private By product2Buy =By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"); 
	
	public ProductPage(WebDriver driver){
		this.driver=driver;
		wait = new WebDriverWait(driver, 40);
	}
	public void clickelement() throws InterruptedException {
		WebElement chooseproduct = driver.findElement(SearchBox);
		chooseproduct.sendKeys("earphones");
		Thread.sleep(3000);

		WebElement chooseproduct1 = driver.findElement(Searchclick);
		chooseproduct1.click();
		Thread.sleep(3000);

		System.out.println("current tab window is = "+driver.getTitle());
		Thread.sleep(3000);

		WebElement product = driver.findElement(product2Buy);
		product.click();
		driver.switchTo().activeElement();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);

		System.out.println("display product in "+driver.getTitle());

		Thread.sleep(4000);
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(3000);
	}
}
