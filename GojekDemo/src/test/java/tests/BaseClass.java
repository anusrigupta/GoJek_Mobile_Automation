package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	WebDriver driver;
	
	@BeforeTest
	public void setup()  {
	
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6 Edge");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		caps.setCapability(MobileCapabilityType.UDID, "041604aa0c3f1902");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("noReset", true);
	
		
		caps.setCapability("webdriver.chrome.driver", "C:\\Users\\Anu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		
		
		
		
		} catch (Exception e) 
		    {
		      System.out.println("Exception is : " +e.getMessage());
			  System.out.println("Cause of exception is : "+e.getCause());
			  e.printStackTrace();
			}
		
		}
		
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
