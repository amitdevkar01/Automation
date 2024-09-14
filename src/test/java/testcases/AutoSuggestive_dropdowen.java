package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestive_dropdowen {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.manage().window().maximize();
     Thread.sleep(3000);
     
     WebElement countryDropdowen = driver.findElement(By.id("autosuggest"));
     countryDropdowen.sendKeys("ind");
     Thread.sleep(3000);
     
     List<WebElement> options= driver.findElements(By.xpath(" //li[@class=\"ui-menu-item\"]"));
     
     for(int i = 0;i<options.size();i++) {
    	 if(options.get(i).getText().equalsIgnoreCase("india")) {
    		 options.get(i).click();
    		 
    	 }
    	 
     }
     
     driver.findElement(By.xpath("//span[@class=\"red-arrow-btn\"]")).click();
     Thread.sleep(2000);
     
     WebElement arrivalcity = driver.findElement(By.xpath("//a[@value=\"HYD\"]"));
     arrivalcity.click();
     
     WebElement departcity = driver.findElement(By.xpath("//a[@value=\"AIP\"]"));
     departcity.click();  
     
    
     
    List<WebElement> dates= driver.findElements(By.xpath("//td[@data-month=\"3\"]"));
    
    for(int i =0;i<dates.size();i++) {
    	if( dates.get(i).getText().equals("25")) {
    		
    		dates.get(i).click();
        	
    	}
    	System.out.println(dates.get(i).getText());

    }
    Thread.sleep(2000);
    
//    To select the return date
//    
    List<WebElement> returnD = driver.findElements(By.xpath("//td[@data-month=\"4\"]"));
    for(int i = 0;i<returnD.size();i++) {
    	if(returnD.get(i).getText().equals("7")) {
    		returnD.get(i).click();
        	
    	}
    	System.out.println(returnD.get(i).getText());
    }
    
    WebElement adult = driver.findElement(By.id("divpaxinfo"));
    adult.click();
    
    
    WebElement adultNum = driver.findElement(By.id("hrefIncAdt"));
    adultNum.click();
    Thread.sleep(2000);
    
    WebElement child = driver.findElement(By.id("hrefIncChd"));
    child.click();
    Thread.sleep(2000);
    
    WebElement infant = driver.findElement(By.id("hrefIncInf"));
    infant.click();
    Thread.sleep(2000);
    
    WebElement done = driver.findElement(By.id("btnclosepaxoption"));
    done.click();
    Thread.sleep(2000);
    
    
//    To Select the currency
    WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    Select currency1 = new Select(currency);
	currency1.selectByValue("INR");
	Thread.sleep(2000);
	
	
	WebElement search = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
	search.click();
	
    driver.close();
    
    
     
	}

}
