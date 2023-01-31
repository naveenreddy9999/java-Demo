package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"StepDef"},
        tags = "@google"
)

public class TestRunner_Junit {


}
