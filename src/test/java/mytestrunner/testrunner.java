package mytestrunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features/Familymember.feature"},
		glue= {"stepdefinition","Hooks"},
	    dryRun=	false,
	    
	    publish=true,
		plugin={"pretty","html:target/CucumberReport.html",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		}
		)
	    		

//dryRun=true;
//dryRun=false;
public class testrunner {
	
	
}	

//	private static WebDriver driver;
//@DataProvider(parallel=false)
//    public Object[][] scenarios(){
//		return null; 
//
//    // Override after method to quit the WebDriver after scenario execution
//    @AfterClass
//    public static void tearDown() {
//        if (driver != null) {
//        	
//        	System.out.println("Browser Closed if I put driver.quit here");
//            driver.quit();
//        }
//    }
	






