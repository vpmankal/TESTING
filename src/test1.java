import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        try {
            // Your code here
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Initialize ChromeDriver with headless mode
        driver = new ChromeDriver(options);

        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception
        }

        
    }

    @Test
    public void testHeadlessBrowser() {
        // Replace with your test logic
        driver.get("https://www.example.com");
        System.out.println("Page title: " + driver.getTitle());
        // Add more test steps as needed
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test is complete
        if (driver != null) {
            driver.quit();
        }
    }
}
