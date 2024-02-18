package Homework4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/home");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


  }
  public void pause(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  @AfterMethod
  public void tearDown() {
    driver.quit();

  }
  public void login(String email, String password) {
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.name("Email")).sendKeys(email);
    driver.findElement(By.name("Password")).sendKeys(password);
    driver.findElement(By.cssSelector(".button-1.login-button")).click();
  }
  public boolean isElementPresent(By locator) {
    return driver.findElements(locator).size() > 0;
  }

}
