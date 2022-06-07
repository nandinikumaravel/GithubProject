package org.pojo;

import org.base.HelperCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojoClass extends HelperCLass{

	public FbLoginPojoClass() {
		
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtuser;

	public WebElement getTxtuser() {
		return txtuser;
	}
	
	@FindBys({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtpass;
	
	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindAll({
		
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="(//input[@type='hidden'])[2]")
	
	})
	private WebElement login;
	
}
