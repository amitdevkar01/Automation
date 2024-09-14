package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heliverse_Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"/register\"]")).click();
		Thread.sleep(3000);
		// Form Validation
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("Amit");
		Thread.sleep(3000);
		driver.findElement(By.name("LastName")).sendKeys("Devkar");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("amitdevkar1111@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("Heliverse$0609");
		Thread.sleep(3000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Heliverse$0609");
		Thread.sleep(3000);
		
		driver.findElement(By.id("register-button")).click();
		System.out.println("You have succesfully Registerd");
        Thread.sleep(3000);
	}

}
