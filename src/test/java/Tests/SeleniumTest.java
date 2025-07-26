package Tests;

import Pages.HomesPage;
import Pages.ProductsPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import javax.xml.namespace.QName;

public class SeleniumTest {
    public static WebDriver driver;

    static ExtentReports report;

    public static ExtentTest test;

    static ExtentReports extent=new ExtentReports();

    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomesPage.click_hamburger_menu();
        HomesPage.click_orderProducts_links();

    }

    @Test
    void validateTitles_OnlineProduct(){
        test=extent.createTest("Validate shoe Title on Product page","This test validate that the different shoetype are correct online pages");
        ProductsPages.formalShoes_verifyTitle();
        ProductsPages.sportShoes_verifyTitle();
        ProductsPages.sneakerShoes_verifyTitle();
        extent.flush();

    }

    @Test
    void validateFirstFormalShoes(){
        test=extent.createTest("Validate first formal Shoes","This test validate  the first formal shoe on online pages");
        ProductsPages.formalShoes_firstshoe_verify();

    }
    @Test
    void validateFirstSportsShoes(){
        test=extent.createTest("Validate shoe SportsShoes on Product page","This test validate Sports shoes online pages");

        ProductsPages.sportShoes_firstshoe_verify();
    }

    @AfterSuite
    public static void cleanup()
    {
        extent.flush();
    }

}
