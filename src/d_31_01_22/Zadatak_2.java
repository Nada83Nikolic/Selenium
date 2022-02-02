package d_31_01_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*2.Zadatak
		Napisati program koji ucitava stranicu https://geodata.solutions/
		Bira proizvoljan Country, State i City
		Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
		I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
		Izabrerit Country, State i City tako da imate podatke da selektujete!
		 */
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://geodata.solutions/");
driver.findElement(By.xpath("//*[@id='countryId']")).click();

driver.findElement(By.xpath("//*[@id='countryId']/option[4]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='stateId']/option")));

System.out.println("Pojavili su se State-ovi.");
driver.findElement(By.xpath("//*[@id='stateId']")).click();
driver.findElement(By.xpath("//*[@id='stateId']/option[15]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cityId']/option")));
driver.findElement(By.xpath("//*[@id='cityId']")).click();
System.out.println("Pojavili su se gradovi");
driver.findElement(By.xpath("//*[@id='cityId']/option[2]")).click();


	}

}
