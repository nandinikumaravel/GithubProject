package org.pojo;

import org.apache.hc.core5.annotation.Experimental;
import org.base.HelperCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends HelperCLass{
	
	public GreensPojo() {
	  PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath="//p[@style='float:left;padding-top:20px;padding-left:20px;']")
	
	private WebElement copy;



	public WebElement getCopy() {
		return copy;
	}
	
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	
	private WebElement traning;



	public WebElement getTraning() {
		return traning;
	}
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement cert;
	
	@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")
	private WebElement selenium;
	
	@FindBy(xpath="//p[@style='line-height:20px;']")
	private WebElement test;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement java;
	
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement core;
	
	@FindBy(xpath="//p[contains(text(),'incredibly ')]")
	private WebElement anitha;
	
	@FindBy(xpath="//a[text()='Careers']")
    private WebElement career;
	
	@FindBy(xpath="//a[text()='www.greenstechnologys.com.']")
	private WebElement email;
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement contact;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonial;
	
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement phone;
	
	@FindBy(xpath="//div[contains(text(),'functional ')]")
    private WebElement review;
	
	@FindBy(xpath="//h3[@class='title divider-3']")
	private WebElement branch;
	
	

	public WebElement getCareer() {
		return career;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getTestimonial() {
		return testimonial;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getReview() {
		return review;
	}

	public WebElement getBranch() {
		return branch;
	}

	public WebElement getCert() {
		return cert;
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getTest() {
		return test;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getCore() {
		return core;
	}

	public WebElement getAnitha() {
		return anitha;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
