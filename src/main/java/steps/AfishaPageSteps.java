package steps;

import io.qameta.allure.Step;
import pages.AfishaPage;


public class AfishaPageSteps extends BaseSteps {

    @Step("Выбрать пункт меню - {menuItem}")
    public void selectMenuItem(String menuItem){
        new AfishaPage().selectMenuItem(menuItem);
    }
}

