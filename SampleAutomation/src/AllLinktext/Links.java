package AllLinktext;

import java.awt.List;
import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/personal-loan-emi-calculator");
		driver.manage().window().maximize();
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

	}

}
