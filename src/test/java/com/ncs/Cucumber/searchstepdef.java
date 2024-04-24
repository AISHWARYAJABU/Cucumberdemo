package com.ncs.Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class searchstepdef {
    WebDriver driver;
    
    @BeforeClass
    public void init() {
     driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
   

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage()  {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String query) throws InterruptedException {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        driver.findElement(By.name("q")).sendKeys("TestNG");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() throws InterruptedException {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        Assert.assertTrue(driver.getTitle().contains("Google Search"));
        Thread.sleep(3000);
        driver.quit();
        
    }
}
