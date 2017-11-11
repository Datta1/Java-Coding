import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Owner_Details extends Driver_basic_details{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initiate chrome
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
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
		Select source = new Select(driver.findElement(By.partialLinkText("office address")));
		 source.selectByIndex(4);


		
	
		
		
		
		

	}

}
