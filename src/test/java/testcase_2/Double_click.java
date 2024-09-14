package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act = new Actions(driver);
		
		WebElement web1= driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		act.doubleClick(web1).perform();
		
		
		WebElement field_1 = driver.findElement(By.xpath("//input[@id='field1']"));
		 String text_on_F1 = field_1.getAttribute("value");
		 
		WebElement field_2 = driver.findElement(By.xpath("//input[@id='field2']"));
		 String text_on_f2 = field_2.getAttribute("value");
		 
		 System.out.println("Text on field 1: " + text_on_F1);
		 System.out.println("Text on field 2: " + text_on_f2);
		 
		 if(text_on_F1.equals (text_on_f2)) {
			 System.out.println("Test passed");
		 }
		 else {
			 System.out.println("Test is not passed");
		 }
		
		
	}

}
