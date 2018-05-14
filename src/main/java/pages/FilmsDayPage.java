package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.lang.reflect.Array;
import java.util.List;

public class FilmsDayPage extends BasePageObject {

    @FindBy(xpath = "//div[contains(@class,'events-list__item')]")
    List<WebElement> itemsCards;

    public FilmsDayPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void findItemWithRatingMoreEqualThan(float value) {
        for (WebElement i : itemsCards) {
            if (Float.parseFloat(i.findElement(By.xpath("/descendant::div[@class='event-rating__value']")).getText()) >= value) {
                BaseSteps.put("film", i);
                break;
            }
        }
    }

    public void findFilmByNameAndGettingCinemas() {
        BaseSteps.put("name", ((WebElement) BaseSteps.get("film")).findElement(By.xpath("/descendant::h2")).getText());
        BaseSteps.put("cinemas", ((WebElement) BaseSteps.get("film")).findElement(By.xpath("/descendant::span[@class='event__place-name']")).getText().replaceAll("\\D+", ""));
    }

    public void clickOnFilm() {
        ((WebElement) BaseSteps.get("film")).click();
    }

    public void checkFilmAndCinemas(){
        Assert.assertEquals(BaseSteps.get("name"), BaseSteps.getDriver().findElement(By.xpath("//h1[@class='event-heading__title']")).getText());
        Assert.assertEquals(BaseSteps.get("cinemas"), BaseSteps.getDriver().findElement(By.xpath("//span[@class='event-heading__place']")).getText().replaceAll("\\D+", ""));
    }
}
