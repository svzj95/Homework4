package com.aplana.autotests.steps;

import io.qameta.allure.Step;
import com.aplana.autotests.pages.AfishaPage;


public class AfishaPageSteps {

    @Step("Выбрать пункт меню - {menuItem}")
    public void selectEvent(String menuItem){
        new AfishaPage().selectCategoryItem(menuItem);
    }
}

