package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_calender_Date_picker {

	public static void main(String[] args) throws InterruptedException {
       
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepicker")).click();
		
		//Expected Date
		String ExpectedDay = "30";
		String ExpectedMonth ="october";
		String ExpectedYear = "2025";
		
		while(true) {
			
			String CalenderMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String CalenderYear =driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			
			System.out.println("Month  "+ CalenderMonth+ "Year  " +CalenderYear);
			
			if(CalenderMonth.equals(ExpectedMonth) && CalenderYear.equals(ExpectedYear)) 
			{
				driver.findElement(By.xpath("//a[@data-date='30']")).click();
				break;
			}
			
			else {
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			}
			
			
		}
		
	}

}
