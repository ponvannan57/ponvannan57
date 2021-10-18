package Stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Mainclass.Main;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition extends Main{
	
	
	@Given("^I Configure the Browser as \"([^\"]*)\" with URL \"([^\"]*)\"$")
    public void i_configure_the_browser_as_something_with_url_something(String Browser, String URL) throws Throwable {
		 Browserselection(Browser,URL);	
    }
	
	 @Then("^Login with the username (.+)$")
	    public void login_with_the_username(String username) throws Throwable {
		 System.out.println(username);
		d.findElement(By.xpath(getElementProperty("HomePage.Username"))).sendKeys(username);
		Takescreenshot(nameofCurrClass);
		d.findElement(By.xpath(getElementProperty("HomePage.Loginbutton"))).click();
		Takescreenshot(nameofCurrClass);
    }
}
