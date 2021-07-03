package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int randomGenerator(int num) {	
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(num);
		return randomNumber;
	}
	
	public void DropDown (WebElement element, String value) {
		Select sel = new Select(element);	
		sel.selectByVisibleText(value);
	}
	
//	public void waitElement(WebDriver driver, int timing, By locator) {
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator);
//	}

	
}
