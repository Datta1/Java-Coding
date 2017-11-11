package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_command {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.maas360.com/");
		
		//driver.wait(5);
		Thread.sleep(5000);
		driver.navigate().back();
		//driver.wait(5);
		Thread.sleep(5000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		

	}

}
