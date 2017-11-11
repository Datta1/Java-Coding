import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank_Details extends Owner_Details{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		

		Driver.findElement(By.id("id")).sendKeys("owner phone");
		
		driver.findElement(By.id("id")).sendKeys("owner phone");
		
		Driver.findElement(By.id("id")).sendKeys("owner phone");
		
		Driver.findElement(By.id("id")).sendKeys("owner phone");
	}

}
