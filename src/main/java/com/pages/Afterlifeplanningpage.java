package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Afterlifeplanningpage {
	
	
	private WebDriver driver;
    private WebDriverWait wait;
	private By clickonafterlifeplanning =By.xpath("//p[contains(text(),'After-Life Planning')]");
	private By Burial=By.xpath("//p[contains(text(),'Burial')]");
	private By add= By.xpath("//span[contains(text(),'Add')]");
	private By upload=By.xpath("//input[@id='file-upload']");
	private By verifysuccess=By.xpath("//div[contains(text(),'successfully ')]");
    private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	 
    public Afterlifeplanningpage(WebDriver driver) {
		this.driver=driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getAfterlifeplanningTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickonafterlifeplanning() {
		 WebElement Clickonafterlifeplanning = wait.until(ExpectedConditions.elementToBeClickable(clickonafterlifeplanning));
		 Clickonafterlifeplanning.click();
		
	}
	

	public void Burial() {
		 WebElement burial = wait.until(ExpectedConditions.elementToBeClickable(Burial));
		 burial.click();
	}
	
	
	
	
	
	
	public void addfile() {
		 WebElement Add = wait.until(ExpectedConditions.elementToBeClickable(add));
		 Add.click();
		
	}

	public void uploadfile(String filePath) throws InterruptedException {
	 Thread.sleep(5000);
		 WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(upload));
	       
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	
			fileInput.sendKeys(filePath);
	        Thread.sleep(1000);
		 
		 
			}
	  
	public boolean verify() {
		 WebElement Verifysuccess = wait.until(ExpectedConditions.elementToBeClickable(verifysuccess));
		 Verifysuccess.click();
		return true;
		
	}
	
	
	public void Back() {
		 WebElement personalvaultback = wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
		 personalvaultback.click();
	}

	
	
	

}
