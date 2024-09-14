package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_practice_4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		act.contextClick(doubleclick).perform();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
