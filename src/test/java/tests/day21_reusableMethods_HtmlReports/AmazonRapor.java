package tests.day21_reusableMethods_HtmlReports;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.TestBaseRapor;

public class AmazonRapor extends TestBaseRapor {

    //➢ D26_AmazonSatirSutunSayisi class’indan satirSayisi()
//        testini ve D26_AmazonHucreTesti class’indan
//        hucretesti() testini rapor alacak sekilde hazirlayin ve
//        3.sorudaki xml dosyasi ile calistirip raporu olusturun
    AmazonPage amazonPage;
    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Login","Satir  ve sütün sayilari raporu");
        amazonPage = new AmazonPage();

        amazonPage.method();
extentTest.info("AmazonPage obje olusturup methodCall yapildi ");

        System.out.println(amazonPage.satir.size());
        extentTest.info("satirin toplam size' alindi");

        Assert.assertTrue(amazonPage.satir.size() == 9);
        extentTest.pass("testimiz gecti");

        method2();

    }
    public  void method2() {

        System.out.println(amazonPage.sütun.size());

        Assert.assertEquals(amazonPage.sütun.size(),7);
    }

    @Test
    public void test02() {

        amazonPage =new AmazonPage();

        amazonPage.method();
        extentTest.info("driver'a gitmesi icin method olusturuldu");

        amazonPage.method3();
        extentTest.info("Amazon kelimesini iceren sütunlari bulma");

        String expectedTitle="Home Services";
        extentTest.info("istenen kelime");

        String actualTitle=amazonPage.method3();
        extentTest.info("sayfada olan yazi");

        Assert.assertTrue(actualTitle.contains(expectedTitle));
extentTest.pass("testler gecti");

        amazonYazisi();
    }

    public long amazonYazisi() {

        amazonPage=new AmazonPage();

        long sayi= amazonPage.tümsütunlar.stream().filter(t->t.getText().contains("Amazon")).count();

        System.out.println(sayi);

        return  sayi;
    }
}
