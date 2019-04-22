package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"Steps"},
        dryRun = true,
        tags = {"@userstory2"},
        plugin = {}
)

public class Runner2 {
}
