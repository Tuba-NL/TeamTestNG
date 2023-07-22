package team.tests.day06;

import org.testng.annotations.Test;
import team.utilities.DataProviderUtils;

public class C02 {
    @Test(dataProvider = "sehirler",dataProviderClass = DataProviderUtils.class)
    public void test01(String sehir, String bolge, String plaka) {


        System.out.println(sehir+ " | "+bolge+" | "+plaka);

    }


    }

