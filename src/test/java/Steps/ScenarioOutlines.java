package Steps;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ScenarioOutlines {
    WebDriver driver;
    @Given("user should go the website {string}")
    public void user_should_go_the_website(String string) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to(string);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("User Searches {string}")
    public void user_Searches(String string) {
        WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys(string+ Keys.ENTER);
    }

    @Then("the data will dispay and browser closes")
    public void the_data_will_dispay_and_browser_closes() {
        new Actions(driver).pause(5000).perform();
        driver.close();

    }

}
