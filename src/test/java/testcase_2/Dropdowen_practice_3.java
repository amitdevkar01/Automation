package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowen_practice_3 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    
    WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
    
    Select sel= new Select(Day);
    sel.selectByIndex(12);
    Thread.sleep(2000);
    
    WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
    
    Select sel2 = new Select(month);
    sel2.selectByValue("11");
    Thread.sleep(2000);
    
    WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
    
    Select sel3 = new Select(year);
    sel3.selectByValue("2000");
    Thread.sleep(2000);
    
    
    
	}

}
