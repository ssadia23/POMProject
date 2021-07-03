package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	public void validUserShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();

	LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
	
	AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName("SsssS");
		addCustomerPage.insertCompanyOption("Google");
		addCustomerPage.insertEmail("gdgs@hotmail.com");
		addCustomerPage.insertPhone("353453");
		addCustomerPage.insertAddress("dsggsfg");
		addCustomerPage.insertCountry("Italy");
	}
	
}
