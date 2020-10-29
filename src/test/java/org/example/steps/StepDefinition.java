package org.example.steps;

import cucumber.api.java.ru.Тогда;
import org.example.CucumberRunner;
import org.testng.Assert;

public class StepDefinition {
    @Тогда("Тестовый шаг")
    public void testStep(){
        System.out.println("Это тестовый шаг");
        Assert.assertTrue(true);
    }
}
