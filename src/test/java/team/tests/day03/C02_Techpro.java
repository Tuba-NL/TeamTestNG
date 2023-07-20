package team.tests.day03;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team.pages.TechproPage;
import team.utilities.ConfigReader;
import team.utilities.Driver;
import team.utilities.ReusableMethods;

public class C02_Techpro {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
        ReusableMethods.bekle(2);

        TechproPage page = new TechproPage();
        page.username.sendKeys(ConfigReader.getProperty("techpro_test_username"),
                Keys.TAB ,ConfigReader.getProperty("techpro_test_password"),Keys.ENTER);
    }


}

