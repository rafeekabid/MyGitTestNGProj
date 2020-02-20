package Junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Features/Login.feature", glue= {"Step_Definition"},dryRun=false, tags= {"@Log"})
public class JunitRunner {
	

}
