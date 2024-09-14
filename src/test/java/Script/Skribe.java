package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skribe {

	public static void main(String[] args) throws InterruptedException {
               
		WebDriver driver =new ChromeDriver();
		driver.get("https://beta-app.goskribe.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("abc212@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Kamlon*5425");
		driver.findElement(By.xpath("//span[text()=\"Log In\"]")).click();
		Thread.sleep(3000);
		 WebElement wd = driver.findElement(By.xpath("//a[text()=\"Forgot Password ?\"]"));
		 wd.click();

		 
		System.out.println("Forget password page Displyed  "+ wd.isEnabled());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc212@gmail.com");
		driver.findElement(By.xpath("//a[text()=\"Send Link\"]")).click();
		
		System.out.println("Link is received Succesfully");
	}

}
