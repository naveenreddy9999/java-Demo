package testRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"features"},
        glue = {"StepDef"},
        tags = "@google"
)

public class TestRunner_TestNg extends AbstractTestNGCucumberTests {


}
