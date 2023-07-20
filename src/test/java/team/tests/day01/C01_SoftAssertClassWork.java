package team.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class C01_SoftAssertClassWork {
    //1. "http://zero.webappsecurity.com/" Adresine gidin
    //2. Sign in butonuna basin
    //3. Login kutusuna "username" yazin
    //4. Password kutusuna "password" yazin
    //5. Sign in tusuna basin
    //6. Online banking menusu icinde Pay Bills sayfasina gidin
    //7. "Purchase Foreign Currency" tusuna basin
    //8. "Currency" drop down menusunden Eurozone'u secin
    //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
    //10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
    //edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
    //(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
    //(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
    //(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
    //(dollar)","Thailand (baht)"


    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {


        //1. "http://zero.webappsecurity.com/" Adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //2. Sign in butonuna basin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //3. Login kutusuna "username" yazin
        //4. Password kutusuna "password" yazin
        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//*[@id='user_login']")).
                sendKeys("username", Keys.TAB,"password",Keys.ENTER);

        driver.navigate().back();

        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        //7. "Purchase Foreign Currency" tusuna basin
        //8. "Currency" drop down menusunden Eurozone'u secin

        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
        WebElement ddm = driver.findElement(By.xpath("//*[@id='pc_currency']"));
       Select select = new Select(ddm);
       select.selectByVisibleText("Eurozone (euro)");
       // select.selectByIndex(6);

        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(ddm.isSelected());


        //10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
        //edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
        //(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
        //(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
        //(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
        //(dollar)","Thailand (baht)"

        List<WebElement> elementler = select.getOptions();

        elementler.forEach(t-> System.out.println(t.getText()));


        softAssert.assertAll();



            }
}
