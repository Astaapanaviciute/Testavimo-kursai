import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
    WebDriver driver;
    @BeforeEach
    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);
    }
    @AfterEach
    public void cleanup() {
        driver.quit();
    }
    @Test// naudojant matoma teksta
    public void dropdowTestas() throws InterruptedException{
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Assertions.assertFalse(dropdownElement.isSelected(), "Please select an option");
        Thread.sleep(1000);
        dropdownElement.click();
        Thread.sleep(1000);
        Select dropdownSelect = new Select(dropdownElement);
        dropdownSelect.selectByVisibleText("Option 1");
        WebElement selectedOption = dropdownSelect.getFirstSelectedOption();
        Assertions.assertTrue(selectedOption.isSelected(), "Option 1");
        Thread.sleep(2000);

        Select dropdownSelect1 = new Select(dropdownElement);
        dropdownSelect1.selectByVisibleText("Option 2");
        WebElement selectedOption1 = dropdownSelect1.getFirstSelectedOption();
        Assertions.assertTrue(selectedOption1.isSelected(), "Option 2");
        Thread.sleep(2000);
    }
    @Test//naudojant index
    public void dropdowTestas2() throws InterruptedException {
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Assertions.assertFalse(dropdownElement.isSelected(), "Please select an option");
        Thread.sleep(1000);
        dropdownElement.click();
        Thread.sleep(1000);
        Select dropdownSelect = new Select(dropdownElement);
        dropdownSelect.selectByIndex(1);
        WebElement selectedOption = dropdownSelect.getFirstSelectedOption();
        Assertions.assertFalse(Boolean.parseBoolean(selectedOption.getText()), "Option 1");
        Thread.sleep(1000);
    }
    @Test//naudojant index
    public void dropdowTestas3() throws InterruptedException {
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Assertions.assertFalse(dropdownElement.isSelected(), "Please select an option");
        Thread.sleep(1000);
        dropdownElement.click();
        Thread.sleep(1000);
        Select dropdownSelect = new Select(dropdownElement);
        dropdownSelect.selectByIndex(2);
        WebElement selectedOption = dropdownSelect.getFirstSelectedOption();
        Assertions.assertFalse(Boolean.parseBoolean(selectedOption.getText()), "Option 2");
        Thread.sleep(1000);
    }
}















