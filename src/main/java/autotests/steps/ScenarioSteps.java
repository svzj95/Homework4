package autotests.steps;

import cucumber.api.java.en.When;
import autotests.pages.AfishaPage;
import autotests.pages.FilmsDayPage;
import autotests.pages.FilmsPage;
import autotests.pages.MainPage;

public class ScenarioSteps {
    MainPage mainPage = new MainPage();
    AfishaPage afishaPage = new AfishaPage();
    FilmsPage filmsPage = new FilmsPage();
    FilmsDayPage filmsDayPage = new FilmsDayPage();

    @When("^Перейти в меню - \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(menuItem);
    }

    @When("^Выбрать пункт меню - \"(.+)\"$")
    public void selectEvent(String menuItem) { afishaPage.selectMenuItem(menuItem); }

    @When("^Проверить, что есть заголовок – \"(.+)\"$")
    public void checkTitle(String title){
        filmsPage.checkTitle(title);
    }

    @When("^Выбрать дату - \"(.+)\"$")
    public void chooseDate(String date){
        filmsPage.chooseDate(date);
    }

    @When("^Найти фильм с рейтингом >= \"(.+)\"$")
    public void findItemWithRaingMoreEqualThan(String value){
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
