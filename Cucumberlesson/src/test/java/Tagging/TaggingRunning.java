package Tagging;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class) 
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
tags= {"@Signup-DataDriven"})
public class TaggingRunning {

}
