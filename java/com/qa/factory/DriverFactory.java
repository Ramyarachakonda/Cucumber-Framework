package com.qa.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
	
	public WebDriver driver;
	
	
	   private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	   
	    // This Method is used to initialize the threadLocal driver based on the given browser
	    public static WebDriver init_driver(String browser) {
	 
	        System.out.println("browser value is :" + browser);
	 
	        if (browser.contains("chrome")) {
	            tlDriver.set(new ChromeDriver());
	        } else if (browser.contains("firefox")) {
	            tlDriver.set(new FirefoxDriver());
	        } else if (browser.contains("edge")) {
	            tlDriver.set(new EdgeDriver());
	        } else {
	            System.out.println("Please pass the correct browser value: " + browser);
	        }
	 
	        getDriver().manage().deleteAllCookies();
	        getDriver().manage().window().maximize();
	        return getDriver();
	    }
	 
	    // This is used to get the driver with ThreadLocal
	    public static synchronized WebDriver getDriver() {
	        return tlDriver.get();
	    }
	}
	
	
