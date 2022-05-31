package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage {

    public GuruPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//p[@class='fc-button-label'])[1]")

    public WebElement cokies;

    @FindBy(xpath = "(//a[@class='button button-orange'])[6]")

    public WebElement sales;

    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")

    public WebElement bank;

    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")

    public WebElement besbinn;

    @FindBy(xpath = "//ol[@class='field14 ui-droppable ui-sortable']")

    public WebElement account;

    @FindBy(xpath = "(//ol[@class='field13 ui-droppable ui-sortable'])[1]")

    public WebElement amount;

    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")

    public WebElement besbinn2;

    @FindBy(xpath = "(//ol[@class='field13 ui-droppable ui-sortable'])[2]")

    public WebElement amount2;

    @FindBy(xpath = "(//ol[@align='center'])[3]")

    public WebElement account2;

    @FindBy(xpath = "(//a[@class='button button-green'])[1]")

    public WebElement yazi;
}
