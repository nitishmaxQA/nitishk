package Browserfactory;

import org.openqa.selenium.WebDriver;

public interface Browser {

	 WebDriver getDriver() throws Exception;
	    void setDriverBinaryPath();
	
}
