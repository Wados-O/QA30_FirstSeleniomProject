package com.ait.qa30;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeworkFindElements {

//Создайте, пожалуйста, новый тестовый класс и найти 10 элементов
// на странице. Для этого следует создать два тестовых метода: один
// будет искать
// элементы по cssSelector, а второй те же самые элементы, но по xPath.


  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

  @Test
  public void findCssSelectors() {

    List<WebElement> elements = driver.findElements(By.cssSelector("div"));
    System.out.println("Elements CssSelectors found " + elements.size());
    for (WebElement element :
        elements) {
      System.out.println(element.getText());
    }
  }

  @Test
  public void findXpathElements(){
    List<WebElement> elements = driver.findElements(By.xpath("//div"));
    System.out.println("Elements xpath found " + elements.size());
    for (WebElement element : elements){
      System.out.println(element.getText());
    }
  }


  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
