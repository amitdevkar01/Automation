package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insursnce {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devmo.evervent.in/");
		driver.findElement(By.xpath("(//p[text()=\" Insurance\"])[1]")).click();
		
		
	}

}
