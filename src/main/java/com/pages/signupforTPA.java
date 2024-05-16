package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signupforTPA {
	
	  private WebDriver driver;
	  private WebDriverWait wait;
		private By random = By.xpath("//h3[contains(text(),'Random Email generator')]");
		private By frame1=By.xpath("//*[@id=\"ad_iframe\"]");
		private By close=By.xpath("//div[@id='dismiss-button']");
		private By checkbox = By.xpath("//span[text()='Check Inbox']");
		
		private By landPageLogin = By.xpath("//a[text()='Log In']");
	
	private By signup=By.xpath("//strong[contains(text(),'Sign up')]");
	private By firstname=By.xpath("//input[@placeholder='Enter your first name']");
	private By lastname=By.xpath("//input[@placeholder='Enter your last name']");
	private By email=By.xpath("//input[@id='email']");
	private By flag=By.xpath("//body/app-root[1]/div[1]/app-professional[1]/app-professional-signup[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/container-element[1]/app-name[1]/div[1]/div[4]/div[1]/div[1]/app-phone-input[1]/form[1]/ngx-intl-tel-input[1]/div[1]/div[1]/div[1]");
	private By searchcountry=By.xpath("//div//input[@placeholder='Search Country']");
	private By US=By.xpath("//div/following-sibling::span[text()='United States']");
	
	private By phone=By.xpath("//input[@id='phone']");
	
	private By company=By.xpath("//input[@id='company']");
	private By advisor=By.xpath("//select[@id='advisory']");
	private By estateplanning=By.xpath("//option[contains(text(),'Estate Planning')]");
	private By checkbox1=By.xpath("//input[@id='flexCheckDefault']");
	private By continue1=By.xpath("//button[contains(text(),'Continue')]");
	private By otpElement  = By.xpath("//tbody/tr[1]/td[3]");
	private By otpfield=By.xpath("//input[@id='otp_0_bu92dldun9jlutcf1df']");
	private By continue2=By.xpath("//button[contains(text(),'Continue')]");
	private By password=By.xpath("//input[@id='password']");
	private By confirmpassword=By.xpath("//input[@id='confirm-password']");
	private By continue3=By.xpath("//button[contains(text(),'Continue')]");
	
	
	
	
	
	 public signupforTPA(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public String getLoginPageTitle() {
			return driver.getCurrentUrl();
		}
		
		

		   public void random1() throws InterruptedException {
			driver.get("https://yopmail.com/en/");
			driver.findElement(random).click();
		     driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 if (driver.findElements(random).size() > 0) {
		            driver.findElement(random).click();
		        } else {
		            System.out.println("The 'random' element is not present.");
		        }

		        // Click on the 'checkbox' element if it exists
		        if (driver.findElements(checkbox).size() > 0) {
		            driver.findElement(checkbox).click();
		        } else {
		            System.out.println("The 'checkbox' element is not present.");
		        }

			
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), '@yopmail.com')]"));
			String textToCopy = "";
			if (!elements.isEmpty()) {
				textToCopy = elements.get(0).getText().trim();
			}
			// Assuming 'driver' is your WebDriver instance

			if (driver instanceof JavascriptExecutor) {
			    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			    
			    String script = "window.open()";
			    jsExecutor.executeScript(script);
			} else {
			    System.out.println("JavaScript execution is not supported in this browser.");
			}

			String newTab = driver.getWindowHandles().toArray()[1].toString();
			driver.close();
			driver.switchTo().window(newTab);
			driver.get("https://familycentral.com/");
			WebElement LandPageLogin=	wait.until(ExpectedConditions.elementToBeClickable(landPageLogin));
			LandPageLogin.click();
			
			WebElement Signup=	wait.until(ExpectedConditions.elementToBeClickable(signup));
			Signup.click();
		 
			WebElement Firstname=	wait.until(ExpectedConditions.elementToBeClickable(firstname));
			Firstname.sendKeys("Ramya");
			WebElement Lastname=	wait.until(ExpectedConditions.elementToBeClickable(lastname));
			Lastname.sendKeys("reddy");
			
			
			WebElement Email=	wait.until(ExpectedConditions.elementToBeClickable(email));
			Email.sendKeys(textToCopy);
		   }
			 public void details() {
			WebElement Flag=	wait.until(ExpectedConditions.elementToBeClickable(flag));
			Flag.click();
			WebElement Searchcountry=	wait.until(ExpectedConditions.elementToBeClickable(searchcountry));
			Searchcountry.sendKeys("United States");
			WebElement us=	wait.until(ExpectedConditions.elementToBeClickable(US));
			us.click();
			WebElement Phone=	wait.until(ExpectedConditions.elementToBeClickable(phone));
			Phone.sendKeys("+13155037380");
			
			WebElement Company=	wait.until(ExpectedConditions.elementToBeClickable(company));
			Company.sendKeys("smbxl");
			WebElement Advisor=	wait.until(ExpectedConditions.elementToBeClickable(advisor));
			Advisor.click();
			WebElement Estateplanning=	wait.until(ExpectedConditions.elementToBeClickable(estateplanning));
			Estateplanning.click();
			WebElement Checkbox1=	wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
			Checkbox1.click();
			
			WebElement Continue1=	wait.until(ExpectedConditions.elementToBeClickable(continue1));
			Continue1.click();
			
		}
		   
		   public void otp() throws Throwable {
		
			
			((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
		    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    Thread.sleep(7000);
		    driver.get("https://smstome.com/usa/phone/13155037380/sms/6443");

		    String otpText=driver.findElement(otpElement).getText();

		    
		     int startIndex = otpText.indexOf("is ") + "is ".length();
		     int endIndex = otpText.indexOf(". It will be valid");
		     String otpValue = otpText.substring(startIndex, endIndex);
		     driver.close();
		     driver.switchTo().window(tabs.get(0));
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    WebElement Otpfield=	wait.until(ExpectedConditions.elementToBeClickable(otpfield));
			    Otpfield.sendKeys(otpValue);
				WebElement Continue2=	wait.until(ExpectedConditions.elementToBeClickable(continue2));
				Continue2.click();
				
			
		}

			
		public void password() {
			   
			   WebElement Newpassword=	wait.until(ExpectedConditions.elementToBeClickable(password));
			   Newpassword.sendKeys("Password@123");
				WebElement Confirmpassword=	wait.until(ExpectedConditions.elementToBeClickable(confirmpassword));
				Confirmpassword.sendKeys("Password@123");
				WebElement Continue3=	wait.until(ExpectedConditions.elementToBeClickable(continue3));
				Continue3.click();
				

		}
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
