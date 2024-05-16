package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;

public class Homepage {
	
	private WebDriver driver;
	 private WebDriverWaits wait;
	   private ScrollUtils scroll;
	   private WebDriverWaits waitUtil;
	
	private By home=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]");
	private By addfamily=By.xpath("//a[contains(text(),'Add a family member')]");
	private By add=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-dash-board[1]/div[1]/div[1]/div[1]/app-onboarding-accordion[1]/div[2]/div[2]/div[2]/div[1]/button[1]");
	private By name=By.xpath("//input[@id='name']");
	private By email=By.xpath("//input[@id='inviteEmail']");
	private By send=By.xpath("//button[contains(text(),'Send invite')]");
	private By uploadprofile=By.xpath("//a[contains(text(),'Upload your profile pic')]");
	private By upload=By.xpath("//button[contains(text(),'Upload')]");
	private By clicktoupload=By.xpath("//strong[contains(text(),'Click to Upload')]");
	private By sendfile=By.xpath("//button[contains(text(),'Save')]");
	private By emergencycontact=By.xpath("//a[contains(text(),'Add an emergency contact')]");
	private By addcontact=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-dash-board[1]/div[1]/div[1]/div[1]/app-onboarding-accordion[1]/div[2]/div[4]/div[2]/div[1]/button[1]");
	private By firstname=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-emergency[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
	private By lastname=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-emergency[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
	private By phone=By.xpath("//input[@id='phone']");
	private By contactemail=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-emergency[1]/div[1]/div[1]/form[1]/div[4]/input[1]");
	private By next=By.xpath("//button[contains(text(),'Next')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	private By gather=By.xpath("//a[contains(text(),'Gather your family’s vital documents')]");
	private By download=By.xpath("//button[contains(text(),'Download')]");
	private By invitetpa=By.xpath("//a[contains(text(),'Invite a trusted professional advisor')]");
	private By invite=By.xpath("//button[contains(text(),'Invite')]");
	private By advisorname=By.xpath("//input[@id='advisorName']");
	private By advisoremail=By.xpath("//input[@id='advisorEmail']");
	private By sendinvite=By.xpath("//button[contains(text(),'Send invite')]");
	
	
	
	 public Homepage(WebDriver driver) {
			this.driver = driver;
			 this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
			 this.wait = new WebDriverWaits(driver, Duration.ofSeconds(20));
		        this.scroll = new ScrollUtils(driver);
		}

		public String getHomePageTitle() {
			return driver.getCurrentUrl();
		}
		
		public void home() throws InterruptedException {
			Thread.sleep(8000);
			waitUtil.waitForElementToBeClickable(home).click();
		}
		
		
		
		public void addfamily() {
			waitUtil.waitForElementToBeClickable(addfamily).click();
			
		}
		
		
		public void addfamilymember() {
			waitUtil.waitForElementToBeClickable(add).click();	
			
		}
		
		  public void enterInvitePersonName() {
		      
			  waitUtil.waitForElementToBeClickable(name).sendKeys("MAMATHA");
		    }
		    public void enterInvitePersonEmail(String emailAdd) {
		    	waitUtil.waitForElementToBeClickable(email).sendKeys(emailAdd);
		    }
		    
		    public void send() throws InterruptedException {
		    	waitUtil.waitForElementToBeClickable(send).click();
		    	Thread.sleep(3000);
		    
		    
		    }
		    
       
		    
		    
		    public void upload() throws InterruptedException {
		    	Thread.sleep(4000);
		    	waitUtil.waitForElementToBeClickable(uploadprofile).click();
		    }
		    
		    public void uploadfile() throws InterruptedException, AWTException {
				waitUtil.waitForElementToBeClickable(upload).click();
				WebElement upload=waitUtil.waitForElementToBeClickable(clicktoupload);
						upload.click();
				Thread.sleep(7000);
				String filePath = "C:\\Users\\RAMYA\\Downloads\\jpgcat.jpeg";
				  StringSelection stringSelection = new StringSelection(filePath);

			        // Set the clipboard content with the file path
			        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			        // Create Robot instance
			        Robot robot = new Robot();

			        // Paste clipboard content
			        robot.keyPress(KeyEvent.VK_CONTROL);
			        robot.keyPress(KeyEvent.VK_V);
			        robot.keyRelease(KeyEvent.VK_V);
			        robot.keyRelease(KeyEvent.VK_CONTROL);

			        // Press Enter to confirm the upload
			        robot.keyPress(KeyEvent.VK_ENTER);
			        robot.keyRelease(KeyEvent.VK_ENTER);
			        Thread.sleep(3000);
			        waitUtil.waitForElementToBeClickable(sendfile).click();
				 
					}
		   
       
		   
       
		    public void emergencycontact() throws InterruptedException {
		    	Thread.sleep(2000);
		    	waitUtil.waitForElementToBeClickable(emergencycontact).click();
		    	waitUtil.waitForElementToBeClickable(addcontact).click();
		    	waitUtil.waitForElementToBeClickable(firstname).sendKeys("ramya");
		    	waitUtil.waitForElementToBeClickable(lastname).sendKeys("test");
		    	waitUtil.waitForElementToBeClickable(phone).sendKeys("2015551864");
		    	waitUtil.waitForElementToBeClickable(contactemail).sendKeys("fast@yopmail.com");
		    	waitUtil.waitForElementToBeClickable(next).click();
		    	Thread.sleep(1000);
		    	waitUtil.waitForElementToBeClickable(close).click();
		    	
		    	
		    	
		    	
		    }
       
		    public void gather() throws InterruptedException {
		    	Thread.sleep(2000);
		    	waitUtil.waitForElementToBeClickable(gather).click();
		    	waitUtil.waitForElementToBeClickable(download).click();
		    }
       
		    public void TPA() throws InterruptedException {
		    	Thread.sleep(2000);
		    	waitUtil.waitForElementToBeClickable(invitetpa).click();
		    	waitUtil.waitForElementToBeClickable(invite).click();
		    }
		    public void enterInviteTPAPersonName() {
		    	waitUtil.waitForElementToBeClickable(advisorname).sendKeys("RAMYA");
		    }
		    public void enterInviteTPAPersonEmail(String emailAdd) {
		    	waitUtil.waitForElementToBeClickable(advisoremail).sendKeys(emailAdd);
		    }
		    public void sendinvite()
		    {
		    	waitUtil.waitForElementToBeClickable(sendinvite).click();
		    }
       
		  
		   

}
