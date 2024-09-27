package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;
    @Before
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(){

    }
}
