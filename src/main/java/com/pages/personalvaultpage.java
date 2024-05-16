package com.pages;



import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.qa.Utils.WebDriverWaits;



public class personalvaultpage {
	private WebDriver driver;
	  private WebDriverWaits waitUtil;


	private By clickonPersonalvault = By.xpath("//span[text()='Personal Vault']");
	private By otpElement  = By.xpath("//tbody/tr[1]/td[3]");
//	private By otpElement1=By.xpath("/html/body/main/section[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/strong");
	private By otpfield = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
	private By addfolder=By.xpath("//span[text()='Add Folder']");
	private By foldernames=By.xpath("//input[@id='folder']");
	private By  add = By.xpath("//button[text()='Add']");
	private By close=By.xpath("//button[@class='btn-close mt-2 me-2']");
	private By edit = By.xpath("/html/body/app-root/div/app-user/div/div[2]/div[3]/app-files/div[2]/div[1]/app-folder-list/div[2]/div[9]/div/button[2]/img");
	private By rename=By.xpath("//a[text()=' Rename']");
	private By folder =By.xpath("//input[@name='filename']");
	private By  save=By.xpath("//button[text()='Save']");
	private By delete=By.xpath("//a[text()=' Delete']");
	private By confirm=By.xpath("//button[text()='Confirm']");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	
		public personalvaultpage(WebDriver driver) {
			this.driver = driver;
			this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
		}

		public String getPersonalvaultTitle() {
			return driver.getTitle();
			
		}
		
		
		
		public void clickonPersonalvault() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(3000);
			waitUtil.waitForVisibilityOfElement(clickonPersonalvault).click();
		}
		
		
		
		    public void smstome() throws InterruptedException {
			((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
		
		    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    Thread.sleep(9000);
		    driver.get("https://smstome.com/usa/phone/14752919096/sms/6803");
		   
		  
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    String otpText=driver.findElement(otpElement).getText();

		     int startIndex = otpText.indexOf("is ") + "is ".length();
		     int endIndex = otpText.indexOf(". It will be valid");
		     String otpValue = otpText.substring(startIndex, endIndex);

             driver.close();
		    driver.switchTo().window(tabs.get(0));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		    waitUtil.waitForVisibilityOfElement(otpfield).sendKeys(otpValue);
         
        
		    
//		    Thread.sleep(8000);
//		    
//	    String otpText=driver.findElement(otpElement1).getText();
//		    
//             driver.close();
//		    driver.switchTo().window(tabs.get(0));
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  
//		    waitUtil.waitForVisibilityOfElement(otpfield).sendKeys(otpText);
         
		
              }
	 
		    
		public void addfolder() throws InterruptedException {
			Thread.sleep(3000);
			waitUtil.waitForVisibilityOfElement(addfolder).click();
		}
		
		
		
		public void foldernames(String foldername) {
			waitUtil.waitForVisibilityOfElement(foldernames).sendKeys(foldername);
			
		}
		
		
		public void add() {
			waitUtil.waitForVisibilityOfElement(add).click();
		}
		
		
		public void close() {
			waitUtil.waitForVisibilityOfElement(close).click();
		}

	
		public void edit() throws InterruptedException {
			Thread.sleep(3000);
			waitUtil.waitForVisibilityOfElement(edit).click();
		}

		
		public void rename() {
			waitUtil.waitForVisibilityOfElement(rename).click();
		}

		public void folder(String editoption) {
			waitUtil.waitForVisibilityOfElement(folder).sendKeys(editoption);
		}

		public void save() {
			waitUtil.waitForVisibilityOfElement(save).click();
		}

		public void delete() {
			waitUtil.waitForVisibilityOfElement(delete).click();
		}
		
		public void confirm() {
			waitUtil.waitForVisibilityOfElement(confirm).click();
		}
		
		
		
		public void back()
    	{
			waitUtil.waitForVisibilityOfElement(Personalvaultback).click();
    		
    	}
		
		
			
		

}




