package com.pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Medical_Records_page {
	
		
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	private By Click_Medical_Records=By.xpath("//p[contains(text(),'Medical Records Information')]");
	private By Search_state=By.xpath("//select[@id='searchTerm']");
       
	
	private By clickonPersonalvault = By.xpath("//span[text()='Personal Vault']");
	private By MyFamily=By.xpath("//span[contains(text(),'My Family')]");
    private By shareoption=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-files[1]/div[2]/div[1]/app-document[1]/div[1]/app-file-list[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]/img[1]");
    private By Familymember=By.xpath("//p[contains(text(),'My Family')]");
    private By Selectallmyfamily=By.xpath("//input[@id='check0']");
    private By click_share=By.xpath("//button[contains(text(),'Share')]");
    private By close=By.xpath("//button[@class='btn-close']");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");

	

	public Medical_Records_page(WebDriver driver) {
		this.driver=driver;
		  this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getGenerallegalTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickMedicalrecords() {
		driver.findElement(Personalvaultback).click();
		 WebElement personalvault = wait.until(ExpectedConditions.elementToBeClickable(Click_Medical_Records));
	        personalvault.click();
	    }
		
	
	public void searchRandomStateAndVerify() throws InterruptedException {
	    // Wait for the dropdown to be clickable
	    WebElement medDropdown = wait.until(ExpectedConditions.elementToBeClickable(Search_state));
	    Select dropDownOptions = new Select(medDropdown);

	    List<WebElement> options = dropDownOptions.getOptions();

	    // Check if there are any options in the dropdown
	    if (!options.isEmpty()) {
	    	
	    	
	        // Generate a random index to select a state
	        Random random = new Random();
	        int randomIndex = random.nextInt(options.size());

	        // Select the state at the random index
	        dropDownOptions.selectByIndex(randomIndex);

	    } 

	}
	

    	public void Share() throws InterruptedException {
    		
   		 WebElement click_myfamily = wait.until(ExpectedConditions.elementToBeClickable(MyFamily));
   		click_myfamily.click();
   	    	
    		
    		
   	 if (click_myfamily.isDisplayed()) {
         System.out.println("Family member is present on the page.");
     } else {
         System.out.println("Family member is not present on the page.");
         
     }
   	 
   	 Thread.sleep(2000);
   	 
   	 
   	 WebElement personalvault = wait.until(ExpectedConditions.elementToBeClickable(clickonPersonalvault));
	 personalvault.click();	
    	}
  	
    	
    	public void sharepdf() throws InterruptedException {
    		
    		WebElement Shareoption = wait.until(ExpectedConditions.elementToBeClickable(shareoption));
    		Shareoption.click();	
    		  Thread.sleep(2000);
    		 WebElement familymember = wait.until(ExpectedConditions.elementToBeClickable(Familymember));
    		 familymember.click();	
    		  Thread.sleep(2000);
    		 WebElement selectallmyfamily = wait.until(ExpectedConditions.elementToBeClickable(Selectallmyfamily));
    		 selectallmyfamily.click();	
    		  Thread.sleep(2000);
    		 WebElement Click_share = wait.until(ExpectedConditions.elementToBeClickable(click_share));
    		 Click_share.click();	
    		  Thread.sleep(2000);
    		 WebElement Close = wait.until(ExpectedConditions.elementToBeClickable(close));
    		 Close.click();	
    	
		
		  
		  
	    }
	
    	
    	
    	public void back()
    	{
    		 WebElement personalvaultback = wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
    		 personalvaultback.click();	
    		
    	}
}
	
	
