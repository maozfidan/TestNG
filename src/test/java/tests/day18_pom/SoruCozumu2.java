package tests.day18_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class SoruCozumu2 {

    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));

        GuruPage guru = new GuruPage();

        guru.cokies.click();
        Thread.sleep(3000);
        Actions actions = new Actions(getDriver());
// DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        actions.dragAndDrop(guru.bank, guru.account).perform();

        // CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        actions.dragAndDrop(guru.sales, guru.account2).perform();
//DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak

        actions.dragAndDrop(guru.besbinn, guru.amount).perform();
// CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak

        actions.dragAndDrop(guru.besbinn2, guru.amount2).perform();

        actions.sendKeys(Keys.PAGE_DOWN);

        Assert.assertTrue(guru.yazi.isDisplayed());

        assertTrue(guru.yazi.isDisplayed());

    }
}
