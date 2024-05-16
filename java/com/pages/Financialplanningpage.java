package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Financialplanningpage {

	private WebDriver driver;
	 private WebDriverWait wait;
	 
	private By clickonpersonalvault = By.xpath("//span[contains(text(),'Personal Vault')]");
	private By ClickonFinancialplanning=By.xpath("//p[contains(text(),'Financial Planning')]");
	private By invoice=By.xpath("//p[contains(text(),'Invoice')]");
	private By Addfile=By.xpath("//span[contains(text(),'Add')]");
	private By scandocument=By.xpath("//span[contains(text(),'scan document')]");
	private By uploadfile=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/upload-document[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By done=By.xpath("//button[contains(text(),'Done')]");
	private By save =By.xpath("//button[contains(text(),'Save')]");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	
	public Financialplanningpage(WebDriver driver) {
		this.driver=driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getFinancialplanningTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickpersonalvault() {
		WebElement Clickonpersonalvault=wait.until(ExpectedConditions.elementToBeClickable(clickonpersonalvault));
		Clickonpersonalvault.click();
		
	}
	
	
	public void ClickonFinancialplanning() {
		WebElement clickonFinancialplanning=wait.until(ExpectedConditions.elementToBeClickable(ClickonFinancialplanning));
		clickonFinancialplanning.click();
	}
	
	
	
	public void invoice() {
		WebElement Invoice=wait.until(ExpectedConditions.elementToBeClickable(invoice));
		Invoice.click();
	}
	public void Addfile() {
		WebElement addfile=wait.until(ExpectedConditions.elementToBeClickable(Addfile));
		addfile.click();
	}
	
	public void scandocument() {
		WebElement Scandocument=wait.until(ExpectedConditions.elementToBeClickable(scandocument));
		Scandocument.click();
	}
	
	public void uploadfile(String filePath) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(uploadfile));
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	        Thread.sleep(1000);
	        
			fileInput.sendKeys(filePath);
	        Thread.sleep(5000);
		 
//	        
	        
	        
	      
	        
	}
	public void done() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Done=wait.until(ExpectedConditions.elementToBeClickable(done));
		Done.click();
		Thread.sleep(2000);
		WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(save));
		Save.click();
		Thread.sleep(2000);
		WebElement personalvaultback=wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
		personalvaultback.click();
		
		
	}

	
	
	
	
	
	
	
	
	

}
