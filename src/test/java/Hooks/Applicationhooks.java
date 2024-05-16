package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.base.Optional;
import com.qa.Utils.ConfigReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Applicationhooks {
	 private static WebDriver driver; // Make WebDriver instance static
	    private static boolean isBrowserInitialized = false; // Track if the browser is already initialized
	    private static DriverFactory driverFactory;
	    private static ConfigReader configReader;
	    private static Properties prop;

	    @Before(order = 0)
	    public void getProperty() {
	        if (!isBrowserInitialized) { // Initialize properties only if the browser is not initialized
	            configReader = new ConfigReader();
	            prop = configReader.init_prop();
	        }
	    }

	    @SuppressWarnings("static-access")
		@Before(order = 1)
	    public void launchBrowser() {
	        if (!isBrowserInitialized) { // Initialize browser only if it's not already initialized
	            String browserName = prop.getProperty("browser");
	            driverFactory = new DriverFactory();
	            driver = driverFactory.init_driver(browserName);
	            isBrowserInitialized = true; // Mark browser as initialized
	        }
	    }

//	    @After(order = 0)
//
//	    public void quitbrowser() {
//	        ThreadLocalScenario threadLocalScenario = ThreadLocalScenario.getInstance();
//	        if (threadLocalScenario != null && threadLocalScenario.getScenario() != null) {
//	            // Perform cleanup actions
//	            threadLocalScenario.getScenario().log("Browser is quitting.");
//	        }
//	    }

	    @After(order = 1)
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            // Take Screenshot:
	            String screenshotName = scenario.getName().replaceAll(" ", "_");
	            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(sourcePath, "image/png", screenshotName);
	        }
	    }

	    // Utility method to check if any scenario is running
	    @SuppressWarnings("unused")
		private boolean isScenarioRunning() {
	    	 Optional<Scenario> scenarioOptional = Optional.fromNullable(ThreadLocalScenario.getInstance().getScenario());
	    	    return scenarioOptional.isPresent();
	    }
	    
	  
	    
	    
	    public static class ThreadLocalScenario {
	        private final ThreadLocal<Scenario> scenarioThreadLocal = new ThreadLocal<>();

	        public void setScenario(Scenario scenario) {
	            scenarioThreadLocal.set(scenario);
	        }

	       

			public Scenario getScenario() {
	            return null;
	        }

	        public void removeScenario() {
	            scenarioThreadLocal.remove();
	        }



			public static ThreadLocalScenario getInstance() {
				return null;
			}
	}
	



	    



}
