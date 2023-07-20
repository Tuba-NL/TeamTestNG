package team.tests.day04_BlueRental;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team.pages.BluerentalPage;
import team.utilities.ConfigReader;
import team.utilities.Driver;
import team.utilities.ReusableMethods;

public class US_01 {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BluerentalPage bluerentalPage = new BluerentalPage();

        bluerentalPage.login.click();

        bluerentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));

        bluerentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);

    }

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BluerentalPage bluerentalPage = new BluerentalPage();

        bluerentalPage.login.click();

        bluerentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"));

        bluerentalPage.password.sendKeys(ConfigReader.getProperty("fakePassword"), Keys.ENTER);

        ReusableMethods.bekle(1);

        Assert.assertTrue(bluerentalPage.verify.isDisplayed());
        
    }

    @Test
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BluerentalPage bluerentalPage = new BluerentalPage();

        bluerentalPage.login.click();

        bluerentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));

        bluerentalPage.password.sendKeys(ConfigReader.getProperty("fakePassword"), Keys.ENTER);

        ReusableMethods.bekle(1);

        Assert.assertTrue(bluerentalPage.verify.isDisplayed());

    }

    @Test
    public void tesT04() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BluerentalPage bluerentalPage = new BluerentalPage();

        bluerentalPage.login.click();

        bluerentalPage.email.sendKeys(ConfigReader.getProperty("gecersizMail"));

        bluerentalPage.password.sendKeys(ConfigReader.getProperty("fakePassword"), Keys.ENTER);

        ReusableMethods.bekle(1);

        Assert.assertTrue(bluerentalPage.verify1.isDisplayed());

    }
    @Test
    public void test05() {



        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ReusableMethods.bekle(1);

        BluerentalPage bluerentalPage = new BluerentalPage();
        Select select = new Select(bluerentalPage.ddm);
        ReusableMethods.bekle(2);
        select.selectByVisibleText(ConfigReader.getProperty("aracMarkasi"));


        bluerentalPage.pickUp.sendKeys(ConfigReader.getProperty("pickUpLocation"),
                Keys.TAB,ConfigReader.getProperty("DropOffLocation"),
                Keys.TAB,ConfigReader.getProperty("pickUpDate"),
                Keys.TAB,ConfigReader.getProperty("pickUpTime"),
                Keys.TAB,ConfigReader.getProperty("dropOffDate"),
                Keys.TAB,ConfigReader.getProperty("dropOffTime"),Keys.ENTER);
        ReusableMethods.bekle(2);

        Assert.assertTrue(bluerentalPage.pleaseyazisi.isDisplayed());


    }
}
