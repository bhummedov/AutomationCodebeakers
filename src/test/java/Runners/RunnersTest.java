package Runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class RunnersTest {

    @RunWith(Cucumber.class) // Instructs junit to run this class as a Cucumber test runner
    @CucumberOptions(
            dryRun = false, // executes the features and validates whether features exist without failing
            features = "src\\test\\features", //location of the features file folder
            glue = {"stepDefs"}, //location of the step definition classes
            //tags = "@multiparams or @doublequoteparams or @doublequoteparam1 or @wordparam", //to run multiple tags
            //tags = "@radiosselection",
            plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
    )
    public class RunCukesTest {
    }
}
