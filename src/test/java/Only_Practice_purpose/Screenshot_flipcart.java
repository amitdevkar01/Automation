package Only_Practice_purpose;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_flipcart {

	public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        TakesScreenshot TS = (TakesScreenshot) driver; 
        File Source = TS.getScreenshotAs(OutputType.FILE);
        File Tar = new File("D:\\Screenshot\\d.png") ;
        FileUtils.copyFile(Source, Tar);
	}

}
