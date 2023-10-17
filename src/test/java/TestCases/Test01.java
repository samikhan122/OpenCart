package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {
    @Test
    public void test01(){
        System.setProperty("webdriver.chrome.driver","/Users/alikhan/IdeaProjects/OpenCart/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
    }
}
