package d_31_01_22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {

	public static void main(String[] args) throws InterruptedException {
	/*	1.Zad
		Napisati program koji:
		Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
		Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
		POMOC: Brisite elemente odozdo.
		(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
*/
		
		
			
			System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://s.bootsnipp.com/iframe/Dq2X");
			
			List<WebElement>element=driver.findElements(By.xpath("//*[contains(@class,'alert alert')]"));
			//for(int i=0;i<element.size();i++)
			for(int i=element.size();i>0;i--)
			{
				//driver.findElement(By.className("close[]")).click();
				driver.findElement(By.xpath("//*[@class='col-md-12']/div/button")).click();
				Thread.sleep(3000);
			}
			System.out.println("Pogaseno.");
		}

	}
		

