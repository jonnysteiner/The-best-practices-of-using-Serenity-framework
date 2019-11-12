package com.mbabilo.qa.tests;

import com.mbabilo.qa.model.Button;
import net.serenitybdd.junit.runners.SerenityRunner;
import com.mbabilo.qa.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class CheckPageHeadlines {

    @Steps
    NavigatingUser jack;

    @Managed(uniqueSession = true)
    public WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToStartTestingNow() {
        // Given
        jack.isOnTheHomePage();
        // When
        jack.navigatesTo(Button.StartTestingNow);
        // Then
        jack.shouldSeePageTitleContaining("experitest.com");
        System.out.println("shouldBeAbleToNavigateToStartTestingNow IS PASSED");
    }

    @Test
    public void shouldBeAbleToNavigateToDownloadReport() {
        // Given
        jack.isOnTheHomePage();
        // When
        jack.navigatesTo(Button.DownloadReport);
        // Then
        jack.shouldSeePageTitleContaining("Experitest");
        System.out.println("shouldBeAbleToNavigateToDownloadReport IS PASSED");
    }
}
