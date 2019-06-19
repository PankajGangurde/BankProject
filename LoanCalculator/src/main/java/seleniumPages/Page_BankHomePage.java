package seleniumPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BankUtils;
import common.Page_BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Page_BankHomePage  extends Page_BasePage {
	
	
	/*@Before
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		System.out.println("Opening a browser");
	}
	
	@After
	public void tearDown(){
		System.out.println("Closing a browser");
		driver.quit();		
	}*/	
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	}
	
	WebElement element;
	
	// xpath string variables
	String applicationType = "//input[@id='application_type_single']";
	String borrowType = "//label[contains(text(),'Property you would like to buy')]/..//input[@id='borrow_type_home']";
	String TEXT_incomeBeforeTax = "//label[contains(text(), 'Your income (before tax')]/..//input";
	String TEXT_incomeOther = "//label[contains(text(), 'Your other income')]/..//input";	
	String TEXT_livingExpenses = "//label[contains(text(), 'Living expenses')]/..//input";	
	String TEXT_currentHomeLoanRepayments = "//label[contains(text(), 'Current home loan repayments')]/..//input";	
	String TEXT_otherLoanRepayments = "//label[contains(text(), 'Other loan repayments')]/..//input";	
	String TEXT_otherCommitments = "//label[contains(text(), 'Other commitments')]/..//input";	
	String TEXT_totalCreditCardLimits = "//label[contains(text(), 'Total credit card limits')]/..//input";
	
	String BUTTON_borrowCalculation = "//button[contains(text(),'Work out how much I could borrow')]";
	String TEXT_estimatedAmount = "//span[@class='borrow__result__text__amount']";
	String BUTTON_startOver = "//button[contains(text(),'Start over')]";
	String TEXT_errorMessage = "//span[@class='borrow__error__text']";
	
	// This function opens the bank URL
	public void openBankURL() {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().window().maximize();
	}
		
	// This function enter the person details
	public void enterPersonDetails() {

		element = driver.findElement(By.xpath(applicationType));
		BankUtils.clickElement(element);
		
		Select dependants = new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
		dependants.selectByVisibleText("0");
		
		element = driver.findElement(By.xpath(borrowType));
		BankUtils.clickElement(element);
		
		driver.findElement(By.xpath(TEXT_incomeBeforeTax)).sendKeys("80000");
		driver.findElement(By.xpath(TEXT_incomeOther)).sendKeys("10000");
		driver.findElement(By.xpath(TEXT_livingExpenses)).sendKeys("500");
		driver.findElement(By.xpath(TEXT_currentHomeLoanRepayments)).sendKeys("0");
		driver.findElement(By.xpath(TEXT_otherLoanRepayments)).sendKeys("100");
		driver.findElement(By.xpath(TEXT_otherCommitments)).sendKeys("0");
		driver.findElement(By.xpath(TEXT_totalCreditCardLimits)).sendKeys("10000");
	}
	
	// This function enter the person details and click on calculate button
	public void enterPersonDetailsAndSubmit() {
		enterPersonDetails();
		driver.findElement(By.xpath((BUTTON_borrowCalculation))).click();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TEXT_estimatedAmount)));
	}
	
	// This function verifies the borrowing estimates
	public void verifyBorrowingEstimates() {
		String estimatedActualAmount = driver.findElement(By.xpath((TEXT_estimatedAmount))).getText();
		System.out.println("Estimated amount: "+estimatedActualAmount);		
	}
	
	// This function check the functionality of Start over button
	public void verifyStartOverButtonClearsTheForm() {
		element = driver.findElement(By.xpath(BUTTON_startOver));
		BankUtils.clickElement(element);
		
	}
	
	// This function enters only living expense field and click on calculate button
	public void enterPersonDetailsWithLivingExpenseValue() {
		driver.findElement(By.xpath(TEXT_livingExpenses)).sendKeys("1");
		driver.findElement(By.xpath((BUTTON_borrowCalculation))).click();		
	}
	
	// This function verifies the error message
	public void verifyErrorMessage() {
		String errorMessage = driver.findElement(By.xpath((TEXT_errorMessage))).getText();
		System.out.println("Error message: "+errorMessage);			
	}
	
	public void closeBrowser() {
		driver.quit();			
	}
}
