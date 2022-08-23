import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();
    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Success Login")
    public static void isteGelsin() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.loginButton();
        webForm.inputPhone();
        webForm.loginContinueButton();
        TimeUnit.SECONDS.sleep(2);
        webForm.otpInput1();
        webForm.otpInput2();
        webForm.otpInput3();
        webForm.otpInput4();
        webForm.goShoppingButton();
        webForm.checkLogin();
    }

    @Test(testName = "Failed Login")
    public static void isteGelsin2() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.loginButton();
        webForm.inputPhone();
        webForm.loginContinueButton();
        TimeUnit.SECONDS.sleep(2);
        webForm.otpInput1();
        webForm.otpInput2();
        webForm.otpInput3();
        webForm.otpInput4();
        webForm.goShoppingButton();
        webForm.checkFailedLogin();
    }
    @Test(testName = "Lower price product search")
    public static void isteGelsin3() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.sendProductName();
        TimeUnit.SECONDS.sleep(2);
        webForm.clickLowerPrice();
    }
    @Test(testName = "Lower price add to cart")
    public static void isteGelsin4() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.sendProductName();
        TimeUnit.SECONDS.sleep(2);
        webForm.clickLowerPrice();
        webForm.addLowerPriceProduct();
    }
}
