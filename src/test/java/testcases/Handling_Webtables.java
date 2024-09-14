package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//for Row
		
		 List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowcount=  row.size();
		System.out.println("number of row is" +rowcount);
		
		//for column
		 List<WebElement> column= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		int columncount= column.size();
		System.out.println("Number of column is" +columncount);
		
		
		//printing value (cell) from specific row and column
		
		WebElement data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]"));
		String datavalue = data1.getText();
		System.out.println(datavalue);
		
		
		
//		//printing all values from the table
//		for(int r = 2;r<=rowcount;r++) {
//			for(int c=1;c<=columncount;c++) 
//			{
//				WebElement elements=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));//dynamic xpath
//				String alldata = elements.getText();
//				System.out.print(alldata +"   ");
//			}
//			System.out.println("   ");
//			
//		}
//		
		//printing a  book name whose auther name is Amit
		WebElement bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]"));
		bookname.getText();
//		System.out.println(bookname.getText());
		
		//print all the bookname whose author name is Amit 
		for(int r =2;r<=rowcount;r++) {
		String bookname2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
		if(bookname2.equals("Amit")) {
			WebElement bookname1= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]"));
			bookname1.getText();
			System.out.println(bookname1.getText());
			
			
		}
				
		}
		
		//Sum of all book prices
		int sum = 0;
		for(int p =2;p<=rowcount;p++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+p+"]//td[4]")).getText();
			
			int actual_price = Integer.parseInt(price);
			sum = sum+actual_price;
		}
		   System.out.println("Sum of all book prices"+sum);
		
		
		
		
	}

}
