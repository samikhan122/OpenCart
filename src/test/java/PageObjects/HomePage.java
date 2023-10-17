package PageObjects;

import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement lnkMyaccount;

    @FindBy(linkText = "Register")
    WebElement lnkRegister;

    // Action Methods
    public void clickMyAccount() {
        lnkMyaccount.click();
    }

    public void clickRegister() {
        lnkRegister.click();
    }


}