import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxTest {
    WebDriver driver;

    @BeforeEach
    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(1000);

    }
    @AfterEach
    public void cleanup() {
        driver.quit();
    }
    @Test
    public void checkBoxTest() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        Assertions.assertFalse(checkbox.isSelected(), "Checkboksas pradzioje nepazymetas");
        checkbox.click();
        Thread.sleep(1000);
        Assertions.assertTrue(checkbox.isSelected(), "Chekboksas turetu buti pazymetas po click");
        checkbox.click();
        Assertions.assertFalse(checkbox.isSelected(), "Chekboksas turetu buti nepazymetas po unclick");
        Thread.sleep(2000);
    }
    @Test
    public void checkBox2Test() throws InterruptedException {
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        Assertions.assertTrue(checkbox2.isSelected(), "2 checkbox pradzioje yra pazymetas");
        checkbox2.click();
        Thread.sleep(1000);
        Assertions.assertFalse(checkbox2.isSelected(), "2 checkbox po click turi buti nepazymetas");
        checkbox2.click();
        Thread.sleep(1000);
        Assertions.assertTrue(checkbox2.isSelected(), "2 checkbox turi buti nepazymetas po unclick");
        Thread.sleep(2000);

    }
}













