package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},  // defines the feature package(or file).
        glue = {"Steps"},   // defines where the step definition packge is at.
        dryRun = false,     // true: it only runs the feature file(tell you shich step is missing).
        // .   false: runs the step definition, then the feature files
        // if there is any new steps added to specific scenario, then we will have to make the dryRun true.
        tags = {"@UserStory3"},    // decides which feature file(s)  or which scenario(S)
        // if the tag is on top featurefile:  runs the whole scenarios within that feature file.
        // if the tag is on top of the scenario: that specific scenario(s)
        plugin = {"html:Reports"}       // generate reports.  in plugin:  what reports:location
)

public class Runner3 {

    public static void main(String[] args) {








    }




}
