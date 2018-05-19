package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	
	/*public static RemoteWebDriver driver;
	@Given("open the browser")
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@And("Max the browser")
	public void maxbrowser() {
		driver.manage().window().maximize();	
	}
	@And("set the timeout")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the URL")
	public void typeurl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter username as (.*)")
	public void typeuname(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter password as (.*)")
	public void typepword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@And("Click login")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click crmsfa")
	public void clickcrmsaf() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click leads link")
	public void clickleads() {
		driver.findElementByLinkText("Leads").click();
	}
	@When("click on createlead")
	public void clickcreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("enter company name as (.*)")
	public void typecname(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("Enter firstname as (.*)")
	public void typefname(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("Enter Lastname as (.*)")
	public void typelname(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@And("click on submit")
	public void clicksubmit() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("verify the lead created")
	public void verfiylead() {
		System.out.println("the lead created");
		
	}
	@Then("verify the lead is not created")
	public void verfiynotcreatelead() {
		System.out.println("the lead is not created");}*/
}
