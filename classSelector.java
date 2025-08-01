package testing;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class classSelector {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        driver.navigate().to("https://www.flipkart.com/account/login?ret=/");

        WebElement phoneInput = driver.findElement(By.className("r4vIwl")); // May not work reliably
        phoneInput.sendKeys("8919570112");

        WebElement requestOTPButton = driver.findElement(By.cssSelector(".QqFHMw.twnTnD._7Pd1Fp"));
        requestOTPButton.click();
        driver.quit();
    }
}
