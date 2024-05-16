package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class accountmenupage {


	private WebDriver driver;
	  private WebDriverWait wait;
	
	private By accountmenu=By.xpath("//span[contains(text(),'Account Menu')]");
	private By myaccount=By.xpath("//span[contains(text(),'My Account')]");
	private By edit=By.xpath("//button[contains(text(),'Edit')]");
	private By firstname=By.xpath("//input[@id='fname']");
	private By lastname=By.xpath("//input[@id='lname']");
	private By phone=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[1]/profile[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[2]/div[1]/app-phone-input[1]/form[1]/ngx-intl-tel-input[1]/div[1]/input[1]");
	private By changezipcode=By.xpath("//input[@id='zipcode']");
//	private By savechange=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[1]/profile[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/button[1]");
	private By password=By.xpath("//a[contains(text(),'Password & Security')]");
	private By currentpass=By.xpath("//input[@id='currentPass']");
	private By newpass=By.xpath("//input[@id='newPass']");
	private By confirmpass=By.xpath("//input[@id='confirmPass']");
	private By savechanges=By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/settings[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/button[2]");
	
	private By Executor=By.xpath("//a[contains(text(),'Executor')]");
	private By fname=By.xpath("//input[@id='exfname']");
	private By lname=By.xpath("//input[@id='exlname']");
	private By email=By.xpath("//input[@id='exemail']");
	private By Executorphone=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[4]/confidantes[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/app-phone-input[1]/form[1]/ngx-intl-tel-input[1]/div[1]/input[1]");
	private By send=By.xpath("//button[contains(text(),'Send invitation')]");	
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/invitation-sent[1]/div[1]/div[1]/button[1]");
	
	
	
    private By Emergencycontact=By.xpath("//a[contains(text(),'Emergency contact')]");
    private By addanother=By.xpath("//button[contains(text(),'+ Add another')]");
	private By efname=By.xpath("//input[@id='emergencyfname']");
	private By elname=By.xpath("//input[@id='emergencylname']");
	private By eemail=By.xpath("//input[@id='emergencyemail']");
	private By ephone=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[5]/emergency-contacts[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/app-phone-input[1]/form[1]/ngx-intl-tel-input[1]/div[1]/input[1]");
	private By savedone=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-my-profile[1]/div[1]/div[1]/div[1]/div[1]/div[5]/emergency-contacts[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/button[2]");
	private By closeall =By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	
	private By Logout = By.xpath("//span[contains(text(),'Log Out')]");
	
	
	
		public accountmenupage(WebDriver driver) {
			this.driver=driver;
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public String getSharedwithmeTitle() {
			return driver.getTitle();
			
		}
		 
		
		
		public void accountmenu() throws InterruptedException {
			Thread.sleep(5000);
			WebElement AccountMenu=wait.until(ExpectedConditions.elementToBeClickable(accountmenu));
			AccountMenu.click();
			
		}
		
		
		public void myaccount() {
			WebElement myaccounts=wait.until(ExpectedConditions.elementToBeClickable(myaccount));
			myaccounts.click();
			
		}
		
		public void edit() {
			WebElement Edit=wait.until(ExpectedConditions.elementToBeClickable(edit));
			Edit.click();
			
			
		}
		
		
		public void fields() {
			WebElement Firstname=wait.until(ExpectedConditions.elementToBeClickable(firstname));
			Firstname.sendKeys("ramya");
			
			WebElement Lastname=wait.until(ExpectedConditions.elementToBeClickable(lastname));
			Lastname.sendKeys("tet");
			
			WebElement Changezipcode=wait.until(ExpectedConditions.elementToBeClickable(changezipcode));
			Changezipcode.sendKeys("50008");
			
			WebElement Phone=wait.until(ExpectedConditions.elementToBeClickable(phone));
			Phone.sendKeys("+18084815883");
			
		
		}
		
		
		public void savechange() throws InterruptedException {
			Thread.sleep(2000);
		
			//driver.findElement(savechange).click();
			 
			Thread.sleep(2000);
		
		}

		public void password() {
			WebElement Password=wait.until(ExpectedConditions.elementToBeClickable(password));
			Password.click();
			
			
		}
		
		public void current() {
			WebElement Currentpass=wait.until(ExpectedConditions.elementToBeClickable(currentpass));
			Currentpass.sendKeys("Password@123");
			
			
		}
		
		public void newpass() {
			WebElement Newpass=wait.until(ExpectedConditions.elementToBeClickable(newpass));
			Newpass.sendKeys("Password123@");
			
			
		}
		
		public void confirm() {
			WebElement Confirmpass=wait.until(ExpectedConditions.elementToBeClickable(confirmpass));
			Confirmpass.sendKeys("Password123@");
			
			
		}
		

		public void save() {
			WebElement Savechanges=wait.until(ExpectedConditions.elementToBeClickable(savechanges));
			Savechanges.click();
			
			
		}
		
		public void Executor() {
			WebElement executor=wait.until(ExpectedConditions.elementToBeClickable(Executor));
			executor.click();
			
			
		}
		
		public void fname() {
			WebElement Fname=wait.until(ExpectedConditions.elementToBeClickable(fname));
			Fname.sendKeys("ram");
			
			
		}
		
		public void lname() {
			WebElement Lname=wait.until(ExpectedConditions.elementToBeClickable(lname));
			Lname.sendKeys("test");
			
			
		}
		
		public void email() {
			WebElement Email=wait.until(ExpectedConditions.elementToBeClickable(email));
			Email.sendKeys("ramya26@yopmail.com");
			
		}
		
		public void executornumber() {
			WebElement executorphone=wait.until(ExpectedConditions.elementToBeClickable(Executorphone));
			executorphone.sendKeys("2015551846");
			
			
		}

		public void send() throws InterruptedException {
			WebElement Send=wait.until(ExpectedConditions.elementToBeClickable(send));
			Send.click();
			WebElement Close=wait.until(ExpectedConditions.elementToBeClickable(close));
			Close.click();
			
			
			
		}
		

		public void Emergencycontact() throws InterruptedException {
			WebElement emergencycontact=wait.until(ExpectedConditions.elementToBeClickable(Emergencycontact));
			emergencycontact.click();
			Thread.sleep(2000);
			WebElement Addanother=wait.until(ExpectedConditions.elementToBeClickable(addanother));
			Addanother.click();
			
		
			
			
		}
		
		
		public void efname() throws InterruptedException {
			Thread.sleep(3000);
			WebElement Efname=wait.until(ExpectedConditions.elementToBeClickable(efname));
			Efname.sendKeys("ramya");
			
			
		}
		public void elname() {
			WebElement Elname=wait.until(ExpectedConditions.elementToBeClickable(elname));
			Elname.sendKeys("test");
			
			
		}
		
		public void eemail() {
			WebElement Eemail=wait.until(ExpectedConditions.elementToBeClickable(eemail));
			Eemail.sendKeys("ramya24@yopmail.com");
			
			
		}
		
		public void ephone() {
			WebElement Ephone=wait.until(ExpectedConditions.elementToBeClickable(ephone));
			Ephone.sendKeys("2015551846");
			
			
		}
		
	    	public void savedone() throws InterruptedException {
			WebElement Savedone=wait.until(ExpectedConditions.elementToBeClickable(savedone));
			Savedone.click();
			WebElement Closeall=wait.until(ExpectedConditions.elementToBeClickable(closeall));
			Closeall.click();
			
			
		}
		
		
	    	public void logout() {
				WebElement logout=wait.until(ExpectedConditions.elementToBeClickable(Logout));
				logout.click();
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
