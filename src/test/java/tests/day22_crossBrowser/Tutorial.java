package tests.day22_crossBrowser;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tutorial {


    /*
    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    ~ click on Phones & PDAs
    ~ get the brandName of phones
    ~ click on add to button for all elements
    ~ click on black total added cart button
    ~ get the names of list from the cart
    ~ compare the names from displaying list and cart list
*/
    TutorialPage tutorialPage = new TutorialPage();

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");

        tutorialPage.phones.click();

        List<String> ilkisimliste = new ArrayList<>();

        for (int i = 0; i < tutorialPage.markaListe.size(); i++) {

            ilkisimliste.add(tutorialPage.markaListe.get(i).getText());

        }

        Collections.sort(ilkisimliste);
        System.out.println("*************" + ilkisimliste);

        List<String> isimListesi = new ArrayList<>();

        for (int i = 0; i < tutorialPage.sepetListe.size(); i++) {


            tutorialPage.sepetListe.get(i).click();
            Thread.sleep(3000);

            isimListesi.add(tutorialPage.sepetListe.get(i).getText());


        }


        tutorialPage.button.click();

        List<String> alinacakListe = new ArrayList<>();

        for (int i = 0; i < tutorialPage.eklenenListe.size(); i++) {

            alinacakListe.add(tutorialPage.eklenenListe.get(i).getText());

        }
        System.out.println("sepetteki listeler :" + alinacakListe);

        Collections.sort(alinacakListe);

        Assert.assertTrue(alinacakListe.containsAll(ilkisimliste));
    }
}
