package io.github.epam.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import io.github.epam.entities.*;

public class ContactForm extends Form<Contacts> {
    @JDropdown(root = @FindBy(css = "select[ui=dropdown]")
	)
	public Dropdown gender;
    @JDropList(root = @FindBy(css = "div[ui=droplist]"),
		value = @FindBy(css = "button"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	)
	public DropList weather;
    @XPath(".//button[@type='submit']") public Button submit;
    @Css("input[type=checkbox][name='passport']") public CheckBox passport;
    @Css("input[type=checkbox][name='accept-conditions']") public CheckBox acceptConditions;
    @Css("input[type=text]#name") public TextField name;
    @Css("input[type=text]#last-name") public TextField lastName;
    @Css("input[type=text]#position") public TextField position;
    @Css("input[type=text]#passport-number") public TextField passportNumber;
    @Css("input[type=text]#passport-seria") public TextField passportSeria;
    @Css("textarea") public TextArea description;
	
}