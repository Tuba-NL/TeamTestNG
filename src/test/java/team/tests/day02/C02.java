package team.tests.day02;

import org.testng.annotations.Test;
import team.utilities.ConfigReader;
import team.utilities.Driver;

public class C02 {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(2);
    }
}
