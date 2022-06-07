package org.demo;

import java.util.List;
import java.util.Map;

import org.base.HelperCLass;
import org.pojo.CreateAccount;
import org.pojo.FbLoginPojoClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends HelperCLass {

	@Given("^To open chrome$")
	public void to_open_chrome() throws Throwable {
		launchChromeBrowser();
		max();
	}

	@When("^to pass valid username and valid password$")
	public void to_pass_valid_username_and_valid_password(DataTable d) throws Throwable {
		url("https://www.facebook.com/");
		Map<String, String> alldata = d.asMap(String.class, String.class);
		String user = alldata.get("mail");
		String pass = alldata.get("password");
		FbLoginPojoClass f = new FbLoginPojoClass();
		fillText(f.getTxtuser(), user);
		fillText(f.getTxtpass(), pass);
	}

	@Then("^to click the button$")
	public void to_click_the_button() throws Throwable {
		FbLoginPojoClass f = new FbLoginPojoClass();
		btnClick(f.getLogin());
	}

	@When("^to pass valid username and invalid password$")
	public void to_pass_valid_username_and_invalid_password(DataTable d) throws Throwable {
		url("https://www.facebook.com/");
		List<Map<String, String>> alldata = d.asMaps(String.class, String.class);
		String user = alldata.get(0).get("email");
		String pass = alldata.get(1).get("password");
		FbLoginPojoClass f = new FbLoginPojoClass();
		fillText(f.getTxtuser(), user);
		fillText(f.getTxtpass(), pass);
	}

}
