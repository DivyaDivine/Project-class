package org.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//To launch URL
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	WebElement User = driver.findElement(By.id("email"));
	User.sendKeys("Divine");
	WebElement Password = driver.findElement(By.id("pass"));
	Password.sendKeys("Angels1111");
	
}
}
