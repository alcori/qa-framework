package alcoriBDD.page;

import alcoriBDD.page.abstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage extends abstractPage {
    private static final String URL = "https://cloud.google.com/";

    public mainPage() {
        super(driver);
        PageFactory.initElements(abstractPage.driver, this);
    }

    @Override
    public void openPage(){
        driver.navigate().to(URL);
    }
}
