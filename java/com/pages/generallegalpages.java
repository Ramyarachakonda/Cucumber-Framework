package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class generallegalpages {
	
	private WebDriver driver;
	 private WebDriverWait wait;
	 
	private By Clickon_Generallegal =By.xpath("//p[contains(text(),'General Legal Information')]");
	private By Clickonestateplanning=By.xpath("//p[contains(text(),'Estate Planning')]");
	private By Addfile=By.xpath("//span[contains(text(),'Add')]");
	private By uploadfile=By.xpath("//input[@id='file-upload']");
    private By verifysuccess=By.xpath("//div[contains(text(),'successfully ')]");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	
	
	public generallegalpages(WebDriver driver) {
		this.driver=driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getGenerallegalTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickgenerallegal() {
		WebElement clickon_Generallegal=wait.until(ExpectedConditions.elementToBeClickable(Clickon_Generallegal));
		clickon_Generallegal.click();
		
		
	}
	
	
	public void addfile() {
		WebElement addfile=wait.until(ExpectedConditions.elementToBeClickable(Addfile));
		addfile.click();
		
		
	}

	public void uploadfile(String filePath) throws InterruptedException {
		Thread.sleep(3000);
		WebElement fileInput =driver.findElement(uploadfile);
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	
			fileInput.sendKeys(filePath);
	        Thread.sleep(1000);
		 
		 
			}
	  
	public boolean verify() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement Verifysuccess=wait.until(ExpectedConditions.elementToBeClickable(verifysuccess));
		Verifysuccess.click();
		
		return true;
		
	}
	
	
	public void Back() throws InterruptedException {
		Thread.sleep(2000);
		WebElement personalvaultback=wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
		personalvaultback.click();
		
	}

	
	
	public void Clickonestateplanning() {
		WebElement clickonestateplanning=wait.until(ExpectedConditions.elementToBeClickable(Clickonestateplanning));
		clickonestateplanning.click();
		
	}
	
	
	

}
