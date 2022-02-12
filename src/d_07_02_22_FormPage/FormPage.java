package d_07_02_22_FormPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	private WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getInputName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getInputGender(String gender) {

		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + gender + "']"));

	}

	public WebElement getInputDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}

	public WebElement getInputEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getCheckBoxInputs(String checkBoxInput) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='" + checkBoxInput + "'] "));
	}

	public Select Role() {
		Select select = new Select(driver.findElement(By.id("role")));
		return select;
	}


	public WebElement getInputComment() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}


	// metodu koja vraca da li su podaci uspesno sacuvani,
	// tako sto proverava da li element koji nosi poruku za atribut style
	// ima vrednost "visibility: visible"
	
	public boolean daLiSuPodaciSacuvani() {

		// driver.findElement(By.xpath("//*[@class='message-element
		// poruka'][@style='visibility: visible']"));
		// return true;

		boolean tuJe = true;
		List<WebElement> list = driver.findElements(By.xpath("//div[@style='visibility: visible']"));
		if (list.size() == 0) {
			tuJe = false;
		}
		return tuJe;

	}

}
