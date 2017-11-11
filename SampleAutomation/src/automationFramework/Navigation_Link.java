package automationFramework;
	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Navigation_Link {
	public static void main(String[] args) throws Exception {
		// Create a new instance of the FireFox driver
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		// Open ToolsQA web site
		String appUrl = "http://toolsqa.com/selenium-webdriver/webelement-commands/";
		driver.get(appUrl);
		WebElement link = driver.findElementByXPath("//*[@id=\"primary-menu\"]/li[1]/a/span/span");
		String text = link.getTagName();
		System.out.println(text);
		Point location = link.getLocation();
		System.out.println(location);
		Dimension size = link.getSize();
		System.out.println(size);
 
		// Click on Registration link
//	 WebElement element = driver.findElementByLinkText(using)
//	 	Boolean status = element.isEnabled();
//	 	Thread.sleep(5000);
//	if (status) {
//		element.click();
//		String text = element.getText();
//		System.out.println(text);
//		driver.close();
//	}
//		
//		WebElement element = driver.findElement(By.name("EMail"));
//		Thread.sleep(5000);
//		element.sendKeys("datta");
//		Thread.sleep(5000);
//		element.clear();
		//element.clear();
		
 
//		// Go back to Home Page
//		Thread.sleep(5000);
//		driver.navigate().back();
// 
//		// Go forward to Registration page
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		 
//		// Go back to Home page
//		Thread.sleep(5000);
//		driver.navigate().to(appUrl);
//		
// 
//		// Refresh browser
//		Thread.sleep(5000);
//		driver.navigate().refresh();
// 
//		// Close browser
//		driver.close();
	}}