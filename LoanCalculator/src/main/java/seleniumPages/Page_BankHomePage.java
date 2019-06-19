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

public class Page_BankHomePage  extends Page_BasePage {
	
	/*WebDriver driver;
	public Page_BankHomePage(WebDriver driver) {
        this.driver = driver;
    }*/
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	}
	
	WebElement element;
	
//	By applicationType = By.id("application_type_single");
//	By applicationType = By.xpath("//input[@id='application_type_single']");
//	By numberOfDependants = By.xpath("//select[@title='Number of dependants']");
//	By borrowType = By.xpath("//label[contains(text(),'Property you would like to buy')]/..//input[@id='borrow_type_home']");
//	By incomeBeforeTax = By.xpath("//label[contains(text(), 'Your income (before tax')]/..//input");
//	By incomeOther = By.xpath("//label[contains(text(), 'Your other income')]/..//input");	
//	By livingExpenses = By.xpath("//label[contains(text(), 'Living expenses')]/..//input");	
//	By currentHomeLoanRepayments = By.xpath("//label[contains(text(), 'Current home loan repayments')]/..//input");	
//	By otherLoanRepayments = By.xpath("//label[contains(text(), 'Other loan repayments')]/..//input");	
//	By otherCommitments = By.xpath("//label[contains(text(), 'Other commitments')]/..//input");	
//	By totalCreditCardLimits = By.xpath("//label[contains(text(), 'Total credit card limits')]/..//input");
//	
//	By borrowCalculationButton = By.xpath("//button[contains(text(),'Work out how much I could borrow')]");
	
	
////	String applicationType = "application_type_single";
	String applicationType = "//input[@id='application_type_single']";
//	String numberOfDependants = "//select[@title='Number of dependants']";
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
	
	public void openBankURL() {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
//		this.driver.manage().window().maximize();
	}
		
	public void enterPersonDetails() {

		element = driver.findElement(By.xpath(applicationType));
		BankUtils.clickElement(element);
		
		Select dependants = new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
		dependants.selectByVisibleText("0");
		
		element = driver.findElement(By.xpath(borrowType));
		BankUtils.clickElement(element);
	
//		driver.findElement(incomeBeforeTax).sendKeys("80000");
//		driver.findElement(incomeOther).sendKeys("10000");
//		driver.findElement(livingExpenses).sendKeys("500");
//		driver.findElement(currentHomeLoanRepayments).sendKeys("0");
//		driver.findElement(otherLoanRepayments).sendKeys("100");
//		driver.findElement(otherCommitments).sendKeys("0");
//		driver.findElement(totalCreditCardLimits).sendKeys("10000");
		
		
//		driver.findElement(By.xpath(applicationType)).click();
////		driver.findElement(By.xpath("//input[@id='application_type_single']")).click();
//		Select dependants = new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
//		dependants.selectByVisibleText("2");
//		driver.findElement(By.xpath(borrowType)).click();
		driver.findElement(By.xpath(TEXT_incomeBeforeTax)).sendKeys("80000");
		driver.findElement(By.xpath(TEXT_incomeOther)).sendKeys("10000");
		driver.findElement(By.xpath(TEXT_livingExpenses)).sendKeys("500");
		driver.findElement(By.xpath(TEXT_currentHomeLoanRepayments)).sendKeys("0");
		driver.findElement(By.xpath(TEXT_otherLoanRepayments)).sendKeys("100");
		driver.findElement(By.xpath(TEXT_otherCommitments)).sendKeys("0");
		driver.findElement(By.xpath(TEXT_totalCreditCardLimits)).sendKeys("10000");
	}
	
	public void enterPersonDetailsAndSubmit() {
		enterPersonDetails();
		driver.findElement(By.xpath((BUTTON_borrowCalculation))).click();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TEXT_estimatedAmount)));
	}
	
	public void verifyBorrowingEstimates() {
		String estimatedActualAmount = driver.findElement(By.xpath((TEXT_estimatedAmount))).getText();
		System.out.println("Estimated amount: "+estimatedActualAmount);		
	}
	
	public void verifyStartOverButtonClearsTheForm() {
		driver.findElement(By.xpath((BUTTON_startOver))).click();
		
	}
	
	public void enterPersonDetailsWithLivingExpenseValue() {
		driver.findElement(By.xpath(TEXT_livingExpenses)).sendKeys("1");
		driver.findElement(By.xpath((BUTTON_borrowCalculation))).click();		
	}
	
	public void verifyErrorMessage() {
		String errorMessage = driver.findElement(By.xpath((TEXT_errorMessage))).getText();
		System.out.println("Error message: "+errorMessage);			
	}
}
