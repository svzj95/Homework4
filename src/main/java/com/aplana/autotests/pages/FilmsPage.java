package com.aplana.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aplana.autotests.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FilmsPage extends BasePageObject {
    @FindBy(xpath = "//title")
    private WebElement title;

    @FindBy(xpath = "//button[contains(@class,\"events-filter-date__button\")]")
    private WebElement firstClickDateButton;

    @FindBy(xpath = "//span[@class=\"presets-list__title\"]")
    private List<WebElement> dates;

    @FindBy(xpath = "//button[contains(@class,'subscribe-form-email__button subscribe-form-email__button_type_close')]")
    private WebElement closeButtonModalWindow;

    public FilmsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void checkTitle(String value){
        if(closeButtonModalWindow.isDisplayed())
            closeButtonModalWindow.click();
        title.getText().contains(value);
    }

    public FilmsDayPage chooseDate(String value){
        wait.until(ExpectedConditions.visibilityOf(firstClickDateButton));
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
