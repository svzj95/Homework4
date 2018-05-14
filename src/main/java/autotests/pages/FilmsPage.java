package autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import autotests.steps.BaseSteps;

import java.util.List;

public class FilmsPage extends BasePageObject {
    @FindBy(xpath = "//title")
    WebElement title;

    @FindBy(xpath = "//button[contains(@class,\"events-filter-date__button\")]")
    WebElement firstClickDateButton;

    @FindBy(xpath = "//span[@class=\"presets-list__title\"]")
    List<WebElement> dates;

    public FilmsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void checkTitle(String value){
        Assert.assertEquals(value,title.getText());
    }

    public FilmsDayPage chooseDate(String value){
        firstClickDateButton.click();
        for(WebElement i : dates){
            if(i.getText().equals(value)){
                i.click();
                break;
            }
        }
        return new FilmsDayPage();
    }
}
