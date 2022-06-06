package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {

    public TutorialPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")

    public WebElement phones;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")

    public List<WebElement> markaListe;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")

    public List<WebElement> sepetListe;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")

    public WebElement button;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[2]/a")

    public List<WebElement> eklenenListe;
}
