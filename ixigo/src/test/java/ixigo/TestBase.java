package ixigo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import Driver.Driverin;
import Page.ixigoPage;

public class TestBase {

	public static WebDriver driver;
	
	protected ixigoPage IxigoPage;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws Exception {
	    driver = new Driverin("chrome").init();
	    IxigoPage = new ixigoPage();
	    
	}


	// @AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {
	    if (null != driver) {
	        driver.quit();
	        driver = null;
	    }
	}

	
}
