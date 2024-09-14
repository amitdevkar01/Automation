package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropdowenButtons = driver.findElement(By.id("dropdown-class-example"));
		
//		located dropdowen button
		Select s = new Select(dropdowenButtons);
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByValue("option2");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Option3");
		
//		List<WebElement> options =s.getOptions();
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
//		System.out.println();
//		
//		for(WebElement k:options) {
//			System.out.println(k.getText());
//		}
//		
		
		
		
		

	}

}
