package tests.day22_crossBrowser;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class D26_AmazonSatirSutunSayisi {


    //➢ Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
    //
    //➢ Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 9 satir oldugunu
    //test edin
    //
    //➢ Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu test edin

    AmazonPage amazonPage ;
    @Test
    public void test01() {

        amazonPage=new AmazonPage();

            amazonPage.method();


        System.out.println(amazonPage.satir.size());

        Assert.assertTrue(amazonPage.satir.size()==9);

            method2();
    }


    public void method2() {

        System.out.println(amazonPage.sütun.size());

        Assert.assertEquals(amazonPage.sütun.size(),7);
    }

    //AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
    //bana hucredeki yaziyi getirecek bir method olusturun
    //
    //➢ Tests paketi altinda yeni bir class olusturun: D26_AmazonHucreTesti
    //
    //➢ Bu class’in altinda bir test method olusturun : hucretesti() ve
    //webtable’da 3. satir 2.sutundaki yazinin “Home Services” yazisi
    //icerdigini test edin
    //
    //➢ Yeni bir method olusturun : AmazonYazisi() ve tabloda 9 Hucrede
    //“Amazon” yazisi bulundugunu test edin
}
