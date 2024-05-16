package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class securepasswordpage {
	
	private WebDriver driver;
	 private WebDriverWait wait;
	private By  clickonsecurepassword=By.xpath("//p[contains(text(),'Secure Password Storage')]");
	private By Clickonadd=By.xpath("//span[contains(text(),'Add')]");
	private By Title=By.xpath("//input[@id='password_title']");
	private By username=By.xpath("//input[@id='password_userName']");
    private By password=By.xpath("//input[@id='password_passcode']");
	private By Webaddress=By.xpath("//input[@id='password_webaddress']");
	private By save= By.xpath("//button[contains(text(),'Save')]");
	private By option=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-files[1]/div[2]/div[1]/password-manager[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/img[1]");
	private By edit=By.xpath("//span[contains(text(),'Edit')]");
	private By Personalvaultback=By.xpath("//a[contains(text(),'Personal Vault')]");
	
	
	
	
	public securepasswordpage(WebDriver driver) {
		this.driver=driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getGenerallegalTitle() {
		return driver.getTitle();
		
	}
	
	public void clickonsecurepassword() {
		WebElement Clickonsecurepassword=wait.until(ExpectedConditions.elementToBeClickable(clickonsecurepassword));
		Clickonsecurepassword.click();
		
		
	}
	
	public void Clickonadd() {
		WebElement clickonadd=wait.until(ExpectedConditions.elementToBeClickable(Clickonadd));
		clickonadd.click();
		
		
	}
	
	
	public void Title() {
		WebElement title=wait.until(ExpectedConditions.elementToBeClickable(Title));
		title.sendKeys("test");
		
	}
	
	
	
	public void username() {
		WebElement Username=wait.until(ExpectedConditions.elementToBeClickable(username));
		Username.sendKeys("ramya");
		
		
	}
	
	
	public void password() {
		WebElement Password=wait.until(ExpectedConditions.elementToBeClickable(password));
		Password.sendKeys("password");
		
		
	}
	
	public void Webaddress() {
		WebElement webaddress=wait.until(ExpectedConditions.elementToBeClickable(Webaddress));
		webaddress.sendKeys("test.com");
	
		
	}
	
	public void save() {
		WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(save));
		Save.click();
	
		
	}
	
	
	public void option() {
		WebElement Option=wait.until(ExpectedConditions.elementToBeClickable(option));
		Option.click();
		
		
	}
	
	
	
	public void edit() {
		WebElement Edit=wait.until(ExpectedConditions.elementToBeClickable(edit));
		Edit.click();
		
		
	}
	
	public void Title1() throws InterruptedException {
		WebElement title=wait.until(ExpectedConditions.elementToBeClickable(Title));
		title.sendKeys("test");
		WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(save));
		Save.click();
		WebElement personalvaultback=wait.until(ExpectedConditions.elementToBeClickable(Personalvaultback));
		personalvaultback.click();
		
		
	}
	
	
	
	
	
	
	

}
