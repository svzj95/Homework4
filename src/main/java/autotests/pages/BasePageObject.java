package autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import autotests.steps.BaseSteps;

import java.util.List;

public class BasePageObject {
    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }
}
