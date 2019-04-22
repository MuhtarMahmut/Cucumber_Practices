package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"Steps"},
        dryRun = false,
        tags = {"@userstory1"},
        plugin = {}
                )

public class Runner1 {


}
