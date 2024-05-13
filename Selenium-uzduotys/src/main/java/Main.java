import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        testPrisijungima(driver);
    }
    public static void testPrisijungima(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        String url = driver.getCurrentUrl().replaceAll("https://", "");
        String username = "admin";
        String password = "admin";
        String URL = "https://" + username  + ":" + password + "@" + url;
        driver.get(URL);
    }
}
