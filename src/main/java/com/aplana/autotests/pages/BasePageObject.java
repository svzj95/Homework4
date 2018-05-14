package com.aplana.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aplana.autotests.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

class BasePageObject {
    WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);

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
