package Apphooks;
 

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ConfigReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

 
public class ApplicationHooks {

	 DriverFactory driverFactory;
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
			driverFactory = new DriverFactory();
			driver = driverFactory.init_driver(browsername);
		}

		@After(order=0)
		public void quitBrowser() {
			// driver.quit();
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


	    

