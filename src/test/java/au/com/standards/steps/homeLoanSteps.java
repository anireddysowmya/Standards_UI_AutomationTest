package au.com.standards.steps;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.standards.utils.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.sukgu.Shadow;
import au.com.standards.pages.callBackFormPage;
import au.com.standards.pages.homeLoansPage;
import au.com.standards.pages.homePage;

public class homeLoanSteps extends base {
	 WebDriver driver;


	

@Given("^when user launches the browser and navigates to url ([^\"]*)$")				
public void open_the_Firefox_and_launch_the_application(String url) throws Throwable							
{	
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.navigate().to(url);

	
}		

@When("^user selects Home loans from Personal Home list$")

public void user_selects_Home_loans_from_Personal_Home_list() {
	homePage page= new homePage(driver);
	page.selectPersonal(driver);
    page.selectHomeLoan(driver);
	
	
	
}
@And("^user selects request call back from enquiry list$")
public void user_selects_request_call_back_from_enquiry_list() {
	homeLoansPage page= new homeLoansPage(driver);
	page.callBackRequest();
	
	
}

@When("^user selects home loan topic and proceeds next$")
public void user_selects_home_loan_topic_and_proceeds_next() {
	homeLoansPage loanpage= new homeLoansPage(driver);
	
	loanpage.selectNewHomeLoanTopic(driver);
	
	
	}
@And("^user enters the details ([^\\\"]*),([^\\\"]*),([^\\\"]*) and ([^\\\"]*) in call back form$")
public void user_enters_the_details_in_call_back_form(String firstname,String lastname, String Email, String phonenumber) throws InterruptedException {
	callBackFormPage formPage= new callBackFormPage(driver);
   formPage.windowHandle(driver);
  formPage.existingCustomer();
	formPage.enterFirstName(firstname);
	formPage.enterLastName(lastname);
	formPage.enterPhoneNumber(phonenumber);
	formPage.enterMail(Email);
	formPage.state(driver);

	
	
	
	}
	
	@Then("^user submits the form$")
	public void user_submits_the_form() {
		callBackFormPage formPage= new callBackFormPage(driver);
		formPage.submitBtn();
		
	}
	

@Then("^user closes the application$")
public void user_closes_the_application() {
	driver.quit();
	
}




}

