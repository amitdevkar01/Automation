package testcase_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_Screenshot_Of_specific_Element {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement sq = driver.findElement(By.xpath("(//div[@class=\"widget-content\"])[1]"));
//		TakesScreenshot Ts = (TakesScreenshot) driver;
		 
		File Source2 =sq.getScreenshotAs(OutputType.FILE);
		File target2 = new File("D:\\java\\automation\\Screenshot\\ppz.png");
		FileUtils.copyFile(Source2, target2);
		driver.close();
		
	}

}
