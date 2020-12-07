package ixigo;


import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Driver.Driverin;
import Page.ixigoPage;
import utils.utils;


public class ListOfTop20CheapestFlights extends TestBase {
	
	
	
	 public static  void main(String[] args) throws Exception {
		
		FilghtsList();
	}

	@Test public static  void FilghtsList () throws Exception {
		
		
		driver = new Driverin("chrome").init();
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ixigo.com/search/result/flight/DEL/BLR/13052020/20052020/1/0/0/e?source=Search%20Form/");
	
	ixigoPage.ReturnTab(driver).click();
	Thread.sleep(1000);
	
	ixigoPage.EnterFromCity(driver).sendKeys("DEL - New Delhi");
	Thread.sleep(1000);
	
	ixigoPage.EnterFromCity(driver).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	ixigoPage.EnterTOCity(driver).sendKeys("BLR - Bengaluru");
	Thread.sleep(1000);
	
	ixigoPage.EnterTOCity(driver).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	
	ixigoPage.SelectDepartureDate(driver).click();
	Thread.sleep(1000);
	
    String DDate = utils.DepartureDate();
	driver.findElement(By.xpath("//tr/td[@data-date='"+DDate+"']")).click(); 

	
	Thread.sleep(1000);
	String ReturnDate = utils.ArrivalDate();
	
	driver.findElement(By.xpath("(//tr/td[@data-date='"+ReturnDate+"'])[2]")).click(); 
	Thread.sleep(1000);
	
	ixigoPage.Search(driver).click();
	Thread.sleep(25000);
	
	
	
	 List<WebElement> eDepFlightName = driver.findElements(By.xpath("(//div[@class='result-col-inner'])[1]//div[@class='airline-text']/div"));
     List<WebElement> eDepPrices = driver.findElements(By.xpath("(//div[@class='result-col-inner'])[1]//div[@class='price']//span[2]"));
     List<WebElement> eRetFlightName = driver.findElements(By.xpath("(//div[@class='result-col-inner'])[2]//div[@class='airline-text']/div"));
     List<WebElement> eRetPrices = driver.findElements(By.xpath("(//div[@class='result-col-inner'])[2]//div[@class='price']//span[2]"));

     List<String> cheapCombo = new ArrayList<String>();
     for (int i =0; i<20; i++) {
         cheapCombo.add("DepartureFlightName: "+ eDepFlightName.get(i).getText()+" " +"|PRICE: "+eDepPrices.get(i).getText()+" "+"|| ReturnFilghtName:  "+eRetFlightName.get(i).getText()+" "+"|PRICE: "+eRetPrices.get(i).getText());
     }
     System.out.println("Top 20 cheapest Flights are :");
     for (String s: cheapCombo) {
    	      System.out.println(s +"\n");
          }
	
		Thread.sleep(20000);
		driver.close();
			
	}

	
}
	

