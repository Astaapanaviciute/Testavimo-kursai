import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PrisijungimasTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
    @AfterEach
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void prisijungtikSuUsernameTeisinguTest() {
        String url = driver.getCurrentUrl().replaceAll("https://", "");
        String username = "admin";
        String password = "admin1";
        String URL = "https://" + username  + ":" + password + "@" + url;
        driver.get(URL);
        assertThrows(NoSuchElementException.class, () -> driver.findElement(By.className("row")));
    }
    @Test
    public void prisijungtikSuPaswordTeisinguTest() {
        String url = driver.getCurrentUrl().replaceAll("https://", "");
        String username = "admin1";
        String password = "admin";
        String URL = "https://" + username  + ":" + password + "@" + url;
        driver.get(URL);
        assertThrows(NoSuchElementException.class, () -> driver.findElement(By.className("row")));
    }
    @Test
    public void prisijungtikSuSkaiciaisArbaAbuNeteisingiTest() {
        String url = driver.getCurrentUrl().replaceAll("https://", "");
        String username = "11111";
        String password = "111111";
        String URL = "https://" + username  + ":" + password + "@" + url;
        driver.get(URL);
        assertThrows(NoSuchElementException.class, () -> driver.findElement(By.className("row")));
    }
}
















