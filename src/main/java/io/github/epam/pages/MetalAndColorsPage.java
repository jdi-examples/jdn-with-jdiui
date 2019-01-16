package io.github.epam.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import io.github.epam.sections.*;

public class MetalAndColorsPage extends WebPage {
    @Css("header") public Header header;
    @Css("footer") public Footer footer;
    @Css(".uui-side-bar[name='navigation-sidebar']") public NavigationSidebar navigationSidebar;
    @Css(".uui-side-bar[name='log-sidebar']") public LogSidebar logSidebar;
    @JDropdown(root = @FindBy(css = "div[ui=dropdown]"),
		value = @FindBy(css = ".filter-option"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	)
	public Dropdown colors;
    @JComboBox(root = @FindBy(css = "div[ui=combobox]"),
		value = @FindBy(css = "input"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	)
	public ComboBox metals;
    @XPath(".//button[@type='submit' and contains(.,'Calculate')]") public Button calculate;
    @XPath(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;
	
}