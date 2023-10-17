package TestCases;

import PageObjects.NopCommerceAccountRegistration;
import org.testng.annotations.Test;

public class NOP_Commerce extends BaseClass{


    @Test
    public void test001_Login() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        NopCommerceAccountRegistration tp = new NopCommerceAccountRegistration(driver);
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
}
