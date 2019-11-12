package com.mbabilo.qa.steps;

import com.mbabilo.qa.ui.NavigationBar;
import com.mbabilo.qa.ui.CurrentPage;
import com.mbabilo.qa.ui.ExperitestHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    ExperitestHomePage experitestHomePage;
    CurrentPage currentPage;
    NavigationBar navigationBar;

    @Step
    public void isOnTheHomePage() {
        experitestHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesTo(String buttonName) {
        navigationBar.selectButton(buttonName);
    }
}
