import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Scanner;

public class WebForm extends PageObject {
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/div[2]/div[1]/div[2]/span[1]")
    private WebElement login;
    @FindBy(id = "phone-input")
    private WebElement inputPhone;
    @FindBy(xpath = "//span[contains(text(),'Devam Et')]")
    private WebElement loginContinue;
    @FindBy(css = "div.v3-desk.v2-login-modal.login-modal:nth-child(3) div.capsul div.otp-wrapper div.code-wrapper div.otp-item:nth-child(1) > input.otp-inp.warn-border")
    private WebElement otpInput1;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]")
    private WebElement otpInput2;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/div[2]/div[1]/div[2]/div[3]/div[3]/input[1]")
    private WebElement otpInput3;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/div[2]/div[1]/div[2]/div[3]/div[4]/input[1]")
    private WebElement otpInput4;
    @FindBy(xpath = "//span[contains(text(),'Alışverişe Başla')]")
    private WebElement goShopping;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]")
    private WebElement username;
    @FindBy(xpath = "//p[contains(text(),'SMS kodunu sana daha önceden göndermiştik. Tekrar ')]")
    private WebElement failedLoginTxt;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement searchbox;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/main[1]/div[1]/div[1]/div[2]/select[1]")
    private WebElement queueLstBox;
    @FindBy(xpath = "//option[contains(text(),'Fiyatı Artan')]")
    private WebElement lowerPrice;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='appLayout']/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[3]/div[1]/div[1]/div[2]/div[1]/img[1]")
    private WebElement addProduct;
    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void loginButton(){
        this.login.click();
    }
    public void inputPhone(){
        this.inputPhone.sendKeys("5336965323");
    }
    public void loginContinueButton(){
        this.loginContinue.click();
    }
    public void otpInput1(){
        String otp1 ="1";
        this.otpInput1.sendKeys(otp1);
    }
    public void otpInput2(){
        String otp2 ="1";
        this.otpInput2.sendKeys(otp2);
    }
    public void otpInput3(){
        String otp3 ="1";
        this.otpInput3.sendKeys(otp3);
    }
    public void otpInput4(){
        String otp4 ="1";
        this.otpInput4.sendKeys(otp4);
    }
    public void goShoppingButton(){
        this.goShopping.click();
    }
    public void checkLogin(){
        Assert.assertEquals(username.getText(),"Merhaba, TUĞÇE");
    }
    public void checkFailedLogin(){
        Assert.assertEquals(failedLoginTxt.getText(),"Hatalı doğrulama kodu girdin.");
    }
    public void sendProductName(){
        this.searchbox.sendKeys("cips");
        this.searchbox.sendKeys(Keys.ENTER);
    }
    public void clickLowerPrice(){
        this.queueLstBox.click();
        this.lowerPrice.click();
    }
    public void addLowerPriceProduct(){
        this.addProduct.click();
    }
}
