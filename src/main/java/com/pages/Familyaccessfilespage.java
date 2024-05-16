package com.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.PersonNameGenerator;


public class Familyaccessfilespage {
	
	
	private WebDriver driver;
	 private WebDriverWait wait;
	 String invitePersonName = PersonNameGenerator.generateRandomPersonName();
	
	private By Familyfiles=By.xpath("//span[contains(text(),'Family Access Files')]");
	private By addfolder=By.xpath("//span[contains(text(),'Add Folder')]");
	
	private By foldername=By.xpath("//input[@id='folder']");
	private By add=By.xpath("//button[contains(text(),'Add')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	private By newfoldername=By.xpath("//p[@class='mb-0 file_length' and text()='"+invitePersonName+"']");
	
	private By clickonfolder=By.xpath("//p[@class='mb-0' and text()='"+invitePersonName+"']");
	
	 public Familyaccessfilespage(WebDriver driver) {
			this.driver = driver;
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public String getFamilyaccessfilesPageTitle() {
			return driver.getCurrentUrl();
		}
		
		public void Familyfiles() throws InterruptedException {
			Thread.sleep(7000);
			WebElement familyfiles=wait.until(ExpectedConditions.elementToBeClickable(Familyfiles));
			familyfiles.click();
			driver.findElement(Familyfiles).click();
		}
	
		public void addfolder() {
			WebElement Addfolder=wait.until(ExpectedConditions.elementToBeClickable(addfolder));
			Addfolder.click();
			
		}
	
		public void foldername(String personName)  {
			WebElement Foldername=wait.until(ExpectedConditions.elementToBeClickable(foldername));
			Foldername.sendKeys(invitePersonName);
		
		}
	
		public void add()  {
			WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(add));
			Add.click();
			
		}
	
		public void close() throws InterruptedException {
			Thread.sleep(3000);
			WebElement Close=wait.until(ExpectedConditions.elementToBeClickable(close));
			Close.click();
			
		}
		public void newfoldername() throws InterruptedException {
			Thread.sleep(2000);
			WebElement Newfoldername=wait.until(ExpectedConditions.elementToBeClickable(newfoldername));
			Newfoldername.click();
			 
		}
		public void clickonfolder() throws InterruptedException
		{
			Thread.sleep(5000);
			WebElement Clickonfolder=wait.until(ExpectedConditions.elementToBeClickable(clickonfolder));
			Clickonfolder.click();
		}
}
