package au.com.standards.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
public WebDriver driver;
public homePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(linkText= "Personal")
	public WebElement personal;
	
	@FindBy(xpath= "//header/div[@id='menu-logo-container']/nav[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")
	public WebElement homeloan;
	
	@FindBy(xpath= "//header/div[@id='menu-logo-container']/nav[1]/ul[1]/li[1]/ul[1]/li[5]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement clickHomeLoan;

public void selectPersonal(WebDriver driver) {
	WebDriverWait wait= new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(personal));
	personal.click();
	}

public void selectHomeLoan(WebDriver driver) {
	WebDriverWait wait= new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(homeloan));
	homeloan.click();
	clickHomeLoan.click();
	
	
}









}
