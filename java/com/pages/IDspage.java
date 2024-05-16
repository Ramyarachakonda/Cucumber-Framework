package com.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;

public class IDspage {
	
	
	private WebDriver driver;
	  private WebDriverWaits wait;
	    private ScrollUtils scroll;
	    private WebDriverWaits waitUtil;
	    
	private By gobackfiles=By.xpath("//a[contains(text(),'Files')]");    
	private By gobacksubscriber=By.xpath("/html/body/app-root/div/app-user/div/div[2]/div[3]/app-files/div[1]/ul/li[5]/a");    

	private By IDs = By.xpath("//p[contains(text(),'IDs')]");
	private By IDsnewfolder = By.xpath("/html/body/app-root/div/app-user/div/div[2]/div[3]/app-files/div[2]/div[1]/app-folder/div/div/div/div[2]/div/div[8]/a");

	private By passport = By.xpath("//p[contains(text(),'Passport')]");
	private By drivinglicense = By.xpath("//p[contains(text(),'Drivers license')]");
	private By securitycard = By.xpath("//p[contains(text(),'Social security card')]");
	private By Birthcertificate = By.xpath("//p[contains(text(),'Birth certificate')]");
	private By MilitaryID = By.xpath("//p[contains(text(),'Military ID')]");
	private By TravelersID = By.xpath("//p[contains(text(),'Travelers ID')]");
	private By PetwalletID = By.xpath("//p[contains(text(),'Pet wallet ID')]");

	
	
	private By add=By.xpath("//span[contains(text(),'Add')]");
	private By Scandoc=By.xpath("//span[contains(text(),'scan document')]");
	private By dropdown=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/upload-document[1]/div[1]/div[1]/div[1]/div[1]/select[1]");
    private By dropfrompassport=By.xpath("//option[contains(text(),'Passport')]");
    private By dropfromdrivinglicense=By.xpath("//option[contains(text(),'Drivers license')]");
    private By dropfromsocialsecuritycard=By.xpath("//option[contains(text(),'Social security card')]");
    private By dropfrombirthcertificate=By.xpath("//option[contains(text(),'Birth certificate')]");
    private By dropfromMilitaryID=By.xpath("//option[contains(text(),'Military ID')]");
    private By dropfromTravellersID=By.xpath("//option[contains(text(),'Travelers ID')]");
    private By dropfromPetwallet=By.xpath("//option[contains(text(),'Pet wallet ID')]");
    private By dropfromnewfolder=By.xpath("/html/body/ngb-modal-window/div/div/upload-document/div/div/div/div[1]/select/option[8]");
    
    
    private By clickonupload=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/upload-document[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    private By done=By.xpath("//button[contains(text(),'Done')]");
    private By send=By.xpath("//button[contains(text(),'Save')]");
    
    
    
    
	public IDspage(WebDriver driver) {
		this.driver = driver;
		  this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
		 this.wait = new WebDriverWaits(driver, Duration.ofSeconds(20));
	        this.scroll = new ScrollUtils(driver);
	}

	public String getIDPageTitle() {
		return driver.getCurrentUrl();
	}
	
	
	public void gobacksubscriber() throws InterruptedException {
		Thread.sleep(3000);
		waitUtil.waitForElementToBeClickable(gobacksubscriber).click();
	}
	
	public void IDs() throws InterruptedException {
		Thread.sleep(5000);
		waitUtil.waitForElementToBeClickable(gobackfiles).click();
		Thread.sleep(2000);
		waitUtil.waitForElementToBeClickable(IDs).click();
	}
	
	public void IDsnewfolder() {
		waitUtil.waitForElementToBeClickable(IDsnewfolder).click();
	}
	public void passport() {
		waitUtil.waitForElementToBeClickable(passport).click();
		
	}
	
	public void drivinglicense() {
		waitUtil.waitForElementToBeClickable(drivinglicense).click();
	}
	
	public void securitycard() {
		waitUtil.waitForElementToBeClickable(securitycard).click();
	}
	
	public void Birthcertificate() {
		waitUtil.waitForElementToBeClickable(Birthcertificate).click();
	}
	
	public void MilitaryID() {
		waitUtil.waitForElementToBeClickable(MilitaryID).click();
	}
	
	public void TravelersID() {
		waitUtil.waitForElementToBeClickable(TravelersID).click();
	}
	
	
	public void PetwalletID() {
		waitUtil.waitForElementToBeClickable(PetwalletID).click();
	}
	
	public void Scandoc() {
		waitUtil.waitForElementToBeClickable(add).click();
		waitUtil.waitForElementToBeClickable(Scandoc).click();
	}
	
	public void dropdown() {
		waitUtil.waitForElementToBeClickable(dropdown).click();
	}
	
	public void dropfrompassport() {
		waitUtil.waitForElementToBeClickable(dropfrompassport).click();
	}
	
	public void dropfrombirthcertificate() {
		waitUtil.waitForElementToBeClickable(dropfrombirthcertificate).click();
	}
	
	public void dropfromdrivinglicense() {
		waitUtil.waitForElementToBeClickable(dropfromdrivinglicense).click();
	}
	
	public void dropfromsocialsecuritycard() {
		waitUtil.waitForElementToBeClickable(dropfromsocialsecuritycard).click();
	}
	
	public void dropfromMilitaryID() {
		waitUtil.waitForElementToBeClickable(dropfromMilitaryID).click();
	}
	
	public void dropfromTravellersID() {
		waitUtil.waitForElementToBeClickable(dropfromTravellersID).click();
	}
	
	public void dropfromPetwallet() {
		waitUtil.waitForElementToBeClickable(dropfromPetwallet).click();
	}
	
	public void dropfromnewfolder() {
		waitUtil.waitForElementToBeClickable(dropfromnewfolder).click();
	}
	

	public void uploadfile(String filePath) throws InterruptedException {
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fileInput = driver.findElement(clickonupload);
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	
			fileInput.sendKeys(filePath);
	        Thread.sleep(3000);
	}
	
			 
			 
			
		
  
	public void done() throws InterruptedException
	{
		waitUtil.waitForElementToBeClickable(done).click();
    Thread.sleep(11000);

   WebElement send1= waitUtil.waitForElementToBeClickable(send);
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", send1);
   send1.click();
 
	}

	
	
	
	
	

}
