package testcase_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Execution {

	public static void main(String[] args) {
      ChromeOptions option = new ChromeOptions();
      option.addArguments("--headless");
      
//      ChromeOptions option = new ChromeOptions();
//      option.AddArgument("test-type");
//      option.AddArgument("start-maximized");
//      option.AddArgument("window-size=1920,1080");
//      option.AddArgument("enable-precise-memory-info");
//      option.AddArgument("disable-popup-blocking");
//      option.AddArgument("disable-default-apps");
//      option.AddArgument("test-type=browser");
      
      WebDriver driver = new ChromeDriver(option);
      driver.get("https://www.ssquareit.in/");
      System.out.println(driver.getTitle());
	}

}
