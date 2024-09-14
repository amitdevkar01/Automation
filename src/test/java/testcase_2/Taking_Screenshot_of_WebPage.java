package testcase_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_Screenshot_of_WebPage {

	public static void main(String[] args) throws IOException {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\java\\automation\\Screenshot\\abc.png");
		FileUtils.copyFile(Source,target);
		
		
	}

}
