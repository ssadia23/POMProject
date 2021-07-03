package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using ="//h2[contains(text(), 'Dashboard')]") WebElement Dashboard_Element;
	@FindBy(how=How.XPATH, using ="//input[@id='account']") WebElement Name_Element;
	@FindBy(how=How.XPATH, using ="//select[@id='cid']") WebElement Company_Element;
	@FindBy(how=How.XPATH, using ="//input[@id='email']") WebElement Email_Element;
	@FindBy(how=How.XPATH, using ="//input[@id='phone']") WebElement Phone_Element;
	@FindBy(how=How.XPATH, using ="//input[@id='address']") WebElement Address_Element;
	@FindBy(how=How.XPATH, using ="//select[@id='country']") WebElement Country_Element;


	public void insertFullName(String name) {	
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);
		Name_Element.sendKeys(name + randomGenerator(999));	
	}
	
	public void insertCompanyOption(String company) {	
		DropDown(Company_Element, company);
	}
	
	public void insertEmail(String email) {	
		Email_Element.sendKeys(randomGenerator(999)+email);	
	}
	public void insertPhone(String phone) {	
		int ranNumber = randomGenerator(999);
		Phone_Element.sendKeys(ranNumber+phone);	
	}
	public void insertAddress(String address) {	
		Address_Element.sendKeys(address);	
	}
	public void insertCountry(String country) {	
		DropDown(Country_Element, country);	
	}
	
	
	
	public void validateDashboardPage() {
		
		Assert.assertEquals(Dashboard_Element.getText(), "Dashboard", "Wrong Page");
		
	}

	
}
