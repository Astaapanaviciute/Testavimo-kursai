import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DCEnableDisableTest {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com/dynamic_controls");
    }
    @AfterEach
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void dynamicControlEnableDisableTest() throws InterruptedException {
        WebElement button = driver.findElement(By.cssSelector("form#input-example > button"));
        Thread.sleep(1000);
        button.click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        WebElement loadedText = driver.findElement(By.id("message"));
        String initialText = loadedText.getText();
        Thread.sleep(2000);
        button.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        WebElement reloadedText = driver.findElement(By.id("message"));
        String newText = reloadedText.getText();
        Thread.sleep(2000);
        Assert.assertNotEquals(initialText, newText, "Turinys nepasikeitė po mygtuko paspaudimo");
    }

}







