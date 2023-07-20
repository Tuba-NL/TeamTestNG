package team.tests.day03;

import org.testng.Assert;
import org.testng.annotations.Test;
import team.pages.OrangePageHome;
import team.utilities.ConfigReader;
import team.utilities.Driver;
import team.utilities.ReusableMethods;

public class C01_OrangePage {

    @Test
    public void test01() {
       // Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
        ReusableMethods.bekle(1);

        OrangePageHome orange = new OrangePageHome();

        orange.username.sendKeys(ConfigReader.getProperty("username"));
        orange.password.sendKeys(ConfigReader.getProperty("password"));
        orange.submitbutton.click();
        Assert.assertTrue(orange.verify.isDisplayed());

    }
}
