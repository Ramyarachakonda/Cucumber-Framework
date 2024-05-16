package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tpapage {
	
	 private WebDriver driver;
	  private WebDriverWait wait;
	  
	private By advisor=By.xpath("//span[contains(text(),'Invite Your Advisors')]");
	
   private By invite=By.xpath("//span[contains(text(),'Invite Advisor')]");

  private By name=By.xpath("//input[@id='advisorName']");

private By  emailAdd=By.xpath("//input[@id='advisorEmail']");

private By send=By.xpath("//button[contains(text(),'Send invite')]");

public tpapage(WebDriver driver) {
    this.driver = driver;
  this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
}



public void clickOnTPA() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Advisor=	wait.until(ExpectedConditions.elementToBeClickable(advisor));
	Advisor.click();

}

public void clickOnInviteadvisor() {
	WebElement Invite=	wait.until(ExpectedConditions.elementToBeClickable(invite));
	Invite.click();


	}

public void name() {
	WebElement Name=	wait.until(ExpectedConditions.elementToBeClickable(name));
	Name.sendKeys("test");

	}

public void enterInvitePersonEmail(String email) {
	driver.findElement(emailAdd).sendKeys(email);

	}

public void send() {
	WebElement Send=wait.until(ExpectedConditions.elementToBeClickable(send));
	Send.click();

	}




}
