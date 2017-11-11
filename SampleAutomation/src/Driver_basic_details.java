import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver_basic_details {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// launch url chrome 
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://porter.in/");
		driver.manage().window().maximize();
		
		//Driver_basic_details (page 1)
		// enter driver name.
		driver.findElement(By.id("id")).sendKeys("Driver Name");
		
		// enter 10 digit phone number.
		driver.findElement(By.id("id_")).sendKeys("12345767890");
		
		//enter the secondary phone number.
		driver.findElement(By.id("id")).sendKeys("secondry txtPhoneNumber");
		
		// select region 
		Select region = new Select(driver.findElement(By.name("region dropdown id")));
		region.selectByIndex(3);
		 
		// select vehicle categeory.
		Select category = new Select(driver.findElement(By.name("vahicle category id")));
		category.selectByIndex(3);
		 
		// select vehicle number, Enter value in all four boxes.
		driver.findElement(By.id("id")).sendKeys("MH");
		driver.findElement(By.id("id")).sendKeys("01");
		
		driver.findElement(By.id("id")).sendKeys("PJ");
		driver.findElement(By.id("id")).sendKeys("2020");
		
		// enter shift start time or 
		driver.findElement(By.id("id")).sendKeys("9:00 AM");
		
		// Select shift hours.
		Select shift = new Select(driver.findElement(By.name("vahicle category id")));
		shift.selectByIndex(1);
		
		// enter driver language
		driver.findElement(By.id("id")).sendKeys("English");
		
		// select date of joining, assuming from calender.
		 driver.findElement(By.xpath("//form//input[@name='pickupdaytime']")).sendKeys("09252017");

	     // Radio Button
		 driver.findElement(By.id("id")).click();
	        
		 // select how did you hear about us 
		 Select source = new Select(driver.findElement(By.name("website")));
		 source.selectByIndex(4);
		 
		 // select sim type
		 Select simtype = new Select(driver.findElement(By.name("prepaid")));
		 simtype.selectByIndex(2);
		 
		 // select sim provider
		 Select simprovider = new Select(driver.findElement(By.name("sim provider")));
		 simprovider.selectByIndex(4);
		 
		// click on submit
		   driver.findElement(By.id("id")).click();
				 
		 // click on next 
			driver.findElement(By.id("id")).click();
				 
			
		//	case 2 : Owner_Details (page 2)
		 
			// enter owner name 
			driver.findElement(By.id("id")).sendKeys("owner Name");
			
			// enter owner phone
			driver.findElement(By.id("id")).sendKeys("owner phone");
			
			// enter owner email
			driver.findElement(By.id("id")).sendKeys("owner email");
			
			// enter owner birth date
			driver.findElement(By.xpath("//form//input[@name='pickupdaytime']")).sendKeys("07022017");
			
			// click on noc is required
			driver.findElement(By.xpath("//form//input[@name='pickupdaytime']")).click();
			
			//enetr pancard number of the owner 
			driver.findElement(By.id("id")).sendKeys("owner pancard number");
			
			// select the address proof of the owner 
			Select source1 = new Select(driver.findElement(By.partialLinkText("address proof")));
			 source1.selectByVisibleText("owner address");
			 
			 // owner address proof number
			 driver.findElement(By.id("id")).sendKeys("owner address proof number");
			 
			 // enter current address
			 driver.findElement(By.id("id")).sendKeys("enter current address");
			 
			 // enter permanent address, so check box of click same as a customer address.
			 driver.findElement(By.id("id")).click();
			 
			// click on submit
			 driver.findElement(By.id("id")).click();
					 
			// click on next 
			driver.findElement(By.id("id")).click();
		 
		
	//		case 3 : Bank_Details (page 3)
			
			// enter name of the bank 	
			driver.findElement(By.id("id")).sendKeys("name of bank");
			
			// enter account number
			driver.findElement(By.id("id")).sendKeys("account number");
			
			// reenter account number
			driver.findElement(By.id("id")).sendKeys("reenter account number");
			
			// enter ifsc code of bank
			driver.findElement(By.id("id")).sendKeys("ifsc code of bank");
			
			// reenter ifsc code of bank
			driver.findElement(By.id("id")).sendKeys("reenter ifsc code of bank");
		
			// click on submit
			 driver.findElement(By.id("id")).click();
		

	}

}
