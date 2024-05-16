package com.pages;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class myfamilypage {
	  private WebDriver driver;
	  private WebDriverWait wait;

	private By Myfamily= By.xpath("//span[contains(text(),'My Family')]");
    private By addmember=By.xpath("//button[contains(text(),'Add member')]");
    private By name=By.xpath("//input[@id='name']");
    private By email=By.xpath("//input[@id='inviteEmail']");
    private By checkbox=By.xpath("//label[contains(text(),'Add this person as an Emergency Contact')]");
    private By sendinvite =By.xpath("//button[contains(text(),'Send invite')]");
    
    public myfamilypage(WebDriver driver) {
        this.driver = driver;
   	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

   

    public void clickOnMyFamily() throws InterruptedException {
    	Thread.sleep(2000);
		WebElement myfamily=wait.until(ExpectedConditions.elementToBeClickable(Myfamily));
		myfamily.click();
		
      

}
    public void clickOnaddmember() {
		WebElement Addmember=wait.until(ExpectedConditions.elementToBeClickable(addmember));
		Addmember.click();
		
    

 }
    public void name() {
		WebElement Name=wait.until(ExpectedConditions.elementToBeClickable(name));
		Name.sendKeys("test");

		
        
 }
    public void email() {
		WebElement Email=wait.until(ExpectedConditions.elementToBeClickable(email));
		Email.sendKeys("test09@yopmail.com");
		
       

 }
    
    
    
    public void checkbox() {
		WebElement Checkbox=wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		Checkbox.click();
		
   

 }
    public void sendinvite() {
		WebElement Sendinvite=wait.until(ExpectedConditions.elementToBeClickable(sendinvite));
		Sendinvite.click();
		
   

 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
