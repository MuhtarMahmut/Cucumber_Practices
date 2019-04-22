package Steps;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearches {
    WebDriver driver;

    @Given("chrome browser is set up")
    public void chrome_browser_is_set_up() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @When("open the website")
    public void open_the_website() {
        System.out.println("Website already opened");
    }

    @Then("go to URL")
    public void go_to_URL() {
        driver.navigate().to("https://www.google.com");
    }

    @Then("page opens")
    public void page_opens() {
        System.out.println("Paged opened");

    }

    @Then("seach box is empty")
    public void seach_box_is_empty() {

    }

    @Then("type the keyword apple.")
    public void type_the_keyword_apple() {
        WebElement seachbox=driver.findElement(By.xpath("//input[@name='q']"));
        seachbox.sendKeys("apple");

    }

    @Then("type the keyword samsung")
    public void type_the_keyword_samsung() {
        WebElement seachbox=driver.findElement(By.xpath("//input[@name='q']"));
        seachbox.sendKeys("samsung");

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
    }

}
