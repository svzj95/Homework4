package autotests.steps;


import io.qameta.allure.Step;
import autotests.pages.FilmsPage;

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
