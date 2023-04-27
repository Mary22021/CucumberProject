package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Epay_home_steps {
    WebDriver driver ;

    @Given("je suis sur ebay page accuil")
    public void method_accuil() {
        System.out.println("je suis sur ebay page accuil");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://www.ebay.fr/sch/ebayadvsearch");
        driver.get("https://www.ebay.com");
    }
    @When("je clique sur le lien Recherche avancee")
    public void method_recherche_avancee() {
        System.out.println("je clique sur le lien Recherche avancee");
                driver.findElement(By.id("gh-as-a")).click();
    }
    @Then("je navigue vers la page recheche avancee")
    public void method_navigation() {
        System.out.println("je navigue vers la page recheche avancee");
        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearch";
//        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearch1";
        String actuelUrl = driver.getCurrentUrl();
        Assert.assertEquals("l url n est pas correct ",expectedUrl,actuelUrl);
    }

}
