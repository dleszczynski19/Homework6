import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WebsiteTest {
    private WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initializeDriver() {
        driver = new ChromeDriver(new ChromeOptions().addArguments("headless"));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    @Tag("Regression")
    @DisplayName("Website title test")
    public void websiteTitleTest(String displayName, String websiteAddress, String expectedTitle) {
        driver.get("https://" + websiteAddress);
        System.out.println(displayName);
        assertThat("Wrong title!", driver.getTitle(), equalTo(expectedTitle));
    }
}
