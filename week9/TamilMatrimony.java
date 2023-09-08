package week9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
public static void main(String[] args) {
	

	
	//launch the chrome browser
	ChromeDriver driver =new ChromeDriver();
	
	//load the application url
	driver.get("https://WWW.tamilmatrimony.in/");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement dropDown=driver.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
	
	Select mySelfdropDown=new Select(dropDown);
	
	mySelfdropDown.selectByVisibleText("Myself");
	
	driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("LEELA");
	
	
	driver.findElement(By.xpath("(//input[@name='GENDER'])[2]")).click();
	
	
WebElement dropDown1=driver.findElement(By.xpath("//select[@name='DOBDAY']"));
	
	Select daydropDown=new Select(dropDown1);
	
	daydropDown.selectByVisibleText("1");
	
	
WebElement dropDown2=driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
	
	Select monthdropDown=new Select(dropDown2);
	
	monthdropDown.selectByVisibleText("Nov");
	
	
WebElement dropDown3=driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
	
	Select yeardropDown=new Select(dropDown3);
	
	yeardropDown.selectByVisibleText("2001");
	

	
WebElement dropDown4=driver.findElement(By.xpath("//select[@id='RELIGION']"));
	
	Select reldropDown=new Select(dropDown4);
	
	reldropDown.selectByVisibleText("Hindu");
	
WebElement dropDown5=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	
	Select langdropDown=new Select(dropDown5);
	
	langdropDown.selectByVisibleText("Telugu");
	
	
	
WebElement dropDown6=driver.findElement(By.xpath("//select[@id='COUNTRY']"));
	
	Select countrydropDown=new Select(dropDown6);
	
	countrydropDown.selectByVisibleText("India");
	
	driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7032352561");
	
	
	driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("nleela@gmail.com");
	
	driver.close();
	
	

	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
}
}
