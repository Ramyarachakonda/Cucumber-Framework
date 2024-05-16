package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class LegacyMessageVideoRecord {
	
	private WebDriver driver;
    private	WebDriverWait wait;

	 
		private final Faker faker = new Faker();
		private String lastGeneratedRandomTitle; // Variable to store the last generated random title
//		String randomTitle;
//		String randomDate;
	 
		    // Locators
		private By otpElement  = By.xpath("//tbody/tr[1]/td[3]");
		private By otpfield = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
		    private By legacyMessagesButton = By.xpath("//span[normalize-space()='Legacy Messages']");
		   // private By otpInputs = By.xpath("(//input[contains(@id,'otp_')])[1]");
		    private By createFirstMessageButton = By.xpath("//button[normalize-space()='Create your first message']");
		    private By NewMessageBtn = By.xpath("//button[contains(text(),'New Message')]");
		    private By recordOneHereButton = By.xpath("//button[text()='record one here.']");
		    private By recordVideoMessageButton = By.xpath("//p[normalize-space()='Record video message']");
		    private By recordNowButton = By.xpath("//button[normalize-space()='Record now']");
		    private By startRecordingButton = By.xpath("//button[normalize-space()='Start Recording']");
		    private By stopRecordingButton = By.xpath("//button[normalize-space()='Stop Recording']");
		    private By nextButton = By.xpath("//button[normalize-space()='Next']");
		    
		     
//		    private By messageTitleInput = By.xpath("//input[@id='msg_title']");
//		    private By NextBtn_MessageTitle = By.xpath("//button[@class='primary_btn']");
		    private By myFamilyButton = By.xpath("//p[normalize-space()='My Family']");
		    private By SelectAllButton = By.xpath("//input[@id='select_all']");
		    private By NextBtn_afterSelectAll = By.xpath("//button[normalize-space()='Next']");
		    private By specificDateLabel = By.xpath("//label[normalize-space()='Specific date']");
		    private By specificYearDropdown = By.xpath("//select[@id='specific-year']");
		    private By specificMonthDropdown = By.xpath("//select[@id='specific-month']");
		    private By specificDayDropdown = By.xpath("//select[@id='specific-days']");
	//	    private By nextButtonAfterSpecificDate = By.xpath("//button[normalize-space()='Next']");
		    private By userUpdatedToast = By.xpath("//div[contains(text(),'Updated successfully')]");
		    private By UploadedVideoTableData = By.xpath("//tbody/tr/td");
		    private By uponpassing=By.xpath("//label[contains(text(),'Upon passing')]");
		    private By next=By.xpath("//button[text()=' Next ']");
		    private By closeButton = By.xpath("//button[normalize-space()='Close']");
	 
		    
		    
		    
		    
		    private By create=By.xpath("//input[@id='myFile']");
		
		public LegacyMessageVideoRecord(WebDriver driver) {
				this.driver = driver;
				 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			}
			public String getLegacyMessageTitle() {
				return driver.getTitle();
			}
		    // Methods to interact with elements
		    public void clickLegacyMessages() {
		    	WebElement LegacyMessagesButton=wait.until(ExpectedConditions.elementToBeClickable(legacyMessagesButton));
		    	LegacyMessagesButton.click();
				
		    }
		  //Otp extract from here

		 // Method to extract OTP
		    public String extractOtpFromSmstome() throws InterruptedException {
		        // Open a new tab
		    	((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
			    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));

			    driver.get("https://smstome.com/usa/phone/17193045296/sms/6184");

			   
			    driver.navigate().refresh();
			  
			    String otpText=wait.until(ExpectedConditions.elementToBeClickable(otpElement)).getText();

			    
			     int startIndex = otpText.indexOf("is ") + "is ".length();
			     int endIndex = otpText.indexOf(". It will be valid");
			     String otpValue = otpText.substring(startIndex, endIndex);

	             driver.close();
			    driver.switchTo().window(tabs.get(0));
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			    wait.until(ExpectedConditions.elementToBeClickable(otpfield)).sendKeys(otpValue);
	         
	 
	 
		        return otpValue;
		    }
	 
	//Otp extract end
	 
	 
		    public void clickCreateFirstMessage(String filePath) throws InterruptedException {
		        // Wait for the element to be clickable
		   driver.findElement(createFirstMessageButton).click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement fileInput = driver.findElement(create);
			
		        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
		        ((JavascriptExecutor) driver).executeScript(script, fileInput);
		
				fileInput.sendKeys(filePath);
		        Thread.sleep(1000);
			 
		    }
//		    public void clickRecordOneHere() {
//		    	WebElement recordOneHere=  wait.until(ExpectedConditions.elementToBeClickable(recordOneHereButton));
//		    	recordOneHere.click();
//		    }
//	 
//		    public void clickRecordVideoMessage() {
//		    	WebElement recordVideoMessageBtn = wait.until(ExpectedConditions.elementToBeClickable(recordVideoMessageButton));
//		    	recordVideoMessageBtn.click();
//		    }
//	 
//		    public void clickRecordNow() {
//		    	WebElement recordNowBtn = wait.until(ExpectedConditions.elementToBeClickable(recordNowButton));
//		    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", recordNowBtn);
//		    	recordNowBtn.click();
//		    }
//	 
//			    public void clickStartRecording() throws InterruptedException {
//			        WebElement startRecordingBtn = wait.until(ExpectedConditions.elementToBeClickable(startRecordingButton));
//			        startRecordingBtn.click();
//			        Thread.sleep(15000);
//			    }
//	 
//			    public void clickStopRecording() {
//			    	WebElement stopRecordingBtn = wait.until(ExpectedConditions.elementToBeClickable(stopRecordingButton));
//			    	stopRecordingBtn.click();
//			    }
//	 
			    public void clickNext() throws InterruptedException {
			    	WebElement NextButton=wait.until(ExpectedConditions.elementToBeClickable(nextButton));
			    	NextButton.click();
					
			    	driver.findElement(nextButton).click();;
//			    	next.click();
			    }



	//Entering Random Title	    
	 
			    
	 
			    // Other existing methods...
	 
			    // Method to enter a random message title
//			    public void enterRandomMessageTitle() throws InterruptedException {
//			        // Use Faker library to generate a random title
//			        lastGeneratedRandomTitle = faker.lorem().sentence();
//			        // Implement logic to enter the lastGeneratedRandomTitle value into your message title field
//			        Thread.sleep(2000);
//			        driver.findElement(messageTitleInput).sendKeys(lastGeneratedRandomTitle);
//			    }
//	//Entering Random Title		    
//
//			    public void nextButtonMessageTitle() {
//			        WebElement NextBtn_MsgTitle = wait.until(ExpectedConditions.elementToBeClickable(NextBtn_MessageTitle));
//			        NextBtn_MsgTitle.click();
//			    }
//	 
			    public void clickMyFamily() {
			    	WebElement MyFamilyButton=wait.until(ExpectedConditions.elementToBeClickable(myFamilyButton));
			    	MyFamilyButton.click();
					
			 
			    }
	 
			    public void SelectAll_CheckBox() {
			    	WebElement selectAllButton=wait.until(ExpectedConditions.elementToBeClickable(SelectAllButton));
			    	selectAllButton.click();
					
			        
			    }
			    public void clickNextAfterSelectAll() {
			    	WebElement nextBtn_afterSelectAll=wait.until(ExpectedConditions.elementToBeClickable(NextBtn_afterSelectAll));
			    	nextBtn_afterSelectAll.click();
					
			      
			      
			    }
			    public void uponpassing() {
			    	WebElement Uponpassing=wait.until(ExpectedConditions.elementToBeClickable(uponpassing));
			    	Uponpassing.click();
					
			    }
			    public void next() {
			    	WebElement Next=wait.until(ExpectedConditions.elementToBeClickable(next));
			    	Next.click();
					
			    
			    }
//			    public void clickSpecificDateLabel() {
//			        // Wait for the element to be clickable
////			       driver.findElement(specificDateLabel). click();
//	 
//			        // Scroll the element into view
//
//	 
//			        // Click the element after it's in view
//			        driver.findElement(specificDateLabel). click();
//			    }
//	 
//	 
//			    
//
//
//
//
//	 
//	//Random date selection code
//			        // Method to select a random year from the dropdown
//			        public void selectRandomYear() {
//			          driver.findElement(specificYearDropdown).click();
////			            Select yearSelect = new Select(yearDropdown);
//	 
//			            // Generate a random year between 2020 and 2030 (adjust the range as needed)
////			            String randomYear = Integer.toString(faker.number().numberBetween(2024, 2030));
////	 
////			            yearSelect.selectByValue(randomYear);
////			            System.out.println(randomYear);
//			        }
//
//	 
//	              // Method to select a random month from the dropdown
//			        public void selectRandomMonth() throws InterruptedException {
//			        driver.findElement(specificMonthDropdown).click();
////			            Select monthSelect = new Select(monthDropdown);
//	 
//			            // Get all available options from the dropdown
////			            List<WebElement> monthOptions = monthSelect.getOptions();
////			            System.out.println("Print months :"+monthOptions);
////	 
////			            // Generate a random index to select a month
////			            int randomIndex = faker.number().numberBetween(0, monthOptions.size());
////	 
////			            // Select the month at the random index
////			            monthSelect.selectByIndex(randomIndex);
////	 
////			            // Get the selected month text for logging
////			            String selectedMonth = monthOptions.get(randomIndex).getText();
////			            System.out.println(selectedMonth);
//			            Thread.sleep(2000);
//			        }
//
//
//
//			        public void selectDayFromDropdown() throws InterruptedException {
//			            try {
//			                // Wait for the day dropdown to be visible
//			                WebElement dayDropdown = wait.until(ExpectedConditions.elementToBeClickable(specificDayDropdown));
//			                Thread.sleep(5000);
//	 
//			                // Use sendKeys to select the third option in the day dropdown
////			                dayDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
////			                dayDropdown
//	 
//			                // Get the selected day value for printing
//			                String selectedDay = dayDropdown.getAttribute("value");
//	 
//			                System.out.println("Selected day: " + selectedDay);
//			            } catch (Exception e) {
//			                e.printStackTrace(); // Handle any exceptions that may occur
//			            }
//			        }
//	 
//	 
//	 
//	//Random date selection code
//
//			 // Method to verify if the message is displayed
//			    public boolean isUpdateSuccessMessageDisplayed() {
//			        // Wait for the success message to be present on the page
//			      driver.findElement(userUpdatedToast).isDisplayed();
//	 
//			        // Find the success message element
//			        WebElement successMessageElement = driver.findElement(userUpdatedToast);
//	 
//			        // Check if the element is displayed
//			        return successMessageElement.isDisplayed();
//			    }
//
//			    // Method to click the selected video based on title
//			    public void clickSelectedVideo() throws InterruptedException {
//			        // Assuming UploadedVideoTableData is the locator for the table containing video information
//			        List<WebElement> cells = driver.findElements(UploadedVideoTableData);
//	 
//			        // Iterate through the cells to find the matching video
//			        for (WebElement cell : cells) {
//			            // Extract the cell value (title)
//			            String cellValue = cell.getText().trim();
//			            System.out.println("CellValue: "+ cellValue + "lastGeneratedRandomTitle: "+lastGeneratedRandomTitle);
//	 
//			            // Check if the current cell contains the last generated random title
//			            if (containsIgnoreCase(cellValue, lastGeneratedRandomTitle)) {
//			                // Click on the corresponding vide
//			                cell.click();
//			                Thread.sleep(10000);
//			                break; // Break the loop once the video is found
//			            }
//			        }
//			    }
//	 
//			    // Helper method to check if a string contains another string (case-insensitive)
//			    private boolean containsIgnoreCase(String source, String target) {
//			        return source.toLowerCase().contains(target.toLowerCase());
//			    }
	//Logic Method to Iterate cells
	 
			    
//			    public void clickClose() {
//			      driver.findElement(closeButton).click();
//			      
//			    }
//	 
			    // You can continue adding methods for other interactions based on your steps...
			}
	 
	 


