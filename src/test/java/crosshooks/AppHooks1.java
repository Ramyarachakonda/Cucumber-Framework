package crosshooks;



import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ConfigReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

	public class AppHooks1 {
		
		private DriverFactory driverFactory;
			private WebDriver driver;
			private ConfigReader configReader;
			Properties prop;
			
			@Before(order=0)
			public void getProperty() {
				configReader = new ConfigReader();
				prop = configReader.init_prop();
			}
			@SuppressWarnings("static-access")
			@Before(order=1)
			public void LaunchBrowser() {
				String browsername = prop.getProperty("browser");
				String browsername1 = prop.getProperty("browser1");
				String browsername2 = prop.getProperty("browser2");
				driverFactory = new DriverFactory();
				driver = driverFactory.init_driver(browsername);

			        switch (browsername.toLowerCase()) {
			            case "chrome":
			            	driver = driverFactory.init_driver("chrome");
			            	
			           
			            	driverFactory = new DriverFactory();
							driver = driverFactory.init_driver(browsername1);
			            	 switch (browsername1.toLowerCase()) { 
			            case "firefox":
			                driver =driverFactory.init_driver("firefox");
			                
			                driverFactory = new DriverFactory();
							driver = driverFactory.init_driver(browsername2);
			            	switch (browsername2.toLowerCase()) { 
			            case "edge":
			                driver =driverFactory.init_driver("edge");
			            
			            default:
			        }
			            	 }
			        }
			    } 
		

			@After(order=0)
			public void quitBrowser() {
				 driver.quit();
			}

		 
			@After(order=1)
			public void tearDown(Scenario scenario) {
				if(scenario.isFailed()) {
					//take Screenshot:
					String screenshotName = scenario.getName().replaceAll("","_");
					byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(sourcePath, "image/png", screenshotName);
				
					
				}
			}
			

		
		
		
	
		
		
	
			
			}

	    
	