package d_03_02_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		WebElement boja =driver.findElement(By.xpath("//body"));
		
		js.executeScript("arguments[0].style='background: red';", boja);
		Thread.sleep(3000);
		driver.quit();
	
		
	}

}
