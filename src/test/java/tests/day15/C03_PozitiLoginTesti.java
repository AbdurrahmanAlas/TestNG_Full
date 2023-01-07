package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemiPage;
import utilities.Driver;

public class C03_PozitiLoginTesti {


    @Test
    public void test01() {
        // 1- https://www.qualitydemy.com/ anasayfasina gidin

        Driver.getDriver().get("https://www.qualitydemy.com/");
        // 2- login linkine basin
        QualityDemiPage qualityDemiPage=new QualityDemiPage();
        qualityDemiPage.ilkLoginLinki.click();
        // 3- Kullanici email'i olarak valid email girin
        qualityDemiPage.kullaniciEmail.sendKeys("user_1106147@login.com");
        // 4- Kullanici sifresi olarak valid sifre girin

        qualityDemiPage.passwordKutusu.sendKeys("31488081");
        // 5- Login butonuna basarak login olun
        qualityDemiPage.loginButonu.click();
        // 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualityDemiPage.basariliGirisCoursesLinki.isDisplayed());

    }
}