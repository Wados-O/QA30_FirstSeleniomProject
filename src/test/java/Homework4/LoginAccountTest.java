package Homework4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAccountTest extends TestBase {

  @Test
  public void loginExistAccountPositiveTest() {
    driver.findElement(By.cssSelector("[href='/login")).click();
    driver.findElement(By.cssSelector(".button-1.login-button")).click();
    driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("mezhinskiy@gmail.com");

    driver.findElement(By.name("Password")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys("vS#jD*YCQ7f5j");
    Assert.assertTrue(isElementPresent(By.className("buttons")));
  }

}
