package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import static Tests.SeleniumTest.*;
import static Tests.SeleniumTest.driver;

public class ProductsPages {
    public static String formalShoes_xpath="/html/body/div[2]/center/h2";

    public static String sportShoes_xpath="/html/body/div[3]/center/h2";

    public static String sneakerShoes_xpath="/html/body/div[4]/center/h2";

    public static String formalShoesdrpdowns_xpath="/html/body/div[2]/center/div/i[1]";

    public static String sportShoesdrpdowns_xpath="/html/body/div[3]/center/div/i[1]";

    public static String sneakerShoesdrpdowns_xpath="/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_tablebody="/html/body/div[2]/table/tbody/tr[0]/td[0]";

    public static String sportShoes_tablebody="/html/body/div[3]/table/tbody/tr[0]/td[0]";

    public static String formalShoes_firstshoename="/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportsShoes_firstshoename="/html/body/div[3]/table/tbody/tr[1]/td[1]";

    public static String sneakerShoes_firstshoename="/html/body/div[4]/table/tbody/tr[1]/td[1]";



    public static void formalShoes_verifyTitle(){
        String expectedTitleFS="Formal Shoes";
        String actualTitleFS=driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(actualTitleFS, expectedTitleFS);
        if(expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS,"Test Passed for title verification of formal shoe");

        }
    }


    public static void sportShoes_verifyTitle(){
        String expectedTitleSs="Sports Shoes";
        String actualTitleSs=driver.findElement(By.xpath(sportShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSs, expectedTitleSs);
        if(expectedTitleSs.equals(actualTitleSs)) {
            test.log(Status.PASS, "Test Passed for title verification of Sports shoe");
        }

    }

    public static void sneakerShoes_verifyTitle(){
        String expectedTitleSn="Sneakers";
        String actualTitleSn=driver.findElement(By.xpath(sneakerShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSn, expectedTitleSn);
            if(expectedTitleSn.equals(actualTitleSn)) {
                test.log(Status.PASS, "Test Passed for title verification of Sneaker shoe");
            }
    }

    public static void formalShoes_firstshoe_verify(){
        String expectedFirstFormalShoe="   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesdrpdowns_xpath)).click();
        String actualFirstFormalShoe=driver.findElement(By.xpath(formalShoes_firstshoename)).getText();
        Assert.assertEquals(actualFirstFormalShoe, expectedFirstFormalShoe);
        if(expectedFirstFormalShoe.equals(actualFirstFormalShoe)) {
            test.log(Status.PASS, "Test Passed for title verification of FirstFormalShoe shoe");
        }


    }

    public static void sportShoes_firstshoe_verify(){
        String expectedFirstSportShoe="   Ultimate";
        driver.findElement(By.xpath(sportShoesdrpdowns_xpath)).click();
        String actualFirstSportShoe=driver.findElement(By.xpath(sportsShoes_firstshoename)).getText();
        Assert.assertEquals(actualFirstSportShoe, expectedFirstSportShoe);
        if(expectedFirstSportShoe.equals(actualFirstSportShoe)) {
            test.log(Status.PASS, "Test Passed for title verification of First Sport shoe");
        }

    }





}
