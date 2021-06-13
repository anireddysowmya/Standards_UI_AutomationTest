package au.com.standards.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class callBackFormPage {

public callBackFormPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}


@FindBy(xpath="//div[@id='field-page-Page1-isExisting']//label[2]")

public WebElement existingCustomer;

@FindBy(id= "field-page-Page1-aboutYou-firstName")
public WebElement firstName;

@FindBy(id= "field-page-Page1-aboutYou-lastName")
public WebElement lastName;

@FindBy(id="field-page-Page1-aboutYou-phoneNumber")
public WebElement phoneNumber;

@FindBy(id="field-page-Page1-aboutYou-email")
public WebElement email;


@FindBy(xpath= "//div[@class='css-1pcexqc-container']")
public WebElement state;

@FindBy(xpath="//div[@class='body']//div[2]")
public WebElement stateDropDown;

@FindBy(id="page-Page1-btnGroup-submitBtn")
public WebElement submit;

public void existingCustomer() {
	
	existingCustomer.click();
	}

public void enterFirstName(String firstname) {
	firstName.sendKeys(firstname);
	
}

public void enterLastName(String lastname) {
	lastName.sendKeys(lastname);
	
}

public void enterPhoneNumber(String phonenumber) {
	phoneNumber.sendKeys(phonenumber);
	
}

public void enterMail(String Email) {
	email.sendKeys(Email);
	
}

public void state(WebDriver driver) throws InterruptedException {
	WebDriverWait wait= new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(state));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", state);
	jse.executeScript("arguments[0].click()", stateDropDown);
	stateDropDown.click();
	Thread.sleep(4000);
Actions keyDown = new Actions(driver); 
	keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	
}


public void submitBtn() {
	
	submit.click();
}


public void windowHandle(WebDriver driver) {
	
	String parent=driver.getWindowHandle();

	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();

	while(I1.hasNext())
	{

	String child_window=I1.next();


	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);

	System.out.println(driver.switchTo().window(child_window).getTitle());
}


}
}
}