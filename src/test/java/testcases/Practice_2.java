package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {

	public static void main(String[] args) throws InterruptedException {

  WebDriver driver  = new ChromeDriver();
  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
  driver.manage().window().maximize();
  Thread.sleep(3000);
//  WebElement emailText = driver.findElement(By.xpath("/label[@for='email']"));  
//
//  System.out.println(emailText.isDisplayed());
//  System.out.println(emailText.getText());
  
  WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='email']"));
  
  //To check displyed or not
  System.out.println(emailTextfield.isDisplayed());
  
  // To check enabled or not
  Thread.sleep(5000);
  System.out.println(emailTextfield.isEnabled());
  
  //To enter the text
  emailTextfield.sendKeys("amitdevkar1111@gmail.com");
  
  //To retrive the data
  Thread.sleep(5000);
  
  System.out.println(emailTextfield.getText());
  
  Thread.sleep(3000);
  System.out.println(emailTextfield.getAttribute("value"));
  emailTextfield.clear();
  
  
  
  
  
  
  
  
		
	}

}
