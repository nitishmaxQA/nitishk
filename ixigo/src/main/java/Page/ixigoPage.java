package Page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ixigoPage  {

	private static WebElement element = null;
	
	public static WebElement ReturnTab (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()='Round Trip']"));
		return element;
		
	}
    

	public static WebElement EnterFromCity (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='From']/following-sibling::input"));
		return element;
		
	}
	
	
	public static WebElement EnterTOCity (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='To']/following-sibling::input"));
		return element;
		
	}
	
	public static WebElement SelectDepartureDate (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Departure']/following-sibling::input"));
		return element;
		
	}
	
	public static WebElement Search (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[text()='Search']"));
		return element;
		
	}
	
	


   
    
   
    
  




}
