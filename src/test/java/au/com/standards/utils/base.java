package au.com.standards.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	private static Map<Thread,WebDriver> driverMap= new ConcurrentHashMap<>();
	//Driver Initialization	
	public WebDriver browserDriver(String browser) throws IOException {
			
			prop= new Properties();
			FileInputStream fis= new FileInputStream(".\\Resources\\Config.properties");
			prop.load(fis);
		    browser= prop.getProperty("browser");
			if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chromedriver\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.navigate().to(prop.getProperty("url"));
				
			}
			return driver;
	}
	
			
















}
