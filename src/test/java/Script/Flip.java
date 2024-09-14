package Script;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flip {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		WebElement sr=  driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		 sr.click();
		 sr.sendKeys("iphone15");
		 sr.click();
		 
	    
	
	}

}
