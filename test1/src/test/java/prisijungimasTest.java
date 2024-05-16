import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.*;


public class prisijungimasTest {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asta\\Desktop\\Testavimas\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("http://localhost:8080/prisijungti");
    }
    @AfterEach
    public void cleanUp() {
        //driver.quit();
    }
    @Test
    public void prisijungtiSuTeisingaisUser() throws InterruptedException{
        WebElement login = driver.findElement(By.cssSelector("input:nth-child(2)"));
        login.sendKeys("user");
        WebElement password = driver.findElement(By.cssSelector("input:nth-child(3)"));
        password.sendKeys("user");
        WebElement prisijungtiMygtukas = driver.findElement(By.cssSelector(".btn"));
        prisijungtiMygtukas.click();
        assertEquals("http://localhost:8080/", driver.getCurrentUrl());

        Thread.sleep(4000);
    }
    @Test
    public void prisijungtiSuTeisingaisAdmin() throws InterruptedException{
        WebElement login = driver.findElement(By.cssSelector("input:nth-child(2)"));
        login.sendKeys("admin");
        WebElement password = driver.findElement(By.cssSelector("input:nth-child(3)"));
        password.sendKeys("admin");
        WebElement prisijungtiMygtukas = driver.findElement(By.cssSelector(".btn"));
        prisijungtiMygtukas.click();
        assertEquals("http://localhost:8080/", driver.getCurrentUrl());
        Thread.sleep(2000);
    }
    @Test
    public void prisijungtiSuTeisingaisAlgis() throws InterruptedException{
        WebElement login = driver.findElement(By.cssSelector("input:nth-child(2)"));
        login.sendKeys("algis");
        WebElement password = driver.findElement(By.cssSelector("input:nth-child(3)"));
        password.sendKeys("algis");
        WebElement prisijungtiMygtukas = driver.findElement(By.cssSelector(".btn"));
        prisijungtiMygtukas.click();
        assertEquals("http://localhost:8080/", driver.getCurrentUrl());
        Thread.sleep(2000);
    }
    @Test
    public void prisijungtiSuTusciais() throws InterruptedException{
        WebElement login = driver.findElement(By.cssSelector("input:nth-child(2)"));
        login.sendKeys("");
        WebElement password = driver.findElement(By.cssSelector("input:nth-child(3)"));
        password.sendKeys("");
        WebElement prisijungtiMygtukas = driver.findElement(By.cssSelector(".btn"));
        prisijungtiMygtukas.click();
        assertEquals("http://localhost:8080/prisijungti?error", driver.getCurrentUrl());
        Thread.sleep(2000);
    }
    @Test
    public void prisijungtiSuGeruLoginBloguPass() throws InterruptedException{
        WebElement login = driver.findElement(By.cssSelector("input:nth-child(2)"));
        login.sendKeys("user");
        WebElement password = driver.findElement(By.cssSelector("input:nth-child(3)"));
        password.sendKeys("betkas");
        WebElement prisijungtiMygtukas = driver.findElement(By.cssSelector(".btn"));
        prisijungtiMygtukas.click();
        assertEquals("http://localhost:8080/prisijungti?error", driver.getCurrentUrl());
        Thread.sleep(2000);
    }

    @Test
    public void sukurtiNaujaPaskyra() throws InterruptedException{
        WebElement sukurtiButton = driver.findElement(By.linkText("Sukurti naują paskyrą"));
        sukurtiButton.click();
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("danielius");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("melyna");
        WebElement passwordConfirm = driver.findElement(By.cssSelector("#passwordConfirm"));
        passwordConfirm.sendKeys("melyna");
        WebElement sukurtibutton = driver.findElement(By.cssSelector(".btn"));
        sukurtibutton.click();
        WebElement usernameError = driver.findElement(By.cssSelector("#username\\.errors"));
        assertEquals("http://localhost:8080/registruoti", driver.getCurrentUrl());
        assertEquals("Toks vartotojo vardas jau egzistuoja", usernameError.getText());
        Thread.sleep(2000);

    }
    @Test
    public void sukurtiNaujaPaskyraSuTusciuPass() throws InterruptedException{
        WebElement sukurtiButton = driver.findElement(By.linkText("Sukurti naują paskyrą"));
        sukurtiButton.click();
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("lapas");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("");
        WebElement passwordConfirm = driver.findElement(By.cssSelector("#passwordConfirm"));
        passwordConfirm.sendKeys("");
        WebElement sukurtibutton = driver.findElement(By.cssSelector(".btn"));
        sukurtibutton.click();
        assertEquals("http://localhost:8080/registruoti", driver.getCurrentUrl());

        Thread.sleep(2000);

    }
    @Test
    public void sukurtiNaujaPaskyraSuTusciaisLoginPass() throws InterruptedException{
        WebElement sukurtiButton = driver.findElement(By.linkText("Sukurti naują paskyrą"));
        sukurtiButton.click();
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("");
        WebElement passwordConfirm = driver.findElement(By.cssSelector("#passwordConfirm"));
        passwordConfirm.sendKeys("");
        WebElement sukurtibutton = driver.findElement(By.cssSelector(".btn"));
        sukurtibutton.click();
        assertEquals("http://localhost:8080/registruoti", driver.getCurrentUrl(), "Šį laukelį būtina užpildyti. Privaloma įvesti nuo 3 iki 32 simbolių");

        Thread.sleep(2000);
    }

    @Test
    public void skaiciuotuvasSudetisTest() throws InterruptedException {
        prisijungtiSuTeisingaisUser();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("6");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("3");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(0);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement teisingasAts = driver.findElement(By.cssSelector("body > h4"));
        assertEquals("6 + 3 = 9", teisingasAts.getText());
        Thread.sleep(2000);
    }
    @Test
    public void skaiciuotuvasSudetisSuNeigiamaisTest() throws InterruptedException {
        prisijungtiSuTeisingaisUser();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("-100");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("-100");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(0);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement error = driver.findElement(By.cssSelector(".error"));
        assertEquals("http://localhost:8080/skaiciuoti", driver.getCurrentUrl());
        assertEquals("Validacijos klaida: skaičius negali būti neigiamas", error.getText());
        assertTrue(error.isDisplayed());
        Thread.sleep(2000);
    }
    @Test
    public void skaiciuotuvasAtimtisTest() throws InterruptedException {
        prisijungtiSuTeisingaisUser();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("600");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("50");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(1);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement teisingasAts = driver.findElement(By.cssSelector("body > h4"));
        assertEquals("600 - 50 = 550", teisingasAts.getText());
        Thread.sleep(2000);
    }
    @Test
    public void skaiciuotuvasAtimtisIs0Test() throws InterruptedException {
        prisijungtiSuTeisingaisAlgis();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("0");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("500000");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(1);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement teisingasAts = driver.findElement(By.cssSelector("body > h4"));
        assertEquals("0 - 500000 = -500000", teisingasAts.getText());
        Thread.sleep(2000);
    }
    @Test
    public void skaiciuotuvasDaugybaTest() throws InterruptedException {
        prisijungtiSuTeisingaisUser();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("15");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("14");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(2);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement teisingasAts = driver.findElement(By.cssSelector("body > h4"));
        assertEquals("15 * 14 = 210", teisingasAts.getText());
        Thread.sleep(2000);
    }
    @Test
    public void skaiciuotuvasDalybaTest() throws InterruptedException {
        prisijungtiSuTeisingaisAdmin();
        WebElement pirmasSkaicius = driver.findElement(By.cssSelector("#sk1"));
        pirmasSkaicius.clear();
        pirmasSkaicius.sendKeys("400");
        WebElement antrasSkaicius = driver.findElement(By.cssSelector("#sk2"));
        antrasSkaicius.clear();
        antrasSkaicius.sendKeys("12");
        WebElement operacijosZenklas = driver.findElement(By.cssSelector("#number > select"));
        Select select = new Select(operacijosZenklas);
        select.selectByIndex(3);
        WebElement skaiciuotiButton = driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)"));
        skaiciuotiButton.click();
        WebElement teisingasAts = driver.findElement(By.cssSelector("body > h4"));
        assertEquals("400 / 12 = 33", teisingasAts.getText());
        Thread.sleep(2000);
    }
    @Test
    public void logOutTest() throws InterruptedException{
        prisijungtiSuTeisingaisUser();
        WebElement logout = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right > a"));
        logout.click();
        WebElement sekmingaiAtsijungete = driver.findElement(By.cssSelector("span:nth-child(1)"));
        assertEquals("http://localhost:8080/prisijungti?logout", driver.getCurrentUrl());
        assertEquals("Sėkmingai atsijungėte", sekmingaiAtsijungete.getText());
        assertTrue(sekmingaiAtsijungete.isDisplayed());
    }

    @Test
    public void pakeitimaiAtliktosOperacijosDalyje() throws InterruptedException {
        prisijungtiSuTeisingaisAdmin();
        WebElement atliktosOperacijosButton = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-left > li > a"));
        atliktosOperacijosButton.click();
        WebElement rodytiButton = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(5) > a:nth-child(3)"));
        rodytiButton.click();
        assertEquals("http://localhost:8080/rodyti?id=16", driver.getCurrentUrl());
        WebElement atgalButton = driver.findElement(By.cssSelector("body > a"));
        atgalButton.click();
        WebElement keistiButton = driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(5) > a:nth-child(1)"));
        keistiButton.click();
        assertEquals("http://localhost:8080/atnaujinti?id=17", driver.getCurrentUrl());
        WebElement skaicius1 = driver.findElement(By.cssSelector("input[type=number]"));
        skaicius1.clear();
        skaicius1.sendKeys("15");
        WebElement zenklasButton = driver.findElement(By.cssSelector("p:nth-child(3) > input[type=text]"));
        zenklasButton.clear();
        zenklasButton.sendKeys("*");
        WebElement skaicius2 = driver.findElement(By.cssSelector("p:nth-child(4) > input[type=number]"));
        skaicius2.clear();
        skaicius2.sendKeys("30");
        WebElement rez = driver.findElement(By.cssSelector("p:nth-child(5) > input[type=number]"));
        rez.clear();
        rez.sendKeys("450");
        WebElement atnaujintiButton = driver.findElement(By.cssSelector("p:nth-child(6) > input[type=submit]"));
        atnaujintiButton.click();
        assertEquals("http://localhost:8080/rodyti?id=17", driver.getCurrentUrl());
    }
    @Test
    public void istrintiIsAtliktosOperacijosTest() throws InterruptedException {
        prisijungtiSuTeisingaisUser();
        WebElement atliktosOperacijosButton = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-left > li > a"));
        atliktosOperacijosButton.click();
        WebElement trintiButton = driver.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(5) > a:nth-child(2)"));
        trintiButton.click();
        assertEquals("http://localhost:8080/skaiciai", driver.getCurrentUrl());
    }
}






















