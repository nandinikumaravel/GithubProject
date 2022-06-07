package org.pojo;

import org.base.HelperCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends HelperCLass {
	
	public CreateAccount() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		
		@FindBy(id="u_0_2_Oa"),
		@FindBy(xpath="(//a[@role='button'])[2]")
		
	})
	private WebElement newAccount;
	
	@FindAll({
		@FindBy(name="firstname"),
		@FindBy(xpath="(//input[@type='text'])[2]")	
		})
	private WebElement firstName;

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	
	private WebElement signup;

	public WebElement getSignup() {
		return signup;
	}
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	
	

}
