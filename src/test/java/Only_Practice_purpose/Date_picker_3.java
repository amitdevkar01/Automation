package Only_Practice_purpose;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Date_picker_3 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://dequeuniversity.com/library/aria/date-picker");
		  Thread.sleep(3000);
//		  Actions as=new Actions(driver);
		 WebElement wg=  driver.findElement(By.xpath("//img[@alt=\"Calendar View\"]"));
		 wg.click();
//		 as.doubleClick(wg).build().perform();
		 while(true) {
			 String calMN = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			 String calYR = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			 System.out.println("Month "+calMN+"Year "+calYR);
			 if(calMN.equals("November") && calYR.equals("2030")) {
				 driver.findElement(By.xpath("//a[@ aria-label=\"11 November 2030 Monday\"]")).click();
			 }
			 else {
				 driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			 }
		 }
		  
	}

}
