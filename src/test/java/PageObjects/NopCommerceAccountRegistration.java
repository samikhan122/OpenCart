package PageObjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NopCommerceAccountRegistration extends BasePage {
    public NopCommerceAccountRegistration(WebDriver driver) {
        super(driver);
    }

   public Faker faker = new Faker();


    By registerLink = By.xpath("//a[text()='Register']");
    By gender = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.xpath("//input[@id='Email']");
    By company = By.xpath("//input[@id='Company']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[text()='Register']");
    By registerButtonFinal = By.xpath("//button[text()='Register']");

    By registerLinkConfirm = By.xpath("//div[text()='Your registration completed']");


    public void clickOnRegisterToRegister() throws InterruptedException {
        driver.findElement(registerLink).click();
        Thread.sleep(3000);

    }

    public void gender() throws InterruptedException {
        driver.findElement(gender).click();
        Thread.sleep(3000);
    }

    public void firstName() throws InterruptedException {
        driver.findElement(firstName).sendKeys(faker.name().lastName());
        Thread.sleep(3000);
    }

    public void lastName() throws InterruptedException {
        driver.findElement(lastName).sendKeys(faker.name().firstName());
        Thread.sleep(3000);
    }

    public void dateOfBirthDay() throws InterruptedException {
        driver.findElement(lastName).click();
        WebElement slct = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select dropDown = new Select(slct);
        dropDown.selectByValue("3");
        Thread.sleep(3000);
    }

    public void dateOfBirthMonth() throws InterruptedException {
        driver.findElement(lastName).click();
        WebElement slct = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select dropDown = new Select(slct);
        dropDown.selectByValue("3");
        Thread.sleep(3000);

    }

    public void dateOfBirthYear() throws InterruptedException {
        driver.findElement(lastName).click();
        WebElement slct = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select dropDown = new Select(slct);
        dropDown.selectByValue("1995");
        Thread.sleep(3000);
    }

    public void email() throws InterruptedException {
        faker = new Faker();
        String email2 = faker.bothify("###?????");
        driver.findElement(email).sendKeys(email2+"@gmail.com");
        Thread.sleep(3000);
    }

    public void company() throws InterruptedException {
        driver.findElement(lastName).click();
        Thread.sleep(3000);
    }

    public void password() throws InterruptedException {
        driver.findElement(password).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(confirmPassword).sendKeys("123456789");


    }
    public void registerButtonFinal() throws InterruptedException {
        driver.findElement(registerButtonFinal).click();
        Thread.sleep(3000);
    }
    public void confirmRegisteration() throws InterruptedException {
        Thread.sleep(3000);
        boolean status = driver.findElement(registerLinkConfirm).isDisplayed();
       Assert.assertTrue(status,"Registration successful");
    }
}