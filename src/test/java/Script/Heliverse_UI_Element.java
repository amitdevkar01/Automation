package Script;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Heliverse_UI_Element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demowebshop.tricentis.com/");
	     
        WebElement sr =    driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
        sr.click();
        sr.sendKeys("Laptop");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
        System.out.println("Search Button Properly working");
        Thread.sleep(3000);
        WebElement ft= driver.findElement(By.xpath("//div[@class=\"footer-menu-wrapper\"]"));
        Assert.assertTrue(ft.isDisplayed());
        System.out.println("Footer is displyed");
        Thread.sleep(2000);

         driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
         
         System.out.println("Books option is clickable");
        
         driver.close();
        
		
		
	}

}
