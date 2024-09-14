package Script;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		
//		
//          Set<String> sd= driver.getWindowHandles();
//          Iterator<String> td =sd.iterator();
//          String pp = td.next();
		driver.switchTo().frame(0);
//        Thread.sleep(3000);
//
      WebElement ki=  driver.findElement(By.xpath("//*[@id=\"id-33\"]/section[2]/section/div[1]/div/input"));
      ki.click();
//      ki.sendKeys("7504565845");
//        driver.findElement(By.xpath("//span[text()='Continue with Email']")).click();
        
		Thread.sleep(3000);

		System.out.println("OTP has been sent successfully");
		driver.close();

	}

}
