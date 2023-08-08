package week.day5;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	// Launch Chrome  
	ChromeDriver driver=new ChromeDriver();
	
	//maximize the browser
			driver.manage().window().maximize();
	
	 //Load https://www.amazon.in/
			driver.get("https://www.amazon.in/");
	      //add  implicitlyWait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	// Type "Bags" in the Search box
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
			
	 // Choose the 	 item in the result (bags for boys)
			driver.findElement(By.xpath("//span[text()=' for boys']")).click();
			
			//print the total number of result
			System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
			
			
			//select the first 2 brands in the left menu
		 
			driver.findElement(By.xpath("//span[text()='Skybags'and @class='a-size-base a-color-base']")).click();
			
		    driver.findElement(By.xpath("//span[text()='Safari' and @class='a-size-base a-color-base']")).click();
		  
		    //choose the new arrivals
		    driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		    
		    //print the first resulting bag info(name discount price)
		    System.out.println(driver.findElement(By.xpath("//span[text()='Safari']")).getText());
		    System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		    
		    //get the page title and choose the browser(driver.close())
		    System.out.println(driver.getTitle());
		    driver.close();
			
		 
		}
		
	
}