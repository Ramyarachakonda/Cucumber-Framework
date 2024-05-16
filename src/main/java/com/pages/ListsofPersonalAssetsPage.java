package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListsofPersonalAssetsPage {
	
	

	
	private WebDriver driver;
	 private WebDriverWait wait;
	private By clickonpersonalvault =By.xpath("//span[contains(text(),'Personal Vault')]");
	private By ClickonListsofpersonalassets=By.xpath("//p[contains(text(),'Lists of Personal Assets')]");
	private By Addfile=By.xpath("//span[contains(text(),'Add')]");
	private By uploadfile=By.xpath("//input[@id='file-upload']");
    private By verifysuccess=By.xpath("//div[contains(text(),'successfully ')]");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	
	
	public ListsofPersonalAssetsPage(WebDriver driver) {
		this.driver=driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getGenerallegalTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickpersonalvault() {
		WebElement Clickonpersonalvault=wait.until(ExpectedConditions.elementToBeClickable(clickonpersonalvault));
		Clickonpersonalvault.click();
		
	}
	
	
	public void ClickonListsofpersonalassets() {
		WebElement clickonListsofpersonalassets=wait.until(ExpectedConditions.elementToBeClickable(ClickonListsofpersonalassets));
		clickonListsofpersonalassets.click();
	}
	
	
	
	
	
	
	public void addfile() {
		WebElement addfile=wait.until(ExpectedConditions.elementToBeClickable(Addfile));
		addfile.click();
		
	}

	public void uploadfile(String filePath) throws InterruptedException {
	    Thread.sleep(4000);
		
		WebElement fileInput =wait.until(ExpectedConditions.elementToBeClickable(uploadfile));
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	
			fileInput.sendKeys(filePath);
	        Thread.sleep(1000);
		 
		 
			}
	  
	public boolean verify() {
		WebElement Verifysuccess=wait.until(ExpectedConditions.elementToBeClickable(verifysuccess));
		Verifysuccess.click();
		return true;
		
	}
	
	
	public void Back() {
		WebElement personalvaultback=wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
		personalvaultback.click();
	}

	

}
