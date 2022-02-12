package d_07_02_22_Katalon_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmptyCartKatalon {

	private WebDriver driver;

	public EmptyCartKatalon(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getViewCartButton() {
		return this.driver.findElement(By.xpath("//*[@class='woocommerce-message']/a"));
	}
	public WebElement emptyCart()
	{
		return this.driver.findElement(By.xpath("//*[@class='product-remove']/a"));
	}
	public String porukaPraznaKorpa()
	{
		return this.driver.findElement(By.xpath("//*[@class='cart-empty woocommerce-info']")).getText();
	}
	
	public void isprazniKorpu() throws InterruptedException
	{
		this.getViewCartButton().click();
		Thread.sleep(3000);
		this.emptyCart().click();
	//	System.out.println(this.porukaPraznaKorpa());
	}
	
}
