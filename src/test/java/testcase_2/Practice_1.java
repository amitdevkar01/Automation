package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
     
//     To display logo 
   boolean disbled=  driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
     if(disbled =true) {
    	 System.out.println("Logo is displyed");
     }
     else {
    	 System.out.println("Logo is not displyed");
     }
//      To enabled link
     boolean enabled =driver.findElement(By.xpath("//a[@class='_9bq5'] ")).isEnabled();
     
     if(enabled=true) {
    	 System.out.println("Link is enabled ");
     }
     else {
    	 System.out.println("Link is not enabed");
     }
//      To select button
     driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
     boolean selected = driver.findElement(By.xpath("//input[@value=\"-1\"]")).isSelected();
     if(selected = true) {
    	 
    	 System.out.println("custom is selected");
     }
     else {
    	 System.out.println("Custom is not selected");
     }
     
     
	}

}
