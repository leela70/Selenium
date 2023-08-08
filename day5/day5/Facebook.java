package week.day5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

public static void main(String[] args) {
		

	//launch the chrome browser
	ChromeDriver driver =new ChromeDriver();
	
	//load the application url
	driver.get("https://www.facebook.com/");
	
	//maximize the browser
	driver.manage().window().maximize();
	

	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//click the create account
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	//enter the firstname
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Leela");
	
	//enter the lastname
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nandam");
	
	//enter the mobilenumber
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7032352561");
	
	//enter the password
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pravali");

	WebElement DayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
	//Select the value from dropdown using select class
    Select DateOfBirthDropDown = new Select(DayDropDown);
    
    //Select the value from dropdown using visible text
    DateOfBirthDropDown.selectByVisibleText("1");
    
    WebElement MonthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
    //select the value from dropdown using select class
    Select DOBDropDown = new Select(MonthDropDown);
    
    //Select the value from dropdown using visible text
    DOBDropDown.selectByVisibleText("Nov");
    
    WebElement YearDropDown = driver.findElement(By.xpath("//select[@id='year']"));
    //select the value from dropdown using select class
    Select DropDown = new Select(YearDropDown);
    
    //Select the value from dropdown using visible text
    DropDown.selectByVisibleText("2001");
    
    //click the radio button
    driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();


}
}