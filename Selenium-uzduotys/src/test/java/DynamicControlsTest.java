import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicControlsTest {
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
    public void dynamicControlTest() throws InterruptedException {
        WebElement startButton = driver.findElement(By.cssSelector("form#checkbox-example > button"));
        Thread.sleep(1000);
        startButton.click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        WebElement loadedContent = driver.findElement(By.id("message"));
        String initialContent = loadedContent.getText();
        Thread.sleep(2000);
        startButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        WebElement reLoadedContent = driver.findElement(By.id("message"));
        String newContent = reLoadedContent.getText();
        Thread.sleep(2000);
        Assert.assertNotEquals(initialContent, newContent, "Turinys nebuvo sėkmingai perkrautas");

    }

}












