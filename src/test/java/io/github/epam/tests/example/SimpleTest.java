package io.github.epam.tests.example;

import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.contactFormPage;
import static io.github.epam.EpamGithubSite.homePage;
import static io.github.epam.tests.example.data.TestData.DEFAULT_CONTACTS;
import static io.github.epam.tests.example.data.TestData.DEFAULT_USER;

public class SimpleTest extends SimpleTestsInit {
    /**
     1. Open EpamGithub site https://epam.github.io/JDI
     2. Click user icon
     3. Login as User (name: epam, password: 1234)
     4. Select Contacts page in sidebar menu
     5. Check that Contacts page opened
     6. Fill contacts form with:
gender = "Male";
religion = "Other";
weather = "Sun, Snow";
passport = "true";
acceptConditions;
name = "Roman";
lastName = "Iovlev";
position = "QA Automation";
number = "4321";
serial = "123456";
description = "JDI awesome";
     7. Check that contact form filled with expected data:
        gender = "Male"; religion = "Other"; weather = "Sun, Snow";
        passport = "true"; acceptConditions; name = "Roman"; lastName = "Iovlev";
        position = "QA Automation"; number = "4321"; seria = "123456";
        description = "JDI awesome";
     */

    @Test
    public void loginTest() {
        homePage.open();
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
        homePage.navigationSidebar.contactForm.click();
        contactFormPage.checkOpened();
        contactFormPage.main.contactForm.submit(DEFAULT_CONTACTS);
        contactFormPage.main.contactForm.check(DEFAULT_CONTACTS);
    }
}
