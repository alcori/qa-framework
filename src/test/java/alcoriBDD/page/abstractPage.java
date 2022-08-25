package alcoriBDD.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static alcoriBDD.driver.DriverManager.getDriver;
import static com.codeborne.selenide.Selenide.$;

public class abstractPage {
    static WebDriver driver = getDriver();
    private static String URL;

    public abstractPage(WebDriver driver) {
    }

    public abstractPage() {
    }

    public void openPage() {
    }

    public void clickButton(String text) {
        $(By.xpath("//div[text]")).click();
    }
}
