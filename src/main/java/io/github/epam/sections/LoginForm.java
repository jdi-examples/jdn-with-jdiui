package io.github.epam.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import io.github.epam.entities.*;

public class LoginForm extends Form<User> {
    @XPath(".//button[@type='submit']") public Button enter;
    @Css("input[type=text]") public TextField name;
    @Css("input[type=password]") public TextField password;
	
}