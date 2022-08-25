package alcoriBDD;

import alcoriBDD.page.mainPage;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    @Given("Go to main page")
    public void goToMainPage() { new mainPage().openPage();
    }
}
