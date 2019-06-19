package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BankUtils extends Page_BasePage{
	
	public static void clickElement(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
}
