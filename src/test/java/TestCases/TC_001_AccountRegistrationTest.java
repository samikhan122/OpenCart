package TestCases;

import PageObjects.AccountRegistration;
import PageObjects.HomePage;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_AccountRegistrationTest extends BaseClass {



    @Test
    void test_account_Registration() throws InterruptedException {
        driver.get("https://demo.opencart.com/index.php");
        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickRegister();

        AccountRegistration regpage = new AccountRegistration(driver);
        Thread.sleep(5000);
        regpage.setFirstName("loro");
        Thread.sleep(5000);
        regpage.setLastName("basheer");
        Thread.sleep(5000);
        regpage.setLastName("basheer@gmail.com");
        Thread.sleep(5000);

        regpage.setPassword("alikhan123");
        Thread.sleep(5000);


    }
}
