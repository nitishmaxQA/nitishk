package Browserfactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser implements Browser {

	
	 public WebDriver getDriver() throws Exception {
	        setDriverBinaryPath();
	        return new ChromeDriver();
	    }


	    public void setDriverBinaryPath() {
	        WebDriverManager.chromedriver().setup();
	        

	    }
	
}
