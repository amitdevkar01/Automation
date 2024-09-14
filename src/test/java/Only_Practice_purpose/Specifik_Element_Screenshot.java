package Only_Practice_purpose;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specifik_Element_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      WebElement ss = driver.findElement(By.xpath("//div[@class=\"_2j7a4R\"]"));
//      TakesScreenshot Ts =(TakesScreenshot)driver;
     File sou = ss.getScreenshotAs(OutputType.FILE);
         File tg = new File("D:\\Screenshot\\p.png");
         FileUtils.copyFile(sou, tg);
         driver.close();
		
	}

}
