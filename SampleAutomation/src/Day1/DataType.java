package Day1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class DataType {
	 
	public static void main(String[] args) {
		
	//	System.out.println("my name is datta");
	
		
		// Create a new instance of the chrome driver
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String url = "http://www.store.demoqa.com";
        //Launch the Online Store Website
		driver.get(url);
		
		//get page title and title length
		String title = driver.getTitle();
		int length = driver.getTitle().length();
		
		//print inconsole above result
		System.out.println("the title of page is " +title);
		System.out.println("the titlelength of page is " +length);
		
		//get pageurl and verify with original
		String currentUrl2 = driver.getCurrentUrl();
		
		if (currentUrl2.equals(url)) {
			System.out.println("expected behaviour hance script is passed");
		}
		
		else {
			System.out.println("unexpected behaviour hance script is failed");
		}
 
//        // Print a Log In message to the screen
//        System.out.println("Successfully opened the website www.Store.Demoqa.com");
//        String currentUrl = driver.getCurrentUrl();
//        //driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        int length2 = driver.getPageSource().length();
        System.out.println("page source length is " +length2);
        //System.out.println(currentUrl);
//System.out.println(pageSource);
        
        System.out.println("i got all answers");
 
//		//Wait for 5 Sec
//		Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
   }
	
}
