package Homework4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
  @BeforeMethod
  public void setUp() {
    super.setUp();
    login("mezhinskiy@gmail.com", "vS#jD*YCQ7f5j"); // Вызов метода логина
  }
  @Test
  public void addProductToCartTest() {
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.cssSelector("div.product-item[data-productid='31'] .product-box-add-to-cart-button")).click();
    pause(1000);
    driver.get("https://demowebshop.tricentis.com/cart");


    Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(), '14.1-inch Laptop')]")));
  }
}
