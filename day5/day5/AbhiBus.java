package week.day5;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AbhiBus {
		

		public static void main(String[] args) {
			//launch the browser
			ChromeDriver driver = new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			// Launch  URL
			driver.get(" https://www.abhibus.com/");
			// Click on Bus
			driver.findElement(By.xpath("//*[@id=\"pills-home-tab\"]")).click();
	
			//Type Chennai in the FROM text box
		driver.findElement(By.id("source")).sendKeys("Chennai");
			//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
			//Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
			//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
			//Select tomorrow's date in the Date field
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='6']")).click();
			// Click Search Buses
			driver.findElement(By.xpath("//a[text()='Search']")).click();
			//Print the name of the first resulting bus (use .getText())
			WebElement name=driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
			name.click();
			String BusName=name.getText();
			System.out.println("BusName");
			//Choose SLEEPER in the left menu from Bus Type

			driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();

			//Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
			WebElement name2=driver.findElement(By.xpath("//p[text()='15 Seats Available']"));
			name2.click();
			String name3=name2.getText();
			System.out.println("name of first resulting bus seat: "+name3);
			//Click SelectSeat
			driver.findElement(By.className("book")).click();
			//Choose any one Available seat
			driver.findElement(By.className("pillow")).click();
			//Print Seats Selected ,Total Fare
			WebElement seat=driver.findElement(By.id("seatnos"));
			seat.click();
			String seat1=seat.getText();
			WebElement fare=driver.findElement(By.id("ticketfare"));
			fare.click();
			String fare1=fare.getText();
			System.out.println("seat selected:"+seat1+"fare:"+fare1);
			
		}

	}

