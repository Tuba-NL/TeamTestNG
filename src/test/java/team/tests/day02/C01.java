package team.tests.day02;

import org.testng.annotations.Test;
import team.utilities.ConfigReader;
import team.utilities.Driver;

public class C01 {
    @Test
    public void test01() throws InterruptedException {
        //amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(1000);
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        Thread.sleep(1000);

        Driver.closeDriver();
    }
}
