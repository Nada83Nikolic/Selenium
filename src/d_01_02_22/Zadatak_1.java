package d_01_02_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.udemy.com/courses/search/?src=ukw&q=slksd");
		driver.findElement(By.xpath("//*[contains(@class,'language-selector-button')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("onetrust-consent-sdk")));
		System.out.println("Dijalog se prikazao");

	}

}
