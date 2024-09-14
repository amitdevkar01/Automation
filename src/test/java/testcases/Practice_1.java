package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.id("name"));
		firstName.click();
		firstName.sendKeys("Amit");
		
		Thread.sleep(2000);
		
		WebElement Name = driver.findElement(By.id("email"));
		Name.click();
		Name.sendKeys("amitdevkar1111@gmail.com");
		
		WebElement gend = driver.findElement(By.id("gender"));
		gend.click();
		gend.sendKeys("Male");
		
		WebElement m =driver.findElement(By.id("mobile"));
		m.click();
		m.sendKeys("7507725481");
		
		WebElement b = driver.findElement(By.id("dob"));
		b.click();
		b.sendKeys("11-11-2000");
		
		WebElement s = driver.findElement(By.id("subjects"));
		s.click();
		s.sendKeys("science");
		
		WebElement h = driver.findElement(By.id("hobbies"));
		h.clear();
		h.sendKeys("Sport");
		
		WebElement p = driver.findElement(By.id("picture"));
		p.clear();
		p.sendKeys("p");
		
		
	}

}
