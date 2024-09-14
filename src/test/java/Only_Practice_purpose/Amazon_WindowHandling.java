package Only_Practice_purpose;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_WindowHandling {

	public static void main(String[] args) throws InterruptedException {
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement sd = driver.findElement(By.xpath("//img[@alt=\"Twitter\"]"));
		sd.click();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
//		Set<String> Ob  = driver.getWindowHandles();
//		Iterator<String> is =Ob.iterator();
//		String window_p = is.next();
//		String child_W = is.next();
//		Thread.sleep(3000);
//		System.out.println(driver.getCurrentUrl());
		
		
		Set<String> windowhandles =driver.getWindowHandles();
	      Iterator<String> iterator =windowhandles.iterator();
	      String parentwindow = iterator.next();
	      String gwindow = iterator.next();
	      Thread.sleep(3000);
		 driver.switchTo().window(gwindow);
		 driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
//		Set<String> SD =driver.getWindowHandles();
//		Iterator<String> pp=SD.iterator();
//		String P1= pp.next();
//		String C1 = pp.next();
//		Thread.sleep(3000);
//		System.out.println(driver.getCurrentUrl());
//		
//		
		

	}

}
