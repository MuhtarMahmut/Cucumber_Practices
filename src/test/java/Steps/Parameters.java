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

public class Parameters {
    WebDriver driver;

    @Given("browser is ready, website is uploaded")
    public void browser_is_ready_website_is_uploaded() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enters {string}")
    public void user_enters(String data) {
        WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys(data+ Keys.ENTER);

    }

    @Then("google searches apple and close the browser.")
    public void google_searches_apple_and_close_the_browser() {
            new Actions(driver).pause(5000).perform();
            driver.close();
    }

}
