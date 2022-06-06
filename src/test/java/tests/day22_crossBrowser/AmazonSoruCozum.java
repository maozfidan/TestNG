package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AmazonSoruCozum {

    //Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
    //
    //➢ Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin AmazonPage
    //clasinda en altta gitme isini yapacak bir method olusturun
    //
    //➢ Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
    //
    //➢ Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu
    //test edin
    //
    //➢ Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu test edin


    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    }
}
