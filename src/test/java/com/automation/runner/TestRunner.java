package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.swing.text.html.Option;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.automation.steps",
        plugin = {"html:target/report.html","json:target/cucumber.json"}

)
public class TestRunner {

}
