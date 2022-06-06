package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class D26_AmazonHucreTesti {

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

    AmazonPage amazonPage;
    @Test
    public void test01() {

        amazonPage =new AmazonPage();

        amazonPage.method();

        amazonPage.method3();

        String expectedTitle="Home Services";

        String actualTitle=amazonPage.method3();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

amazonYazisi();
    }

    public long amazonYazisi() {

        amazonPage=new AmazonPage();

     long sayi= amazonPage.tümsütunlar.stream().filter(t->t.getText().contains("Amazon")).count();

        System.out.println(sayi);

return  sayi;
    }
}
