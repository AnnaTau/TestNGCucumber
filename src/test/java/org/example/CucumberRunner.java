package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions(strict = true, monochrome = true,
        plugin = {"pretty"},
        features = {"features"},
        glue = {"src/test/java/org/example/steps/StepDefinition.java"},
        tags = {"@test_rre"})
public class CucumberRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "Cucumber", description = "Runs Cucumber Feature")
    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        try {
            testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
