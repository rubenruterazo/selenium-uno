package com.example.selenium_uno;// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class WandavisionTestHub {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444"), DesiredCapabilities.firefox());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void wandavision() {
    // Test name: wandavision
    // Step # | name | target | value
    // 1 | open | https://www.imdb.com/ | 
    driver.get("https://www.imdb.com/");
    // 2 | setWindowSize | 802x817 | 
    driver.manage().window().setSize(new Dimension(802, 817));
    // 3 | waitForElementVisible | id=suggestion-search | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestion-search")));
    }
    // 4 | click | id=suggestion-search | 
    driver.findElement(By.id("suggestion-search")).click();
    // 5 | type | id=suggestion-search | wandavision
    driver.findElement(By.id("suggestion-search")).sendKeys("wandavision");
    // 6 | sendKeys | id=suggestion-search | ${KEY_ENTER}
    driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);

      {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".findSection:nth-child(3) > .findList")));
      }

    // 7 | waitForElementVisible | linkText=WandaVision | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("WandaVision")));
    }
    // 8 | click | linkText=WandaVision | 
    driver.findElement(By.linkText("WandaVision")).click();
    // 9 | waitForElementVisible | linkText=TRIVIA | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("TRIVIA")));
    }
    // 10 | click | linkText=TRIVIA | 
    driver.findElement(By.linkText("TRIVIA")).click();
  }
}
