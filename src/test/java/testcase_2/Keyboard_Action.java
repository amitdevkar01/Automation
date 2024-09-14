package testcase_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.get("https://text-compare.com/");
        driver.findElement(By.id("inputText1")).sendKeys("Amit");
        
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        //ctl +a
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
         //ctl+c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        //TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
        //ctl+v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
          

	}

}
