package Day1;

import java.awt.Dimension;
import java.awt.List;
import java.io.*;
import java.util.Collection;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TwoRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lunch browser
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\DattaKolekar\\Desktop\\eclipeseAndJava\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		

//		List radio = driver.findElements(By.id("sex"));
		// get all the radio buttons by similar id or xpath and store in List    
		java.util.List<WebElement> radioBx = driver.findElements(By.id("sex"));
		// This will tell you the number of radio button are present
		int iSize = radioBx.size();
		//iterate each link and click on it
		for (int i = 0; i < iSize ; i++){
		// Store the Check Box name to the string variable, using 'Value' attribute
		boolean sValue = radioBx.get(i).isSelected();
		System.out.println("safe");
		// Select the Check Box it the value of the Check Box is same what you are looking for
		    if (sValue= true){
		     radioBx.get(i).click();
		     // This will take the execution out of for loop
		        break;
		        
		    }
		    System.out.println("reached");
		   }
	}
}