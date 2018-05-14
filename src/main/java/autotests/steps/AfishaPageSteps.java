package autotests.steps;

import io.qameta.allure.Step;
import autotests.pages.AfishaPage;


public class AfishaPageSteps extends BaseSteps {

    @Step("Выбрать пункт меню - {menuItem}")
    public void selectEvent(String menuItem){
        new AfishaPage().selectMenuItem(menuItem);
    }
}

