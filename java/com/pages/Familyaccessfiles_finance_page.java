package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Familyaccessfiles_finance_page {
	
	private WebDriver driver;
	 private WebDriverWait wait;

	
	private By Familyfiles=By.xpath("//span[contains(text(),'Family Access Files')]");
	private By Finance=By.xpath("//p[contains(text(),'Finance')]");
	private By subscriber=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-files[1]/div[2]/div[1]/app-select-user[1]/div[1]/div[1]/a[1]");
	private By invoice=By.xpath("//p[contains(text(),'Invoice')]");
	private By add=By.xpath("//span[contains(text(),'Add')]");
	private By scandocument=By.xpath("//span[contains(text(),'scan document')]");
	private By clicktoupload=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/upload-document[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By done=By.xpath("//button[contains(text(),'Done')]");
	private By save = By.xpath("//button[contains(text(),'Save')]");
	
	
	 public Familyaccessfiles_finance_page(WebDriver driver) {
			this.driver = driver;
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public String getFamilyaccessfilesPageTitle() {
			return driver.getCurrentUrl();
		}
		
		public void Familyfiles() throws InterruptedException {
			Thread.sleep(5000);
			WebElement familyfiles=wait.until(ExpectedConditions.elementToBeClickable(Familyfiles));
			familyfiles.click();
}
		
		public void Finance() throws InterruptedException {
			WebElement finance=wait.until(ExpectedConditions.elementToBeClickable(Finance));
			finance.click();
}
		
		public void subscriber() throws InterruptedException {
			WebElement Subscriber=wait.until(ExpectedConditions.elementToBeClickable(subscriber));
			Subscriber.click();
}
		
		public void invoice() throws InterruptedException {
			Thread.sleep(2000);
			WebElement Invoice=wait.until(ExpectedConditions.elementToBeClickable(invoice));
			Invoice.click();
}
		
		public void add() throws InterruptedException {
			
			WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(add));
			Add.click();
}
		
		public void scandocument() throws InterruptedException {
		
			WebElement Scandocument=wait.until(ExpectedConditions.elementToBeClickable(scandocument));
			Scandocument.click();
}
		
		public void clicktoupload(String filePath) throws InterruptedException {
				

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement fileInput =driver.findElement(clicktoupload);
				
			        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
			        ((JavascriptExecutor) driver).executeScript(script, fileInput);
			        Thread.sleep(3000);
					fileInput.sendKeys(filePath);
			        Thread.sleep(3000);
			}
			


		public void done() throws InterruptedException {
			WebElement Done=wait.until(ExpectedConditions.elementToBeClickable(done));
			Done.click();
			Thread.sleep(8000);
			WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(save));
			Save.click();
}










}
