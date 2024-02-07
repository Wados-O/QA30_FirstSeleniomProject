package com.ait.qa30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    //driver.get("https://www.google.com");
    driver.navigate().to("https://www.google.com");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();

  }

  @Test
  public void openGoogle() {
    System.out.println("Seit opened");
  }

  @AfterMethod(enabled = false)
  public void tearDown() {
    //driver.quit();
    driver.close();
  }
}
