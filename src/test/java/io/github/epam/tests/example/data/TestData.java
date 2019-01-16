package io.github.epam.tests.example.data;

import io.github.epam.entities.Contacts;
import io.github.epam.entities.User;

public class TestData {
    public static User DEFAULT_USER = new User().set(u -> {
        u.name = "epam";
        u.password = "1234";
    } );

    public static Contacts DEFAULT_CONTACTS = new Contacts().set(c -> {
        c.gender = "Male";
        //c.religion = "Other";
        c.weather = "Sun, Snow";
        c.passport = "true";
        c.acceptConditions = null;
        c.name = "Roman";
        c.lastName = "Iovlev";
        c.position = "QA Automation";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI awesome";
    } );
}
