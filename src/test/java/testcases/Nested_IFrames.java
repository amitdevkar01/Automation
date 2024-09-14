package testcases;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nested_IFrames {

	public static void main(String[] args) throws InterruptedException {
		  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Amit");
		Thread.sleep(3000);
		//first frame
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Thread.sleep(3000);
		Select sd = new Select(driver.findElement(By.id("course")));
		sd.selectByVisibleText("Python");
		Thread.sleep(3000);
		// back to the origine
         driver.switchTo().defaultContent();
         Thread.sleep(3000);
         
         driver.findElement(By.id("name")).sendKeys("Devkar");
         Thread.sleep(3000);
         //2 frame
         
         driver.switchTo().frame(driver.findElement(By.id("frm2")));
         Thread.sleep(3000);
         driver.findElement(By.id("firstName")).sendKeys("Amit");
         Thread.sleep(3000);
         driver.findElement(By.id("lastName")).sendKeys("Devkar");
         Thread.sleep(3000);
         driver.findElement(By.id("malerb")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("englishchbx")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("email")).sendKeys("abd@22gmail.com");
         
         Thread.sleep(3000);
         
         driver.switchTo().defaultContent();
         System.out.println("Now iam origin");
         
         
         
         
         
         
         
         
         
		

	}

}
