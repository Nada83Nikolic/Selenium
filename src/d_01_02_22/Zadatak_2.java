package d_01_02_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://videojs.com/city");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='vjs_video_3']/button")).click();
		System.out.println("kliknuo");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='vjs_video_3']/button")));
		System.out.println("Nestalo dugme.");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Replay']")));
		System.out.println("Video je gotov.");
		
		
	
	}

}
