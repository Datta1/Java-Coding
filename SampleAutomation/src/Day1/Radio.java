package Day1;

import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		List  oRadioButton = driver.findElements(By.name("sex"));
		 
		 // Create a boolean variable which will hold the value (True/False)
		 
		 boolean bValue = false;
		 
		 // This statement will return True, in case of first Radio button is selected
		 
		 bValue = ((WebElement) oRadioButton.get(0)).isSelected();
		 
		 // This will check that if the bValue is True means if the first radio button is selected
		 
		 if(bValue = true){
		 
			// This will select Second radio button, if the first radio button is selected by default
		 
			((WebElement) oRadioButton.get(1)).click();
			System.out.println("worked fine");
		 
		 }else{
		 
			// If the first radio button is not selected by default, the first will be selected
		 
			((WebElement) oRadioButton.get(0)).click();
			System.out.println("worked fine");
			
		 
		 }
	}
}