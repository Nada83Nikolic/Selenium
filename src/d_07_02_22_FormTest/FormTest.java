package d_07_02_22_FormTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d_07_02_22_FormPage.FormPage;



public class FormTest {
	
	private WebDriver driver;
	private FormPage fp;

	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		fp=new FormPage (driver);
		
		driver.get("file:///C:/Users/Vandot/Downloads/form.html");
			driver.manage().window().maximize();
		
	}

	@Test
	public void Test() throws InterruptedException {
		fp.getInputName().sendKeys("Nada Nikolic");
		fp.getInputGender("female").click();
		fp.getInputDateOfBirth().sendKeys("24.06.1983.");
		Thread.sleep(3000);
		fp.getInputEmail().sendKeys("dshfd@gdsg.ash");
		
		Thread.sleep(3000);
		fp.Role().selectByValue("QA");
		
		Thread.sleep(3000);
		fp.getCheckBoxInputs("online_courses").click();
		Thread.sleep(3000);
		fp.getInputComment().sendKeys(":D :P :)"); 
		Thread.sleep(3000);
		fp.getSubmitButton().click();
		Thread.sleep(3000);
		fp.daLiSuPodaciSacuvani();
	
	}
	
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
