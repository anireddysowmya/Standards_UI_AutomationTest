package au.com.standards.runners;


import au.com.standards.utils.base;	

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(
		features= {"src/test/java/au/com/standards/features/homeLoan.feature"},
glue= "au/com/standards/steps",
		monochrome= true

)

public class runnerBDD {

	
		
	}





