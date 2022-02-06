package d_03_02_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> linkovi = driver.findElements(By.xpath("//*[@class='link-box']"));

		for (int i = 0; i < linkovi.size(); i++) {
			
			js.executeScript("window.open(arguments[0]);", linkovi.get(i));
		}
		Thread.sleep(10000);
		driver.quit();
	

	}

}
