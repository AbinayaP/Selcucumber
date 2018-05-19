package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecname;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement elesubmit;
	
	

	@And("enter company name as (.*)")
	public CreateLeadPage typecname(String data) {
		type(elecname, data);
		return this;	
	}
	@And("Enter firstname as (.*)")
	public CreateLeadPage typefname(String data) {
		type(elefname, data);
		return this;	
	}
	@And("Enter Lastname as (.*)")
	public CreateLeadPage typelname(String data) {
		type(elelname, data);
		return this;	
	}
	@And("click on submit")
	public ViewLeadPage clicksubmit() {
		click(elesubmit);
		return new ViewLeadPage();	
	}
	@Then("verify the lead created")
	public void verifylead() {
		System.out.println("the lead is created");
	}
	@But("verify the lead is not created")
	public void verfynotcreated() {
		System.out.println("the lead is not created");
	}
	
	
	
		
	
	
	
	

}
