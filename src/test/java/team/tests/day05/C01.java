package team.tests.day05;

import org.testng.annotations.Test;
import team.utilities.ConfigReader;
import team.utilities.Driver;
import team.utilities.ExcelReader;
import team.utilities.ReusableMethods;

public class C01 {

    @Test
    public void test01() {
        String dosyaYolu = ConfigReader.getProperty("dosyaYolu");
        String sayfaIsmi = ConfigReader.getProperty("sayfaIsmi");
        ExcelReader reader = new ExcelReader(dosyaYolu,sayfaIsmi);


        String email = reader.getCellData(1,0);
        System.out.println("1.email = " + reader.getCellData(1, 0));
        String password  = reader.getCellData(1,1);
        System.out.println("1.password = " + reader.getCellData(1, 1));


    }
}
