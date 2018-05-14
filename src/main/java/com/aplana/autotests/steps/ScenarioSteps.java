package com.aplana.autotests.steps;

import cucumber.api.java.en.When;
import com.aplana.autotests.pages.AfishaPage;
import com.aplana.autotests.pages.FilmsDayPage;
import com.aplana.autotests.pages.FilmsPage;
import com.aplana.autotests.pages.MainPage;

public class ScenarioSteps {
    private MainPage mainPage = new MainPage();
    private AfishaPage afishaPage = new AfishaPage();
    private FilmsPage filmsPage = new FilmsPage();
    private FilmsDayPage filmsDayPage = new FilmsDayPage();

    @When("^Перейти в меню - \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(menuItem);
    }

    @When("^Выбрать пункт меню - \"(.+)\"$")
    public void selectEvent(String menuItem) { afishaPage.selectCategoryItem(menuItem); }

    @When("^Проверить, что есть заголовок – \"(.+)\"$")
    public void checkTitle(String title) {
        filmsPage.checkTitle(title);
    }

    @When("^Выбрать дату - \"(.+)\"$")
    public void chooseDate(String date){
        filmsPage.chooseDate(date);
    }

    @When("^Найти фильм с рейтингом >= \"(.+)\"$")
    public void findItemWithRaingMoreEqualThan(String value) {
        filmsDayPage.findItemWithRatingMoreEqualThan(value);
    }

    @When("^Запомнить название фильма и количество кинотеатров")
    public void findFilmByNameAndGettingCinmes(){
        filmsDayPage.findFilmByNameAndGettingCinemas();
    }

    @When("^Нажать на выбранный фильм")
    public void clickOnFilm(){
        filmsDayPage.clickOnFilm();
    }

    @When("^Проверить, на открывшейся странице название фильма и количество кинотеатров")
    public void checkFilmAndCinmes(){
        filmsDayPage.checkFilmAndCinemas();
    }
}
