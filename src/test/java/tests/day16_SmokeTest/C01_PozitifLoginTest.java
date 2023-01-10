package tests.day16_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){
        //qualitydemi anasayfaya git

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        ReusableMethods.bekle(4);

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qualitydemyPage.accept.click();
        ReusableMethods.bekle(2);
;
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(3);

        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed() );
        Driver.closeDriver();
    }

}
