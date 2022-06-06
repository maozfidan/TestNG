package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']")

    public WebElement webtable;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr")

    public List<WebElement> satir;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td/a")

    public List<WebElement> sütun;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr/td/a")

    public List<WebElement> tümsütunlar;


    public void method() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
    }


    public String method3() {

        //AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
        //bana hucredeki yaziyi getirecek bir method olusturun

        int satir = 3;
        int sütun = 7;


       // WebElement istenenisim = Driver.getDriver().findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[" + satir + "]/td[" + sütun + "]/a"));


        WebElement istenenisim = Driver.getDriver().findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[" + satir + "]/td[" + sütun + "]"));

       // driver.findElement(By.xpath("//tbody//tr["+satir+"]//td["+sutun+"]"));

        System.out.println(istenenisim.getText());

return istenenisim.getText();
    }

}
