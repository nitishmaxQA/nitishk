package Driver;

import org.openqa.selenium.WebDriver;

import Browserfactory.ChromeBrowser;

public class Driverin {

	  private String browser;

	    public Driverin(String browser) {
	        this.browser = browser;
	    }

	    public WebDriver init() throws Exception {

	        WebDriver webDriver = null;
	        webDriver = new ChromeBrowser().getDriver();

	        DriverProvider.setDriver(webDriver);
	        return webDriver;
	    }
	
	
}
