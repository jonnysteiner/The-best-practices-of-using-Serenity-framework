package com.mbabilo.qa.tests;


import com.mbabilo.qa.tasks.OpenTheApplication;
import com.mbabilo.qa.tasks.Search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.core.StringContains.containsString;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void searchResultsShouldShowTheSearchTermInTheTitle() {

        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Search.forTheTerm("Experitest Blog"));
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("Experitest Blog"))));
        System.out.println("searchResultsShouldShowTheSearchTermInTheTitle IS PASSED");
    }
}