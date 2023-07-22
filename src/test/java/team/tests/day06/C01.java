package team.tests.day06;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import team.pages.BluerentalPage;
import team.utilities.ConfigReader;
import team.utilities.Driver;
import team.utilities.ReusableMethods;

public class C01 {

    @DataProvider
    public static Object[][] kisiler() {
        return new Object[][]{{ConfigReader.getProperty("mail1"),ConfigReader.getProperty("sifre1")},
                {ConfigReader.getProperty("mail2"),ConfigReader.getProperty("sifre2")},
                {ConfigReader.getProperty("mail3"),ConfigReader.getProperty("sifre3")},
                {ConfigReader.getProperty("mail4"),ConfigReader.getProperty("sifre4")}};
    }

    @Test(dataProvider = "kisiler")
    public void test01(String mail ,String password) {

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ReusableMethods.bekle(3);
        BluerentalPage bluerentalPage = new BluerentalPage();
        bluerentalPage.login.click();
        ReusableMethods.bekle(3);
        bluerentalPage.email.sendKeys(mail, Keys.TAB, password, Keys.ENTER);

        Driver.closeDriver();
    }



}
