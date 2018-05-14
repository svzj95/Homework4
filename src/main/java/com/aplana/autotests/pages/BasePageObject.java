package com.aplana.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aplana.autotests.steps.BaseSteps;

import java.util.List;

class BasePageObject {
    BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }
}
