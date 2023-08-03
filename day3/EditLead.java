package Week3.day3;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

		public class EditLead {
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
		//print text
		String text=driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
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
    	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("NLP");
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
    	//15.click create button
    	driver.findElement(By.className("smallSubmit")).click();
    	
    	//16.click on edit button
        driver.findElement(By.linkText("Edit")).click();
        //clear the description field
        driver.findElement(By.id("updateLeadForm_description")).clear();
        //importantNote field
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Iam Learning Manual and Automation in TestLeaf");
        //click on update button
        driver.findElement(By.className("smallSubmit")).click();
       
        //Get the title of Resulting page
        String text1="View Lead | opentaps CRM";
        String text2=driver.getTitle();
        if(text1.equals(text2)) {
        	System.out.println("Matches");
        }
        else {
        	System.out.println("Error");
        }        
        
	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        

}
