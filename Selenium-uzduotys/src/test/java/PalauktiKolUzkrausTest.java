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

public class PalauktiKolUzkrausTest {
    WebDriver driver;
    @BeforeEach
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(1000);
    }
    @AfterEach
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void palauktiKolUzkrausTest() throws InterruptedException {
        WebElement startButton = driver.findElement(By.cssSelector("#start button"));
        Thread.sleep(1000);
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(1000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        Thread.sleep(1000);
        WebElement loadedContent = driver.findElement(By.id("finish"));
        Thread.sleep(1000);
        Assertions.assertFalse(Boolean.parseBoolean(loadedContent.getText()), "finish");

    }
}
















