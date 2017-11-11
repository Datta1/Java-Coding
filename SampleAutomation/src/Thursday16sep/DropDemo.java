package Thursday16sep;

import java.util.List;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;


public class DropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://iq1portal.fiberlink.com/emc/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("EMail")).sendKeys("30069808_dakoleka");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("Password")).sendKeys("admin@123");
		driver.findElement(By.id("submit")).click();
		
		
		//submit
		
		driver.findElement(By.classname("bctooltip");
		driver.findElement(By.id("addDevice")).click();
		
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
		
		
		
		//addDevice

	}

}
}
