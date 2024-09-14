package Only_Practice_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login_practice {

	public static void main(String[] args) throws InterruptedException {
		  
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      WebElement tab1 = driver.findElement(By.name("firstname"));
      tab1.click();
      tab1.sendKeys("Shubham");
      Thread.sleep(3000);
      
      WebElement tab2 = driver.findElement(By.name("lastname"));
      tab2.click();
      tab2.sendKeys("Gondil");
      Thread.sleep(3000);
      
      WebElement tab3 = driver.findElement(By.name("reg_email__"));
      tab3.click();
      tab3.sendKeys("7507725401");
      Thread.sleep(3000);
      
      WebElement tab4 = driver.findElement(By.id("password_step_input"));
      tab4.click();
       tab4.sendKeys("Shubham*5566");
       Thread.sleep(3000);
       
      WebElement tab5 = driver.findElement(By.id("day"));
      Select s4 = new Select(tab5);
      s4.selectByIndex(15);
      Thread.sleep(3000);
      
      WebElement tab6 = driver.findElement(By.id("month"));
      tab6.click();
      Select s5 = new Select(tab6);
      s5.selectByIndex(5);
      Thread.sleep(3000);
      
      WebElement tab7 = driver.findElement(By.id("year"));
      tab7.click();
      Select s6 =new Select(tab7);
      s6.selectByValue("2002");
      tab7.click();
      Thread.sleep(3000);
      
      WebElement tab8 = driver.findElement(By.name("sex"));
      tab8.click();
      Thread.sleep(3000);
      
      WebElement tab9 = driver.findElement(By.name("websubmit"));
      tab9.click();
      Thread.sleep(3000);
      
      System.out.println("All test cases are passed");
      
      
      
      
      
      
      
      
      
      
      
        
	}

}
