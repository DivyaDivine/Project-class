package org.pom;

import org.adac.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
	



	public LoginPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtusername;
	
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement bttnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBttnlogin() {
		return bttnlogin;
	}
	
	
	

}
