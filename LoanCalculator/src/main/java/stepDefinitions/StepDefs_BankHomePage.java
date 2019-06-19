package stepDefinitions;

import common.Page_BasePage;

import seleniumPages.Page_BankHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_BankHomePage{
	
	Page_BankHomePage	bankHomePage= new Page_BankHomePage();
	
	@Given("I launch Chrome browser instance")
	public void I_launch_Chrome_browser_instance() throws Exception {
	    System.out.println("Launch Chrome");
	    bankHomePage.launchBrowser();
	}

	@When("I open Bank Homepage")
	public void I_open_Bank_Homepage() throws Exception {
	    System.out.println("Open Bank home page");
	    bankHomePage.openBankURL();
	}

	@And("I enter the person details")
	public void I_enter_the_person_details() throws Exception {
	    System.out.println("Enter the person details");
	    bankHomePage.enterPersonDetailsAndSubmit();
	}

	@Then("I verify the borrowing estimate")
	public void I_verify_the_borrowing_estimate() throws Exception {
	    System.out.println("Verify the borrowing estimate");
	    bankHomePage.verifyBorrowingEstimates();
	}

	@Then("I verify Start over button clears the form")
	public void I_verify_Start_over_button_clears_the_form() throws Exception {
	    System.out.println("Verify Start over button clears the form");
	    bankHomePage.verifyStartOverButtonClearsTheForm();
	}
	
	@Then("I enter the person details with living expense value")
	public void I_enter_the_person_details_with_living_expense_value() throws Exception {
	    System.out.println("Enter the person details with living expense value");
	    bankHomePage.enterPersonDetailsWithLivingExpenseValue();
	}
	
	@Then("I verify the error message")
	public void I_verify_the_error_message() throws Exception {
	    System.out.println("Verify the error message");
	    bankHomePage.enterPersonDetailsWithLivingExpenseValue();
	}

}
