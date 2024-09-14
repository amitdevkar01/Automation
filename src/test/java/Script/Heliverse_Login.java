package Script;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heliverse_Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demowebshop.tricentis.com/");
		//		Now Log in
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("raspbiansec@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("Sumit@123");
		Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		
		System.out.println("User suceesfully login  ");
		
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[4]")).click();
		
		
		Set<String> obj=driver.getWindowHandles();
	      Iterator<String> it =obj.iterator();
	      String parent_W_1 = it.next();
//	      String child_W_1 =it.next();
	      Thread.sleep(3000);
	      
	      driver.switchTo().window(parent_W_1);
	      Thread.sleep(3000);
	      System.out.println(driver.getCurrentUrl());
	      driver.findElement(By.id("product_attribute_16_3_6_18")).click();
	      Thread.sleep(3000);
	      WebElement QT =driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
	      QT.clear();
	      QT.sendKeys("5");
	      Thread.sleep(3000);
	      driver.findElement(By.id("add-to-cart-button-16")).click();
	      Thread.sleep(3000);
	      
	       String ExpectT= "Demo Web Shop. Build your own computer";
	       String ActualT = driver.getTitle();
	       Assert.assertEquals(ExpectT, ActualT);
	       
	       System.out.println("The product has been added to the cart");
	      
		   driver.close();
	}

	

}
