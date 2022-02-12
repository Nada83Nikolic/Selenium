package d_07_02_22_Katalon_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CartPageKatalon {

	private WebDriver driver;

	public CartPageKatalon(WebDriver driver) {
		this.driver = driver;
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public WebElement kolicina() {
		return this.driver.findElement(By.xpath("//div[@class='quantity']/input"));
	}

	public WebElement scrollTo() {
		return this.driver.findElement(By.className("price"));

	}

	public WebElement getAddButton() {
		return this.driver.findElement(By.xpath("//*[@type='submit'][@name='add-to-cart']"));
	}

	public String getMessage() {
		return this.driver.findElement(By.xpath("//*[@class='woocommerce-message']")).getText();
	}

	
	public void scroll()
	{
		js.executeScript("arguments[0].scrollIntoView();", this.scrollTo());
	}
	public void cart() throws InterruptedException {
		SoftAssert sa=new SoftAssert();
		this.kolicina().click();
		this.kolicina().clear();
		this.kolicina().sendKeys("2");
		Thread.sleep(3000);
		this.getAddButton().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	//	System.out.println(driver.findElement(By.xpath("//*[@class='woocommerce-message']")).getText());
	
		
	}
}
