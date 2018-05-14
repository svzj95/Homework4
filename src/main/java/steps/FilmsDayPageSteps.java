package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.FilmsDayPage;
import pages.FilmsPage;

public class FilmsDayPageSteps extends BaseSteps {
    @Step("Найти фильм с рейтингом >= {value}")
    public void findFilmwithRating(float value){
        new FilmsDayPage().findItemWithRatingMoreEqualThan(value);
    }

    @Step("Запомнить название фильма и количество кинотеатров")
    public void findFilmByNameAndGettingCinemas(){
        new FilmsDayPage().findFilmByNameAndGettingCinemas();
    }

    @Step("Нажать на выбранный фильм")
    public void clickOnFilm(){
        new FilmsDayPage().clickOnFilm();
    }

    @Step("Нажать на выбранный фильм")
    public void checkFilmAndCinemas(){
        new FilmsDayPage().checkFilmAndCinemas();
    }
}
