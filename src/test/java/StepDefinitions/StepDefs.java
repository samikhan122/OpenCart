package StepDefinitions;

import PageObjects.AccountRegistration;
import PageObjects.BasePage;
import PageObjects.HomePage;
import PageObjects.NopCommerceAccountRegistration;
import TestCases.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class StepDefs {

    WebDriver driver;
    HomePage hp;
    public static NopCommerceAccountRegistration tp;

    BasePage bp;
    BaseClass bc;


    @Given("Open Browser {string}")
    public void loginToNopEcommerce(String arg0) throws InterruptedException {
        bp = new BasePage(driver);
        //bc = new BaseClass();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(arg0);
        //np.clickOnRegisterToRegister();
    }


    @Then("Enter the information to register")
    public void enter_the_infromation_to_register() throws InterruptedException {
        tp = new NopCommerceAccountRegistration(driver);
        tp.clickOnRegisterToRegister();
        tp.gender();
        tp.firstName();
        tp.lastName();
        tp.dateOfBirthDay();
        tp.dateOfBirthMonth();
        tp.dateOfBirthYear();
        tp.email();
        tp.company();
        tp.password();
        tp.registerButtonFinal();

    }

    @Then("click on register once all the information has been entered")
    public void click_on_register_once_all_the_information_has_been_entered() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("assert the data and close the browser")
    public void assert_the_data_and_close_the_browser() {
        throw new io.cucumber.java.PendingException();
    }


    @Given("User launches browswer")
    public void userLaunchesBrowswer() {
    }

    @And("close the browser")
    public void closeTheBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Then("assert the data")
    public void assertTheData() throws InterruptedException {
        tp = new NopCommerceAccountRegistration(driver);
        tp.confirmRegisteration();
    }
}
