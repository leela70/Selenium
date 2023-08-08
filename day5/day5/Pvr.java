package week.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Pvr{
	public static void main(String[]args) throws InterruptedException {
		//launch the Chrome browser
				ChromeDriver driver =new ChromeDriver();
				
				//load the application url
				driver.get("https://www.pvrcinemas.com/");
				

				//maximize the browser
				driver.manage().window().maximize();
				
				//click on Icon 
				driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
				
				//time duration
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//click on movie library
				driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
				
				//time duration
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// click the Genre
				WebElement OneDropDown=driver.findElement(By.xpath("//select[@name='genre']"));
		        Select GenreDropDown = new Select(OneDropDown);
		       
		         //Select the value from dropdown using visible text
		         GenreDropDown.selectByVisibleText("ANIMATION");
		         
		         //click on language
		         WebElement TwoDropDown=driver.findElement(By.xpath("//select[@name='lang']"));
		         Select languageDropDown= new Select(TwoDropDown);
		         
		         //select the value from dropdown using visible text
		         languageDropDown.selectByVisibleText("ENGLISH");
		         
		         //click on apply button
		         driver.findElement(By.xpath("//button[text()='Apply']")).click();
		         
		       //time duration
		 		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         
		        
		        Thread.sleep(5000); 
		         // Click on first resulting animation movie
		        driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		 		
		        //WebElement temp = driver.findElement(By.xpath("//src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=8']"));
		        //temp.click();
		        
		 		 //time duration
		 		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		         
		        //click on proceed to book
		         driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		         
		         //time duration
		 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         
		         //click on Cinema
		         WebElement ThreeDropDown=driver.findElement(By.xpath("//select[@id='cinemaName']"));
		         Select CinemaDropDown= new Select(ThreeDropDown);
		         
		         //select the value from dropdown using visible text
		         CinemaDropDown.selectByVisibleText("PVR Velachery Chennai");
		         
		         //click on date
		         driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
		         //select the date
		         driver.findElement(By.xpath("(//span[contains(@class,'day-unit ng-star-inserted')])[1]")).click();
		         
		         //click on preffered show time
		         WebElement FourthDropDown=driver.findElement(By.xpath("//select[@name='timings']"));
		         Select ShowDropDown=new Select(FourthDropDown);
		         
		         //select the value from dropdown using visible text
		         ShowDropDown.selectByVisibleText("09:00 AM - 12:00 PM");
		         
		         //enter the no of seats
		         driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		         
		         
		         //enter the name
		         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("leela");
		         
		         //enter the mail
		         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("leela@gmail.com");
		         
		         //enter the mob no
		         driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7032352561");
		         
		         //enter the F&B Requirements
		         driver.findElement(By.xpath("//select[@name='food']")).sendKeys("No");
		         
		         //click other requirements
		         driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
		         
		         //click on copy to self
		         driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		         
		         //click on send request
		         driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		         
		         //click cancel
		         driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		         
		         //close the otp
		         driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		         
		         //verify the tittle
		 		 String text=driver.getTitle();
		 		 System.out.println("Page Tittle:"+text);
			}
		}
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         

		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		        
