package com.aplana.autotests.steps;


import com.aplana.autotests.pages.FilmsPage;
import io.qameta.allure.Step;

public class FilmPageSteps {
    @Step("Проверить, что есть заголовок – {value}")
    public void checkTitle(String value){
        new FilmsPage().checkTitle(value);
    }

    @Step("Выбрать дату - {value}")
    public void chooseDate(String value){
        new FilmsPage().chooseDate(value);
    }

}
