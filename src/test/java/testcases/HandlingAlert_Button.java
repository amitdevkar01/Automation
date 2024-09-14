package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

public class HandlingAlert_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alertbutton = driver.findElement(By.id("alertbtn"));
		// located the alert button
		
		alertbutton.click();
		Thread.sleep(2000);
		
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
//        driver.switchTo().alert().dismiss();
        
//        driver.findElement(By.id("openwindow")).click();

	}

}
