package Runnerclass;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Mainclass.Main;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Features/BDD.feature"},
		glue="Stepdefinition",
		plugin = {"pretty", "html:target/cucumber-reports"}
    )

public class Runner extends Main{
	

	@BeforeClass
	public static void beforemethod() {
		initializeObjectProperty("Wage.yml");
	}
	
//	@After
//    public static void printscreenshot(){
//    String nameofCurrClass = new Throwable().getStackTrace()[0] .getClassName();
//    System.out.println("Name of current method is "+nameofCurrClass);
//	Takescreenshot(nameofCurrClass);
//    }
	
	@AfterClass
	public static void terminatebrowser() {
		terminate();
		
	}
	
}
