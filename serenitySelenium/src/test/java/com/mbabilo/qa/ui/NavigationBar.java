package com.mbabilo.qa.ui;

import net.serenitybdd.core.pages.PageObject;
import static org.openqa.selenium.By.xpath;


public class NavigationBar extends PageObject{


    public void selectButton(String buttonName) {
               find(xpath(buttonName)).click();
    }
}
