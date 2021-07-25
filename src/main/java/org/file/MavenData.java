package org.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenData {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 // To launch Url
driver.get("https://www.amazon.in/");
WebElement Text = driver.findElement(By.id("twotabsearchtextbox"));
Text.sendKeys("iphone");
WebElement buttn = driver.findElement(By.id("nav-search-submit-button"));
buttn.click();
WebElement element =(WebElement) driver.findElements(By.id(""));
String s1 = element.getAttribute("value");
System.out.println(s1);
}
}