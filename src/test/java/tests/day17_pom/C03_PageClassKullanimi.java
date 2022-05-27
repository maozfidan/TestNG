package tests.day17_pom;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test01() {

        FacebookPage facebookpage= new FacebookPage();
        Driver.getDriver().get("https://www.facebook.com");
facebookpage.cookies.click();
        facebookpage.mailKutusu.sendKeys("ali");

        facebookpage.sifreKutusu.sendKeys("12234");
        facebookpage.loginTusu.click();
        Assert.assertTrue(facebookpage.girilemediYaziElementi.isDisplayed());
Driver.closeDriver();
    }
}
