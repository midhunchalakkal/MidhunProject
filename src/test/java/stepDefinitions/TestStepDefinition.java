package stepDefinitions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {
	WebDriver driver;
	
	@Before
	public void initializeTest() throws MalformedURLException{
		
		System.setProperty("webdriver.chrome.driver","/Users/mriyas/eclipse-workspace/TEST123/DriverFor_system/chromedriver");
		driver = new ChromeDriver();
	}


	@Given("^user is already on Login Page$")
	public void i_want_to_launch_the_facebook_in_firefox_browser() {

		driver.get("http://facebook.com");

	}

	@When("^title of login page is Facebook$")
	public void i_want_to_authenticate_with_valid_credentails() {
		
		System.out.println("title of login page is Facebook");
	}

	@Then("^loginpage is displayed$")
	public void i_want_to_verify_whether_user_navigated_to_home_page_or_not() {

		System.out.println("loginpage is displayed");
	}
	@Then("^Then Enter firstname \"([^\"]*)\" lastname \"([^\"]*)\" email \"([^\"]*)\" new password \"([^\"]*)\"$")
	public void enetr_signup_details(String firstname, String lastname,String emai, String newpassword) {

		System.out.println("hen Enter firstname");
		
	}
	@After
	public void ac()
	{
		driver.quit();
	}
}