package au.com.standards.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeLoansPage {
	public WebDriver driver;
	public homeLoansPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
			
		}
	
@FindBy(xpath= "//*[contains(text(),'Request a call back')][1]")
public WebElement requestCallBack;

@FindBy(id="myRadioButton-0")
public WebElement selectNewHomeLoanBtn;

@FindBy(xpath= "//div[@id='contact-form-shadow-root']")
public WebElement customerSupportFrame;

public void callBackRequest() {
	requestCallBack.click();
	
}

public void selectNewHomeLoanTopic(WebDriver driver) {

	WebElement ele = (WebElement) ((JavascriptExecutor)driver)
		.executeScript("return arguments[0].shadowRoot", driver.findElement(By.id("contact-form-shadow-root")));
	WebElement ele1= ele.findElement(By.id("myRadioButton-0"));
	ele1.click();

	WebElement ele2= ele.findElement(By.tagName("button"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView()", ele2); 
	ele2.click();	
	
	
}


public WebElement expandRootElement(WebElement element) {
	WebElement ele = (WebElement) ((JavascriptExecutor)driver)
.executeScript("return arguments[0].shadowRoot", element);
	return ele;
}









}
