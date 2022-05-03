package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Assignment1.feature",
            glue = "stepdef", 
            monochrome = true, 
            publish = true)
public class Runner1 extends AbstractTestNGCucumberTests {

}


