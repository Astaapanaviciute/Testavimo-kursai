import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TemptiObjektusTest {
    WebDriver driver;
    @BeforeEach
    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(500);
    }
    @AfterEach
    public void cleanup() {
        driver.quit();
    }
    @Test
    public void temptiObjektusTest() throws InterruptedException {
        WebElement sourceElement = driver.findElement(By.id("column-a"));
        WebElement targetElement = driver.findElement(By.id("column-b"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        Thread.sleep(1000);
    }
    @Test
    public void temptiObjektusTest2() throws InterruptedException {
        WebElement targetElement = driver.findElement(By.id("column-b"));
        WebElement sourceElement = driver.findElement(By.id("column-a"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(targetElement, sourceElement).build().perform();
        Thread.sleep(1000);
    }
}



















