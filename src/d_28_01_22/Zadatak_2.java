package d_28_01_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {

public static void main(String[] args) throws InterruptedException {
		
	
	
	//	Dodati red podataka - jedan red u jednoj iteraciji 
	//	Kliknite na dugme Add New
	//	Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
	//	Kliknite na zeleno Add dugme
	//	Na kraju programa ugasite pretrazivac.
		

	

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		
		WebElement element=driver.findElement(By.xpath("//*[@type='button']"));
		
		for (int i=0;i<5;i++) {
			
			element.click();
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Marko Markovic");
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("finansije");
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("(065)229-354");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='table table-bordered']//tr[last()]//td[last()]/a[1]")).click();
	
		}
		driver.close();
	}

}
