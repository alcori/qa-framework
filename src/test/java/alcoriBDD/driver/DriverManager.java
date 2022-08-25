package alcoriBDD.driver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class DriverManager {
    private static WebDriver driver;
    private static final ResourceBundle browserBundle = ResourceBundle.getBundle("browsers");

    public static WebDriver getDriver() {
        if (browserBundle.getString("testdata.browser.type").equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserBundle.getString("testdata.browser.type").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browserBundle.getString("testdata.browser.customWindows").equals("true")) {
            driver.manage().window().setSize(new Dimension(parseInt(browserBundle.getString("testdata.browser.width")), parseInt(browserBundle.getString("testdata.browser.height"))));
        } else {
            driver.manage().window().maximize();
        }
        return driver;
    }

    @After
    public static void stopDrive() {
        driver.quit();
    }
}
