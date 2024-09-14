package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class He {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://bimastreet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//     driver.findElement(By.xpath("//img[@src='https://strapi.bimastreet.com/uploads/health_c2fc1785f1_66203e968b.svg']")).click();
       driver.findElement(By.xpath("(//p[text()='Health Insurance'])[1]")).click();	
       Thread.sleep(3000);
       driver.findElement(By.id("One Adult")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.id("Two Adult")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//input[@id=\"Son \"]")).click();
       Thread.sleep(3000);

       driver.findElement(By.xpath("//input[@id=\"Daughter \"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@id='1st Adult DOB']")).click();
       Thread.sleep(3000);
       
       WebElement dayDropdown = driver.findElement(By.xpath("//button[text() ='1']"));   
       dayDropdown.click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[text()='January']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[text()='1980']")).click();

//       while(true) {
//    	   String month = driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']"));
//       }
     //  WebElement monthDropdown = driver.findElement(By.id("month")); 
     //  WebElement yearDropdown = driver.findElement(By.id("year"));  
       
       
//       Select selectDay = new Select(dayDropdown);
//       selectDay.selectByVisibleText("1");  
       
//       Select selectMonth = new Select(monthDropdown);
//       selectMonth.selectByVisibleText("");  
//       
//       Select selectYear = new Select(yearDropdown);
//       selectYear.selectByVisibleText("1990"); 
       
        WebElement sim= driver.findElement(By.id("Gender"));
        sim.click();
        Thread.sleep(3000);
       Select m = new Select(sim);
        m.selectByVisibleText("Male");
        
        
        
        
       
	}

}
