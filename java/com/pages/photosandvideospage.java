package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class photosandvideospage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By photosclick=By.xpath("//span[contains(text(),'Photos & Videos')]");
	private By subscriber=By.xpath("//p[@class='text-capitalize']");
	private By add=By.xpath("//span[contains(text(),'Add')]");
	private By upload=By.xpath("//input[@name='file-upload']");
	
	
	
	public photosandvideospage(WebDriver driver) {
		this.driver = driver; 
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getphotosandvideosTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickphotos() {
		WebElement Photosclick=wait.until(ExpectedConditions.elementToBeClickable(photosclick));
		Photosclick.click();
		

		
	}
	public void subscriber() {
		WebElement Subscriber=wait.until(ExpectedConditions.elementToBeClickable(subscriber));
		Subscriber.click();
		
		
		
	}
	public void add() {
		WebElement Aadd=wait.until(ExpectedConditions.elementToBeClickable(add));
		Aadd.click();
		

		
	}
	public void upload() {
		
		
		 WebElement iframe = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("iframe")));    
  	   driver.switchTo().frame(iframe);   

		  
		  
		
		  WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(upload));
		
  	    String filePath = "C:\\Users\\RAMYA\\Downloads\\MicrosoftTeams-image (13)	.png";

  	    // Use JavaScript to set the value of the file input
  	    String script = "arguments[0].style.display='block'; arguments[0].style.visibility='visible'; arguments[0].value='" + filePath + "';";
  	    ((JavascriptExecutor) driver).executeScript(script, fileInput);
	}
		
       
       
       
     
      
		
	}
	
	
	
	
	
	
	
	

