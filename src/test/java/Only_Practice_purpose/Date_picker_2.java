package Only_Practice_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_2 {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver =new ChromeDriver();
       driver.get("https://jqueryui.com/datepicker/");
       driver.manage().window().maximize();
       driver.switchTo().frame(0);
       Thread.sleep(3000);
       driver.findElement(By.id("datepicker")).click();
       
       while(true) {
    	   String calMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    	   String CalYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	   
    	   System.out.println("Month "+ calMonth +"Year  "+CalYear );
    	   
    	   if(calMonth.equals("october") && CalYear.equals("2035"))
    			   {
    		         driver.findElement(By.xpath("//a[@data-date=\"10\"]")).click();
    		         break;
    			   }
    	   else {
    		   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    		   
    	   }
       }
       
	}

}
