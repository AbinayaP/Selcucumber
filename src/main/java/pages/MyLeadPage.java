package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatlead;
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindlead;
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;
	
	
	@When("click on createlead")
	public CreateLeadPage clickcreatelead() {
		click(elecreatlead);
		return new CreateLeadPage();		
	}
	@When("click on Findlead")
	public FindLeadPage clickfindlead() {
		click(elefindlead);
		return new FindLeadPage();		
	}
	public MergeLeadPage clickmergelead() {
		click(elemergelead);
		return new MergeLeadPage();		
	}
	
		
	
	
	
	

}
