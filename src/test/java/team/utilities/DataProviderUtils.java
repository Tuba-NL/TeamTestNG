package team.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {


    @DataProvider
    public Object[][] sehirler() {
        return new Object[][]{{"ankara", "anadolu", "06"},
                {"istanbul", "marmara", "34"},
                {"izmir", "ege", "35"}};
    }
}