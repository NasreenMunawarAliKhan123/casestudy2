package cucumbercs;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:src/test/java/cucumbercs/cucumber.json"})

public class runner {

}
