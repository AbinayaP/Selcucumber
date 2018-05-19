package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLeadpage extends ProjectMethods{
	
	public EditLeadpage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement cname;
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement updatebutton;
	
	
	

	@And("Type cname on edit lead page as (.*)")
	public EditLeadpage typecnameeleadpage(String data) {
		type(cname, data);
		return this;	
	}
	@And("click update button")
	public ViewLeadPage clickupdatebutton() {
		click(updatebutton);
		return new ViewLeadPage();	
	}
	
	
	
	
	
		
	
	
	
	

}
