package com.pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;

public class FileUpload_PhotosVideos  {
	   private WebDriver driver;
	   private WebDriverWaits waitUtil;
	    private ScrollUtils scrollUtils;


	    
	 
	    // Photos and Videos Navigation:
	    private By ClickOnSubscriber = By.xpath("(//p[@class='text-capitalize'])[1]");
	    private By ClickPhotosVideos = By.xpath("//a[@class='nav-link']/child::span[text()='Photos & Videos']");
	    private By ClickOnFamilyMember = By.xpath("(//div[@class='box_icon_name']/following::p)[1]");
	    private By ClickAddBtn = By.xpath("//button[@class='primary_btn add_btn dropdown-toggle']");
	    private By ClickDropDown_UploadFile = By.xpath("//input[@id='file-upload']");
	    private By uploadedSuccessfullyToast = By.xpath("//div[@aria-label='Uploaded successfully']");
	    private By UploadIcon = By.xpath("//span//strong[text()='Click to Upload']");
	    
	    
	    // Constructor of the page class:
	    public FileUpload_PhotosVideos(WebDriver driver) {
	        this.driver = driver;
	        this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
	        this.scrollUtils = new ScrollUtils(driver);
	    }

	 // Page Actions:


	    public void clickOnPhotosAndVideos() throws InterruptedException {
	    	Thread.sleep(2000);
	    	 // Locate the element you want to scroll into view
	        WebElement yourElement = waitUtil.waitForElementToBeClickable(ClickPhotosVideos);

	        // Scroll into view using the utility method
	        scrollUtils.scrollToElement(yourElement);

	        // Now, you can perform any action on the element
	        // For example, click on the element
	        yourElement.click();
	    }



	    public void clickOnFamilyMember() {
	    	waitUtil.waitForElementToBeClickable(ClickOnFamilyMember).click();

	    }


	    public void clickOnAddButton() {
	        waitUtil.waitForElementToBeClickable(ClickAddBtn).click();
	    }


	    public void clickOnPhotoVideosBack() {
	        waitUtil.waitForElementToBeClickable(By.xpath("//a[text()='Photo & Video Library']")).click();
	        waitUtil.waitForElementToBeClickable(ClickOnSubscriber).click();


	    }

	    public void clickOnUploadIcon() {

	    	 WebElement fileInput = driver.findElement(UploadIcon);
	    	    String filePath = "C:\\Users\\RAMYA\\Downloads\\MicrosoftTeams-image (13)	.png";

	    	    // Use JavaScript to set the value of the file input
	    	    String script = "arguments[0].style.display='block'; arguments[0].style.visibility='visible'; arguments[0].value='" + filePath + "';";
	    	    ((JavascriptExecutor) driver).executeScript(script, fileInput);
	    }


	    public void uploadFile(String filePath) {
	        // Locate the file input element
	        WebElement fileInput = driver.findElement(ClickDropDown_UploadFile);

	        // Update file path with correct slashes
	        String filePath1 = "C:\\Users\\RAMYA\\Downloads\\MicrosoftTeams-image (13).png";

	        // Set style using JavaScript
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);

	        
	        // Send file path to the file input
	        fileInput.sendKeys(filePath1);
	    } 
	    
	    
	    public boolean isUploadedSuccessfullyVisible() {
	        return waitUtil.isElementVisible(uploadedSuccessfullyToast);

//	        Thread.sleep(5000);
	    }





}
















