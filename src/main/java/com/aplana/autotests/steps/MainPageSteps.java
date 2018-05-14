package com.aplana.autotests.steps;

import io.qameta.allure.Step;
import com.aplana.autotests.pages.MainPage;

public class MainPageSteps {

    @Step("Перейти в меню - {menuItem}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }
}
