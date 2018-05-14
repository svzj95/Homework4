package com.aplana.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aplana.autotests.steps.BaseSteps;

import java.util.List;

public class MainPage extends BasePageObject {
    @FindBy(xpath = "//div[@class='row text_black_yes heap__row widgets__row widgets__row_tr_2']//a[@class='home-link home-link_blue_yes']")
    private List<WebElement> menuItems;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        selectCollectionItem(itemName, menuItems);
    }
}
