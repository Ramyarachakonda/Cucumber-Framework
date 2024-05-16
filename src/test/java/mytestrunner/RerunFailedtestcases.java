package mytestrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/failedrerun.txt"},
		glue= {"stepdefinition","Hooks"},
	    dryRun=	false,
	    publish=true,
	    monochrome=true,
		plugin={"pretty","html:target/CucumberReport.html",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    		"timeline:test-output-thread/",
	    		"rerun:target/failedrerun.txt"
		}
		)						   																																			
	    

public class RerunFailedtestcases {
	
	

}
