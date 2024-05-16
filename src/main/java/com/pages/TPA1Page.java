package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TPA1Page {
	
	private WebDriver driver;
	  private WebDriverWait wait;
	
	  
	  //Dashboard
	  private By Tpalogin=By.xpath("//button[@class='border_btn red_border mb-3']");
	  
	private By Dashboard=By.xpath("//span[contains(text(),'Dashboard')]");
	private By Addclient=By.xpath("//h4[contains(text(),'Add Client')]");
	private By firstname=By.xpath("//input[@id='firstName']");
	private By lastname=By.xpath("//input[@id='lastName']");
    private By phone=By.xpath(" //input[@id='phone']");
    private By email=By.xpath("//input[@id='email']");
	private By invite=By.xpath("//button[contains(text(),'Send Invite')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/invitation-sent[1]/div[1]/div[1]/button[1]");
	
	
	//profile section
	
	private By Profile=By.xpath("//span[contains(text(),'Profile')]");
    private By edit=By.xpath("//button[contains(text(),'Edit')]");
    private By firstname1=By.xpath("//input[@id='firstName']");
    private By lastname1=By.xpath(" //input[@id='lastName']");
    private By company=By.xpath("//input[@id='companyName']");
    private By typeofadvisor=By.xpath("//select[@id='typeOfAdvisor']");
    private By medical=By.xpath("//option[contains(text(),'Medical')]");
    private By companyaddress=By.xpath("//input[@id='companyWebSiteAddress']");
    private By savechanges=By.xpath("//button[contains(text(),'Save Changes')]");
    

    
    // Client list
    
    
    private By clientlist=By.xpath(" //span[contains(text(),'Client List')]");
    private By addclient=By.xpath("//span[contains(text(),'Add Client')]");
    private By firstname2=By.xpath("//input[@id='firstName']");
    private By lastname2=By.xpath(" //input[@id='lastName']");
    private By phone1=By.xpath("//input[@id='phone']");
    private By email1=By.xpath("//input[@id='email']");
    private By sendinvite=By.xpath("//button[contains(text(),'Send Invite')]");
    private By close1=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/invitation-sent[1]/div[1]/div[1]/button[1]");
    
    
   //Calendar
    
    private By calendar=By.xpath("//span[text()='Calendar']");
    private By newevent=By.xpath("//button[text()=' + New Event ']");
    private By eventtitle=By.xpath("//input[@id='eventTitle']");
   

    public static final By START_TIME_INPUT = By.xpath("//input[@id='startTime']");
	public static final By END_TIME_INPUT = By.xpath("//input[@id='endTime']");

	// Recurring event details locators
	public static final By RECURRING_EVENT_DROPDOWN = By.xpath("//select[@id='notify']");
//	    public static final By RECURRING_TYPE_SELECT = By.xpath("//select[@id='recurType']");
	public static final By MONTHLY_OPTION = By.xpath("//option[normalize-space()='Monthly']");

	// Date and time selection locators
	public static final By START_DATE = By.xpath("(//img[@class='icon-absolute'])[1]");
	public static final By MONTH_SELECT = By.xpath("//select[@title='Select month']");
	public static final By YEAR_DROPDOWN = By.xpath("//select[@title='Select year']");
	public static final By YEAR_SELECT = By.xpath("//select[@title='Select year']/option"); // findElements

	public static final By DAY_SELECT = By.xpath("//ngb-datepicker-month[@role='grid']/div/div"); // findElements

	// End Date Locators
	public static final By END_DATE = By.xpath("(//img[@class='icon-absolute'])[2]");

	// Start Time and End Time Locators
	public static final By STARTTIME = By.xpath("//input[@id='startTime']");
	public static final By ENDTIME = By.xpath("//input[@id='endTime']");

	// Attendee locators
	public static final By ADDPEOPLE_DROPDOWN = By.xpath("//button[@class='dropdown-toggle btn border']");
	public static final By ADDPEOPLE_SELECT = By.xpath("//div[@class='form-check']/input"); // findElements
	public static final By FamilyMembersList = By.xpath("//button[@class='dropdown-toggle btn border']/following::ul/li");

	// reminder locators
	public static final By REMINDER_DROPDOWN = By.xpath("//select[@id='reminder']");
	public static final By FIVE_MIN_BEFORE_OPTION = By.xpath("//option[normalize-space()='5 min before']");

	// Description and save locators
	public static final By DESCRIPTION_INPUT = By.xpath("//input[@id='description']");
	public static final By SAVE_BUTTON = By.xpath("//button[normalize-space()='Save']");

	// Success message locator
	public static final By SUCCESS_MESSAGE = By.xpath("//div[@aria-label='Your event has been created.']");


    private By repository=By.xpath("//span[contains(text(),'Document Repository')]");
    private By clickonupload=By.xpath(" //strong[contains(text(),'Click to Upload')]");
	
	
	public TPA1Page(WebDriver driver) {

		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	}
	
	public void clickOntpaLogin() {
		WebElement tpalogin = wait.until(ExpectedConditions.elementToBeClickable(Tpalogin));
		tpalogin.click();
		
	}
	
	public void Dashboard() throws InterruptedException {
	     Thread.sleep(6000);
		WebElement dashboard=	wait.until(ExpectedConditions.elementToBeClickable(Dashboard));
		dashboard.click();
		}
	public void Addclient() throws InterruptedException {
		WebElement addclient=	wait.until(ExpectedConditions.elementToBeClickable(Addclient));
		addclient.click();
		}
	public void firstname() throws InterruptedException {
		WebElement Firstname=	wait.until(ExpectedConditions.elementToBeClickable(firstname));
		Firstname.sendKeys("RAMYA");
		}
	public void lastname() throws InterruptedException {
		WebElement Lastname=	wait.until(ExpectedConditions.elementToBeClickable(lastname));
		Lastname.sendKeys("TEST");
		}
	public void phone() throws InterruptedException {
		WebElement Phone=	wait.until(ExpectedConditions.elementToBeClickable(phone));
		Phone.sendKeys("2015551864");
		}
	public void email() throws InterruptedException {
		WebElement Email=	wait.until(ExpectedConditions.elementToBeClickable(email));
		Email.sendKeys("TEST@YOPMAIL.COM");
		}
	public void invite() throws InterruptedException {
		WebElement Invite=	wait.until(ExpectedConditions.elementToBeClickable(invite));
		Invite.click();
		}
	public void close() throws InterruptedException {
	     Thread.sleep(2000);
		WebElement Close=	wait.until(ExpectedConditions.elementToBeClickable(close));
		Close.click();
		}
	public void Profile() throws InterruptedException {
	     Thread.sleep(3000);
		WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable(Profile));
		profile.click();
		}
	public void edit() throws InterruptedException {
	     Thread.sleep(2000);
		WebElement Edit=	wait.until(ExpectedConditions.elementToBeClickable(edit));
		Edit.click();
		}
	public void firstname1() throws InterruptedException {
		WebElement Firstname1=	wait.until(ExpectedConditions.elementToBeClickable(firstname1));
		Firstname1.sendKeys("TEST");
		}
	public void lastname1() throws InterruptedException {
		WebElement Lastname1=	wait.until(ExpectedConditions.elementToBeClickable(lastname1));
		Lastname1.sendKeys("RAMYA");
		}
	public void company() throws InterruptedException {
		WebElement Company=	wait.until(ExpectedConditions.elementToBeClickable(company));
		Company.sendKeys("smbxl");
		}
	public void typeofadvisor() throws InterruptedException {
		WebElement Typeofadvisor=	wait.until(ExpectedConditions.elementToBeClickable(typeofadvisor));
		Typeofadvisor.click();
		}
	public void medical() throws InterruptedException {
		 	WebElement Medical=	wait.until(ExpectedConditions.elementToBeClickable(medical));
		 	Medical.click();
		 	}
		public void companyaddress() throws InterruptedException {
			WebElement Companyaddress=	wait.until(ExpectedConditions.elementToBeClickable(companyaddress));
					Companyaddress.sendKeys("github.com");
			}
		public void savechanges() throws InterruptedException {
		     Thread.sleep(2000);
			WebElement Savechanges=	wait.until(ExpectedConditions.elementToBeClickable(savechanges));
			Savechanges.click();
			}
		public void clientlist() throws InterruptedException {
			     Thread.sleep(3000);
			 	WebElement Clientlist=	wait.until(ExpectedConditions.elementToBeClickable(clientlist));
			 	Clientlist.click();
			 	}
			public void addclient() throws InterruptedException {
				WebElement Addclient=	wait.until(ExpectedConditions.elementToBeClickable(addclient));
				Addclient.click();
				}
			public void firstname2() throws InterruptedException {
				WebElement Firstname2=	wait.until(ExpectedConditions.elementToBeClickable(firstname2));
				Firstname2.sendKeys("ramya");
				}
			public void lastname2() throws InterruptedException {
				 	WebElement Lastname2=	wait.until(ExpectedConditions.elementToBeClickable(lastname2));
				 	Lastname2.sendKeys("test");
				 	}
		  public void phone1() throws InterruptedException {
					WebElement Phone1=	wait.until(ExpectedConditions.elementToBeClickable(phone1));
					Phone1.sendKeys("2015551864");
					}
		  public void email1() throws InterruptedException {
					 	WebElement Email1=	wait.until(ExpectedConditions.elementToBeClickable(email1));
					 	Email1.sendKeys("hh@yopmail.com");
					 	}
					
		  public void sendinvite() throws InterruptedException {
					     Thread.sleep(3000);
						WebElement Sendinvite=	wait.until(ExpectedConditions.elementToBeClickable(sendinvite));
						Sendinvite.click();
						}
		  public void close1() throws InterruptedException {
						     Thread.sleep(3000);
						 	WebElement Close1=	wait.until(ExpectedConditions.elementToBeClickable(close1));
						 	Close1.click();
						 	}
						
	
		
		

	// Page Actions:

	public void clickOnCalendar() throws InterruptedException {
     Thread.sleep(3000);
	WebElement CALENDARBUTTON=	wait.until(ExpectedConditions.elementToBeClickable(calendar));
			CALENDARBUTTON.click();
	}

	public void clickOnNewEvent() {

		WebElement NEW_EVENTBUTTON=wait.until(ExpectedConditions.elementToBeClickable(newevent));
		NEW_EVENTBUTTON.click();
	}
	
	
		
		
		public void enterEventTitle(String Title) {
	        WebElement event_Title = wait.until(ExpectedConditions.elementToBeClickable(eventtitle));
	        event_Title.sendKeys(Title);
	    }

		public void clickOnStartTimeInput() {
		    WebElement startTimeInput = wait.until(ExpectedConditions.elementToBeClickable(STARTTIME));
		    startTimeInput.sendKeys("01:00"); // Or whatever value you want to set
		}


	    public void clickOnEndTimeDropDown() {
	        WebElement endTimeOption = wait.until(ExpectedConditions.elementToBeClickable(ENDTIME));
	        endTimeOption.click();
	    }
	    
	    
	    

	    public void clickOn_RECURRING_EVENT_DROPDOWN() {
	        // Wait for the dropdown to be clickable
	        WebElement recurringEventOptions = wait.until(ExpectedConditions.elementToBeClickable(RECURRING_EVENT_DROPDOWN));
	        Select dropDownOptions = new Select(recurringEventOptions);

	        // Define the desired recurring event (e.g., "Monthly")
	        String desiredRecurringEvent = "Monthly";

	        // Check if the desired option is available in the dropdown
	        List<WebElement> options = dropDownOptions.getOptions();
	        boolean isDesiredOptionAvailable = options.stream().anyMatch(option -> option.getText().equalsIgnoreCase(desiredRecurringEvent));

	        if (isDesiredOptionAvailable) {
	            // Select the desired recurring event
	            dropDownOptions.selectByVisibleText(desiredRecurringEvent);

	            // Optional: Perform actions after selecting the recurring event if needed

	            // Verify the selected recurring event is as expected
	            WebElement selectedOption = dropDownOptions.getFirstSelectedOption();
	            String selectedRecurringEvent = selectedOption.getText().trim();

	            // Optional: Print the selected recurring event for verification
	            System.out.println("Selected Recurring Event: " + selectedRecurringEvent);

	            // Compare the selected recurring event with the expected value
	            if (selectedRecurringEvent.equalsIgnoreCase(desiredRecurringEvent)) {
	                System.out.println("Test Passed: Selected recurring event is " + desiredRecurringEvent + ".");
	            } else {
	                System.out.println("Test Failed: Selected recurring event is not " + desiredRecurringEvent + ".");
	            }
	        } else {
	            System.out.println("Desired recurring event '" + desiredRecurringEvent + "' not available in the dropdown.");
	        }
	    }

	        
	        
	        
	    

	    public void selectStartDate() {
	        // Wait for and click on the START_DATE element
	    	WebElement startDateCalendarView = wait.until(ExpectedConditions.elementToBeClickable(START_DATE));
	        startDateCalendarView.click();
	    	
	    
	            // XPath for finding all elements representing days in the calendar
	            String dayXPath = "//div[@class='btn-light ng-star-inserted']";

	            // Find all elements matching the XPath
	            List<WebElement> allDays = driver.findElements(By.xpath(dayXPath));

	            // Iterate through the elements to find an enabled day
	            WebElement selectedDay = null;
	            for (WebElement day : allDays) {
	                if (day.isEnabled()) {
	                    selectedDay = day;
	                    break; // Stop iterating once an enabled day is found
	                }
	            }

	            // Check if an enabled day is found
	            if (selectedDay != null) {
	                // Store the selected day text or any other information you need
	                String selectedDayText = selectedDay.getText();

	                // Perform any verification or action with the selected day
	                System.out.println("Selected Day: " + selectedDayText);

	                // Example: Click on the selected day (You can modify this based on your requirements)
	                selectedDay.click();

	                // Add additional verification steps as needed
	                // For example, verify that the selected day is now highlighted or displayed differently

	            } else {
	                System.out.println("No enabled day found in the calendar.");
	            }
	        }
	    
	    
		
		
		
		
		
		
	    // Additional Page Actions (Continued):

	    public void selectEndDate() {
	    	
	    	 // Wait for and click on the START_DATE element
	    	WebElement EndDateCalendarView =wait.until(ExpectedConditions.elementToBeClickable(END_DATE));
	    	EndDateCalendarView.click();
	    	
	    


	            // Get the selected start date text
	            WebElement startDateCalendarView =wait.until(ExpectedConditions.elementToBeClickable(START_DATE));
	            String startDateText = startDateCalendarView.getText();

	            // Check if startDateText is empty or null
	            if (startDateText != null && !startDateText.isEmpty()) {
	                // Convert the start date text to a numerical value
	                int startDateValue = Integer.parseInt(startDateText);

	                // Find all elements representing days in the calendar
	                List<WebElement> allDays = driver.findElements(By.xpath("//div[@class='btn-light ng-star-inserted']"));

	                // Find and select any enabled end date that falls after the start date
	                WebElement selectedEndDate = null;
	                for (WebElement day : allDays) {
	                    if (day.isEnabled()) {
	                        // Get the numerical value of the day
	                        int dayValue = Integer.parseInt(day.getText());
	                        // Check if the day value is greater than or equal to the start date value
	                        if (dayValue >= startDateValue) {
	                            // Select the end date and break the loop
	                            selectedEndDate = day;
	                            selectedEndDate.click();
	                            break;
	                        }
	                    }
	                }

	                if (selectedEndDate == null) {
	                    System.out.println("No valid end date found in the calendar after the selected start date.");
	                }
	            } else {
	                System.out.println("Start date text is empty or null. Cannot parse to integer.");
	            }
	        }
	    	
	    	
	    
	    	
	   
	    

	    public void addPeople() {
	        try {
	            // Click on the ADDPEOPLE_DROPDOWN
	            WebElement addPeopleDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='dropdown-toggle btn border']")));
	            addPeopleDropdown.click();

	         // Get the list of family members
	            List<WebElement> peopleList = driver.findElements(FamilyMembersList);


	            // Check if there are any family members available
	            if (!peopleList.isEmpty()) {
	                // Generate a random index to select a family member
	                Random random = new Random();
	                int randomIndex = random.nextInt(peopleList.size());

	                // Select the family member at the random index
	                peopleList.get(randomIndex).click();

	                // Optional: Perform actions after selecting the family member if needed

	                // Get the text of the selected family member
	                WebElement selectedFamilyMember = peopleList.get(randomIndex);
	                String selectedMemberName = selectedFamilyMember.getText().trim();
	                System.out.println("Selected Family Member: " + selectedMemberName);

	                // Optional: Print the selected family member for verification
	                System.out.println("Test Passed: Selected Family Member is " + selectedMemberName + ".");
	            } else {
	                System.out.println("No family members available in the dropdown.");
	            }
	        } catch (TimeoutException e) {
	            // Handle timeout exception, log an error, or take appropriate action
	            System.out.println("TimeoutException: Element not found within the specified time.");
	            // You may also throw the exception again or handle it based on your application's needs.
	        }
	    }

	    
	    
	    

	    public void selectReminder() {
	        try {
	            // Select a reminder (example: 5 min before)
	            WebElement reminderDropdown = wait.until(ExpectedConditions.elementToBeClickable(REMINDER_DROPDOWN));
	            Select reminderDropdownOptions = new Select(reminderDropdown);

	            // Get the list of available reminder options
	            List<WebElement> reminderOptions = reminderDropdownOptions.getOptions();

	            // Check if there are any reminder options available
	            if (!reminderOptions.isEmpty()) {
	                // Generate a random index to select a reminder option
	                Random random = new Random();
	                int randomIndex = random.nextInt(reminderOptions.size());

	                // Select the reminder option at the random index
	                reminderDropdownOptions.selectByIndex(randomIndex);

	                // Optional: Perform actions after selecting the reminder option if needed

	                // Get the text of the selected reminder option
	                WebElement selectedReminderOption = reminderOptions.get(randomIndex);
	                String selectedReminder = selectedReminderOption.getText().trim();
	                System.out.println("Selected Reminder: " + selectedReminder);

	                // Optional: Print the selected reminder option for verification
	                System.out.println("Test Passed: Selected Reminder is " + selectedReminder + ".");
	            } else {
	                System.out.println("No reminder options available in the dropdown.");
	            }
	        } catch (TimeoutException e) {
	            // Handle timeout exception, log an error, or take appropriate action
	            System.out.println("TimeoutException: Element not found within the specified time.");
	            // You may also throw the exception again or handle it based on your application's needs.
	        }
	    }

	    
	    // Method to generate random text
	    private String generateRandomText() {
	        // You can adjust the length and other parameters as needed
	        return RandomStringUtils.randomAlphanumeric(20); // Generating random alphanumeric text of length 20
	    }

	    public void enterDescription() {
	        try {
	            // Enter a random description
	            WebElement descriptionInput = wait.until(ExpectedConditions.elementToBeClickable(DESCRIPTION_INPUT));
	            String randomText = generateRandomText();
	            descriptionInput.sendKeys(randomText);

	            // Print the entered random text
	            System.out.println("Entered Description: " + randomText);
	        } catch (TimeoutException e) {
	            // Handle timeout exception, log an error, or take appropriate action
	            System.out.println("TimeoutException: Element not found within the specified time.");
	            // You may also throw the exception again or handle it based on your application's needs.
	        }
	    }
	    
	    

	 

	    public void clickOnSave() {
	        // Click on the SAVE_BUTTON
	        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(SAVE_BUTTON));
	        saveButton.click();
	    }

	    public boolean isEventCreatedSuccessfully() throws InterruptedException {
	        // Check if the success message is displayed
	    	Thread.sleep(1000);
	        WebElement successMessage =wait.until(ExpectedConditions.elementToBeClickable(SUCCESS_MESSAGE));
	        System.out.println("Success MEssage: "+successMessage);
	        return successMessage.isDisplayed();
	    }
	    
	    
	    
	    
	    
   
	    public void repository() {
	        // Click on the SAVE_BUTTON
	        WebElement Repository = wait.until(ExpectedConditions.elementToBeClickable(repository));
	        Repository.click();
	    }
	    public void upload() throws InterruptedException, AWTException {
	        // Click on the SAVE_BUTTON
	        WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(clickonupload));
	        upload.click();
	        Thread.sleep(3000);
			String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
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
	    }
   
   
   
   
   

   
   
   
   
    
    
   

}
