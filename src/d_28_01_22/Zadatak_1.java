package d_28_01_22;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://s.bootsnipp.com/iframe/WaXlr");
		
		System.out.println("unesite broj: ");
		
		int broj=s.nextInt();
		
		List<WebElement>buttons=driver.findElements(By.xpath("//*[@type='button']"));
		Thread.sleep(3000);
		for(int i=0; i< buttons.size();i++)
		{
		driver.findElements(By.xpath("//*[@type='button']")).get(broj-1).click();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
