package stepsDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/sport.feature",
        glue={"stepsDefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}

