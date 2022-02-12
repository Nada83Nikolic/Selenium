package d_07_02_22_Katalon_Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d_07_02_22_Katalon_Pages.CartPageKatalon;
import d_07_02_22_Katalon_Pages.EmptyCartKatalon;
import d_07_02_22_Katalon_Pages.Katalon_Shop_Page;

public class Katalon_Test {

	/*Napisati test koji:
		Ucitava stranicu http://cms.demo.katalon.com/
		Vrsi klik na Shop link iz navigacije
		Otvara stranicu prvog proizvoda klikom na karticu prvog proizvoda
		Dodaje proizvod u korpu sa kolicinom 2
		Verifikuje poruku nakon dodavanja “has been added to your cart.”
		Odlazi u korpu klikom na dugme VIew Cart
		Verifikuje stanje u korpi, tj. da postoji proizvod sa kolicinom 2.
		Brise stavku iz korpe klikom na dugme x.
		Verifikuje poruku za praznu korpu.
		Osmislite pageve za ovaj zadatak!

	*/
	private WebDriver driver;
	private Katalon_Shop_Page ksp;
	private CartPageKatalon cpk;
	private EmptyCartKatalon eck;
	
	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		ksp= new Katalon_Shop_Page(driver);
		cpk=new CartPageKatalon(driver);
		eck=new EmptyCartKatalon(driver);
		driver.get("https://cms.demo.katalon.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void katalonTest() throws InterruptedException {
		
		SoftAssert sa=new SoftAssert();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		ksp.shop();
		Thread.sleep(3000);
		
		
		cpk.cart();		
		sa.assertTrue(cpk.getMessage().contains("added to your cart."),"greska");
		Thread.sleep(3000);
		
		eck.isprazniKorpu();
		sa.assertTrue(eck.porukaPraznaKorpa().contains("Your cart is currently empty."),"greska");
		
		
		sa.assertAll();
		
		
	}
	
}
