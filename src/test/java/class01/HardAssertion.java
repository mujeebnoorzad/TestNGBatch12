package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    WebDriver driver;

// go to syntax login
    // enter wrong creddentails
    // verify the message is "invalid credentials

    @BeforeMethod
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyCredentials() {

        String expectedText = "Invalid credentials ";
        WebElement Username = driver.findElement(By.id("txtUsername"));
        Username.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(text, expectedText);

        //assert if username text box is displayed

        boolean displayed = Username.isDisplayed();
        // assertion if it is actually displayed or not
        Assert.assertTrue(displayed);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
