package week9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	
			//launch the chrome browser
			ChromeDriver driver =new ChromeDriver();
			
			//load the application url
			driver.get("https://www.facebook.com/");
			
			//maximize the browser
			driver.manage().window().maximize();
			

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Leela");
			
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nandam");
			
			
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7032352561");
			
			
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pravali");

			WebElement DayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		    Select DateOfBirthDropDown = new Select(DayDropDown);
		    
		    
		    DateOfBirthDropDown.selectByVisibleText("1");
		    
		    WebElement MonthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		    
		    Select DOBDropDown = new Select(MonthDropDown);
		    
		    
		    DOBDropDown.selectByVisibleText("Nov");
		    
		    WebElement YearDropDown = driver.findElement(By.xpath("//select[@id='year']"));
		    		    Select DropDown = new Select(YearDropDown);
		    
		    DropDown.selectByVisibleText("2001");
		    
		    driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		}
}
