package steps;

import cucumber.api.java.en.When;
import pages.AfishaPage;
import pages.FilmsDayPage;
import pages.FilmsPage;
import pages.MainPage;

public class ScenarioSteps {
    MainPage mainPage = new MainPage();
    AfishaPage afishaPage = new AfishaPage();
    FilmsPage filmsPage = new FilmsPage();
    FilmsDayPage filmsDayPage = new FilmsDayPage();

    @When("^Перейти в меню - \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(menuItem);
    }
}
