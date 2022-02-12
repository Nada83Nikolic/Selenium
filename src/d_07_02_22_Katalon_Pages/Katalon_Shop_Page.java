package d_07_02_22_Katalon_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Katalon_Shop_Page {

	private WebDriver driver;

	public Katalon_Shop_Page(WebDriver driver) {
		this.driver = driver;
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebElement getShopLink() {
		return this.driver.findElement(By.xpath("//*[@id='primary-menu']/ul[last()]/li[last()]"));
	}

	public WebElement getFirstItem() {
		return this.driver.findElement(By.xpath("//*[@class='columns-3']/ul/li[1]"));
	}

	public WebElement scrollTo() {
		return this.driver.findElement(By.className("price"));

	}

	public void shop() throws InterruptedException {
		this.getShopLink().click();
		Thread.sleep(3000);
		this.getFirstItem().click();
		
	}
	
	
	
	
	
}
