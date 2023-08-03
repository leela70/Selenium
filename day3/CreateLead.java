package Week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

public static void main(String[] args) {
	//launch browser
	ChromeDriver driver = new ChromeDriver();
	//launch URl
	driver.get("http://leaftaps.com/opentaps/control/login");
    //maximize the browser
	driver.manage().window().maximize();
	//enter the user name
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	// click on login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//click on hyperlink
	driver.findElement(By.linkText("CRM/SFA")).click();
	//click on lead button
	driver.findElement(By.linkText("Leads")).click();
	//click on create lead
	driver.findElement(By.partialLinkText("Create Lead")).click();
	//enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Texas");
	//enter first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Leela Pravallika");
	//enter last Name
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	//enter first name local
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("leela");
	//department
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
	//description
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Fresher");
	//email ID
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("leela@gmail.com");
	//locate drop down
	WebElement provinceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	// select drop down
	Select provinceDropDown = new Select(provinceDD);
	//select by visible text
	provinceDropDown.selectByVisibleText("New York");
	// click create button
	driver.findElement(By.className("Submit Button")).click();
	// get title
	String title1 = "View Lead | opentaps CRM";
	String title2 = driver.getTitle();
	if(title1.equals(title2)) {
		System.out.println("title1");
	}
	else {
		System.out.println("Error");
	}
	
		
	}
	}
