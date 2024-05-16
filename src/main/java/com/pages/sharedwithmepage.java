package com.pages;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Utils.WebDriverWaits;



public class sharedwithmepage {
	private WebDriver driver;
	  private WebDriverWaits waitUtil;


	private By sharefile = By.xpath("//img[@alt='share link icon']");
	private By firstname=By.xpath("//input[@placeholder='First Name']");
	private By lastname=By.xpath("//input[@placeholder='Last Name']");
	private By email=By.xpath("//input[@type='email']");
	private By flag=By.xpath("/html/body/ngb-modal-window/div/div/app-share-upload-link/div/div/div/form/div[3]/app-phone-input/form/ngx-intl-tel-input/div/div/div/div[1]");
	private By searchcountry=By.xpath("//div//input[@placeholder='Search Country']");
	private By us=By.xpath("//div//span[text()='United States']");
	private By phone=By.xpath("//*[@id=\"phone\"]");
	private By validuntil=By.xpath("  //*[@id=\"dp\"]");
	private By validTill=By.xpath("/html/body/ngb-modal-window/div/div/app-share-upload-link/div/div/div/form/div[4]/select/option[4]");
	private By share=By.xpath("//button[text()='Share']");
	
	private By enteremail=By.xpath("//input[@id='login']");
	private By click=By.xpath("//*[@id=\"refreshbut\"]/button/i");
//	private By refresh =By.xpath("/html/body/div[1]/div/div/main/div[2]/div[1]/div/div[1]/div[6]/button");
    private By emaillink=By.xpath("//span[text()='Family Central']");     
    private By frame=By.xpath("//*[@id=\"ifmail\"]");
    private By signin=By.xpath("//*[@id=\"mail\"]/div/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td/table/tbody/tr/td/div/a/span");
    private By otp=By.xpath("/html/body/main/div/div/div/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td");
    private By entercode=By.xpath("  //input[@class='otp-input ng-pristine ng-valid ng-star-inserted ng-touched']");
    private By submit=By.xpath("//button[@type='submit']");
    private By file=By.xpath("//span[text()='Select a file to upload']");
    private By send=By.xpath("//button[text()=' Send ']");

  
    
	public sharedwithmepage(WebDriver driver) {
		this.driver = driver;  
		  this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
	}

	public String getSharedwithmeTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void sharefile() throws InterruptedException {
		Thread.sleep(5000);
		waitUtil.waitForVisibilityOfElement(sharefile).click();
		
	}
	
	public void firstname() {
		waitUtil.waitForVisibilityOfElement(firstname).sendKeys("Ramya");
	}
	
	
	public void lastname() {
		waitUtil.waitForVisibilityOfElement(lastname).sendKeys("test");
	}
	
	
	public void email() {
		waitUtil.waitForVisibilityOfElement(email).sendKeys("nramya25@yopmail.com");;
	}
	
	
	public void flag() {
		waitUtil.waitForVisibilityOfElement(flag).click();
	}
	
	
	public void searchcountry() {
		waitUtil.waitForVisibilityOfElement(searchcountry).sendKeys("United States");
	}
	
	
	public void us() {
		waitUtil.waitForVisibilityOfElement(us).click();
	}
	
	
	public void phone() {
		waitUtil.waitForVisibilityOfElement(phone).sendKeys("+12292127375");
	}
	
	
	public void validuntil() {
		waitUtil.waitForVisibilityOfElement(validuntil).click();
	}
	
	
	public void validTill() {
		waitUtil.waitForVisibilityOfElement(validTill).click();
	}
	
	// file sharing a share upload link from the peresonal vault
	public void share() {
		waitUtil.waitForVisibilityOfElement(share).click();
		
	}

	// from here we are opening yopmail window
	public void yopmail() throws InterruptedException { 
		
		((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		 driver.switchTo().window(tabs.get(1));
	    driver.get("https://yopmail.com/en/");
	    Thread.sleep(1000);
	    driver.navigate().refresh();

	    
	}

	
	// from here we are entering email into search
	public void enteremail() throws InterruptedException {
		
		
		waitUtil.waitForVisibilityOfElement(enteremail).clear();
		Thread.sleep(1000);
		waitUtil.waitForVisibilityOfElement(enteremail).sendKeys("nramya25@yopmail.com");
		
	}
	
	// from here we are clicking on arrow option
	public void click() throws InterruptedException {
		Thread.sleep(2000);
		waitUtil.waitForVisibilityOfElement(click).click();
		Thread.sleep(8000);
		driver.navigate().refresh();
		
	}
	
	// switching to iframe of received email
	public void frame() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().refresh();
		waitUtil.waitForVisibilityOfElement(frame).click();
		
	}
	// from refresh the email and clicking on received email
	public void emaillink() {
		driver.navigate().refresh();
		waitUtil.waitForVisibilityOfElement(emaillink).click(); 
		
	}
	
	// here switching to ifrome2 the click on sing in option
	public void signin() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		waitUtil.waitForVisibilityOfElement(signin).click();
		 Thread.sleep(5000);
		
		
	}
	
	// here new window opened and entering yopmail otp by switching to yopmail
	public void code() throws Throwable {
		      ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			   driver.switchTo().window(tabs.get(1));
			   Thread.sleep(5000);
			   driver.navigate().refresh();
			   driver.switchTo().frame(2);
			   String otpText=driver.findElement(otp).getText();
			   String OtpValue=otpText.concat(otpText);			 
			   driver.switchTo().window(tabs.get(2)); 
			   waitUtil.waitForVisibilityOfElement(entercode).sendKeys(OtpValue);
			   waitUtil.waitForVisibilityOfElement(submit).click();
		
			   
	}
	

		      public void uploadFile() throws InterruptedException, AWTException {
		       WebElement upload=driver.findElement(file);
			   upload.click();
		       Thread.sleep(3000);
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
		        Thread.sleep(2000);
		        waitUtil.waitForVisibilityOfElement(send).click();
		        Thread.sleep(3000);
		        driver.close();
		    } 
		        public void previouswindow() throws InterruptedException {
		        	 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		        	 driver.switchTo().window(tabs.get(1));
		        	 driver.close();
		        	 Thread.sleep(2000);
		        	 driver.switchTo().window(tabs.get(0));
		        }		          	
  	
  	
       //  By loc =  By.xpath("//div[@class='first name']");
  	    
	}
		
