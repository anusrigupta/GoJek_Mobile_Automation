package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;

public class TestCases extends BaseClass {
	
	@Test
	public void testOneCorrectPayment() {

//******************Enter UrL*****************************************
		driver.get("http://demo.midtrans.com");
		System.out.println("page loaded sucessfully");
		
//******************    Wait for page to load and click BUY   *********************
		
		
		WebElement clickBuy = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("buy")));
		
		clickBuy.click(); 
		System.out.println("clicked Buy");
		
//******************    Wait for page to load and click CART-CHECKOUT   ***********************
		
		WebElement cartcheckout = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("cart-checkout")));
		
		cartcheckout.click();
		
		System.out.println("clicked cart checkout");
		
//******************    Wait for page to load and click CONTINUE     ****************
		
		
		
		driver.switchTo().frame(0);
		
		WebElement clickcont = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("button-main-content")));
		
		clickcont.click();
		
		System.out.println("clicked continue");

		
//*********************       Wait for page to load and SELECT PAYMENT Type     ************************
		
		WebElement selectpayment = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("list")));
		
		selectpayment.click();
		
		System.out.println("selected payment type");
	
		
//***********************     Wait for page to load and ENTER CARD NUMBER     **************************************
	
		WebElement clickcardnumber = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.name("cardnumber")));
		clickcardnumber.click();
		clickcardnumber.sendKeys("4811111111111114");
		System.out.println("Entered card number");
		
		
		WebElement expirydate = driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input"));
		expirydate.click();		
		expirydate.sendKeys("02/20");
		System.out.println("Entered expiry");
		
		
		WebElement cvv = driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input"));
		cvv.click();
		cvv.sendKeys("123");
		System.out.println("Entered cvv");
	
	
//***********************     Wait for page to load and Click PAY-NOW     **************************************		
		
		
		WebElement clickpaynow = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("button-main-content")));
		clickpaynow.click();
		System.out.println("clicked paynow");
		driver.switchTo().frame(0);
		
		
//***********************     Wait for page to load and enter OTP and click OK    **************************************
		
		WebElement enterotp = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.name("PaRes")));
		enterotp.click();
		enterotp.sendKeys("112233");
		System.out.println("Entered otp");
		
		
		WebElement clickok = driver.findElement(By.className("btn-success"));
		clickok.click();
		System.out.println("transaction successfull");
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testTwoWrongPayment() {

//******************Enter UrL*****************************************
		driver.get("http://demo.midtrans.com");
		System.out.println("page loaded sucessfully");
		
//******************    Wait for page to load and click BUY   *********************
		
		
		WebElement clickBuy = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("buy")));
		
		clickBuy.click(); 
		System.out.println("clicked Buy");
		
//******************    Wait for page to load and click CART-CHECKOUT   ***********************
		
		WebElement cartcheckout = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("cart-checkout")));
		
		cartcheckout.click();
		
		System.out.println("clicked cart checkout");
		
//******************    Wait for page to load and click CONTINUE     ****************
		
		
		
		driver.switchTo().frame(0);
		
		WebElement clickcont = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("button-main-content")));
		
		clickcont.click();
		
		System.out.println("clicked continue");

		
//*********************       Wait for page to load and SELECT PAYMENT Type     ************************
		
		WebElement selectpayment = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("list")));
		
		selectpayment.click();
		
		System.out.println("selected payment type");
	
		
//***********************     Wait for page to load and ENTER CARD NUMBER     **************************************
	
		WebElement clickcardnumber = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.name("cardnumber")));
		clickcardnumber.click();
		clickcardnumber.sendKeys("4811111111111113");
		System.out.println("Entered card number");
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement expirydate = driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input"));
		expirydate.click();		
		expirydate.sendKeys("02/20");
		System.out.println("Entered expiry");
		
		
		WebElement cvv = driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[4]/input"));
		cvv.click();
		cvv.sendKeys("123");
		System.out.println("Entered cvv");
	
	
//***********************     Wait for page to load and Click PAY-NOW     **************************************		
		
		
		WebElement clickpaynow = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.className("button-main-content")));
		clickpaynow.click();
		System.out.println("clicked paynow");
		driver.switchTo().frame(0);
		System.out.println("Wrong card details, could not place order");
		
		

	}
	

}
