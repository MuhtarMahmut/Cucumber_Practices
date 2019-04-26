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

        plugin = {"html:Reports/HTML" , "junit:Reports/Junit/MyJUnitReport.xml",
                    "usage:Reports/UsageReport/MyUsageReport.js",
                "pretty:Reports/PrettyReport/MyprettyReport.txt"}

                )

public class Runner1 {


}
