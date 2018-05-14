package com.aplana.autotests.steps;

import io.qameta.allure.Step;
import com.aplana.autotests.pages.FilmsDayPage;

public class FilmsDayPageSteps extends BaseSteps {
    @Step("Найти фильм с рейтингом >= {value}")
    public void findFilmwithRating(String value){
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
    public void getFilmAndCinemas(){
        new FilmsDayPage().checkFilmAndCinemas();
    }
}
