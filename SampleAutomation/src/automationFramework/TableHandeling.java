package automationFramework;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TableHandeling {
	public static void main(String[] args) {
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		 driver.manage().window().maximize();
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		
		// Here we are clicking on the link of first row and the last column
				String text = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[1]")).getText();   
				System.out.println(text);
				driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[6]/a")).click(); 
				System.out.println("2nr row executed");
				
				
		//driver.close();
	}
}