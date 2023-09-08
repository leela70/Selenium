package week9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
public static void main(String[] args) {
	
	//launch the chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the application url
		driver.get("https://uibank.uipath.com/register-account");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("leela");
	
		//select[@id='title']
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='title']"));
			
		Select titledropDown=new Select(dropDown);
		
		titledropDown.selectByVisibleText("Ms");
		
		
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("N");
		
WebElement dropDown1=driver.findElement(By.xpath("//select[@id='sex']"));
	
		Select genderdropDown=new Select(dropDown1);
		genderdropDown.selectByVisibleText("Female");
	
WebElement dropDown2=driver.findElement(By.xpath("//select[@id='title']"));
	
		
		
		Select titledropDown1=new Select(dropDown2);
		
		titledropDown1.selectByVisibleText("Ms");
	
	
WebElement dropDown3=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
	
		
		
		Select empdropDown=new Select(dropDown3);
		
		empdropDown.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("leela");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nleela@gmail.com");

	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pravali");

	driver.close();
	
	
	
	
	
	
	
	
}
}
