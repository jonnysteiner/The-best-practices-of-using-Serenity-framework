package com.mbabilo.qa.model;

public class Button {
    public static String StartTestingNow = "/html/body/section/div/div[1]/div[1]/div/a";
    public static String DownloadReport ="/html/body/section/div/div[2]/div/div/a";
    private final String Button;

    Button(String Button) {
        this.Button = Button;
    }
}
