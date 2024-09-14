package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		Thread.sleep(3000);

		Actions act =new Actions(driver);
		
		WebElement web= driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		WebElement web2=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		act.moveToElement(web).build().perform();
		act.moveToElement(web2).build().perform();
		
		web.click();

		
	}

}
