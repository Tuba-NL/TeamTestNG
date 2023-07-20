package team.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team.utilities.Driver;

public class BluerentalPage {
    public BluerentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement verify;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement verify1;

    @FindBy(xpath = "//*[@name='car']")
    public WebElement ddm;

    @FindBy(xpath = "//*[@name='pickUpLocation']")
    public WebElement pickUp;

    @FindBy(xpath = "//*[text()='Please first login']")
    public WebElement pleaseyazisi;


}