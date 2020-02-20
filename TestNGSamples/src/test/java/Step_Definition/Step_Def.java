package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step_Def {
	@Given("^User is able to login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_able_to_login_with_valid_and(String arg1, String arg2) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Goto the account setting and click the settings$")
	public void goto_the_account_setting_and_click_the_settings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify the logged in user name$")
	public void verify_the_logged_in_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
