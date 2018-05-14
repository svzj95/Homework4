package autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import autotests.steps.BaseSteps;

import java.util.List;

public class AfishaPage extends BasePageObject {
    @FindBy(xpath = "//li[contains(@class,'header-menu__item_hidden_no')]/a'")
    List<WebElement> menuItems;

    public AfishaPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        selectCollectionItem(itemName, menuItems);
    }
}
