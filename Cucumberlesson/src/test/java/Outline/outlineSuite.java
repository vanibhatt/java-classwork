package Outline;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class) 
@CucumberOptions(format = {"pretty", "html:target/cucumber"})
public class outlineSuite {

}
