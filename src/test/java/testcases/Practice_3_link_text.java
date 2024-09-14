package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_3_link_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
//		WebElement link0= driver.findElement(By.xpath("//label[text()=\"Remember me\"]"));
		WebElement link0=driver.findElement(By.name("rememberUn"));
		link0.click();
		System.out.println(link0.isEnabled());
		System.out.println(link0.isSelected());
		System.out.println(link0.isDisplayed());
		
		WebElement link1 = driver.findElement(By.linkText("forgot_password_link"));
		link1.click();
		System.out.println(link1.isDisplayed());
		System.out.println(link1.isEnabled());		
		Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.navigate().back();	
		Thread.sleep(3000);
		
		WebElement link2 = driver.findElement(By.partialLinkText("mydomainLink"));
		link2.click();
		System.out.println(link2.isDisplayed());
		System.out.println(link2.isEnabled());
		

	}

}
