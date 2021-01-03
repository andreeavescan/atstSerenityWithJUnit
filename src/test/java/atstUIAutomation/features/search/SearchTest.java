package atstUIAutomation.features.search;

import atstUIAutomation.steps.serenity.HeaderSteps;
import atstUIAutomation.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;

    @Test
    public void add_to_cart_searched_product_dress(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("dress");
    }

    @Test
    public void add_to_cart_searched_product_pants(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("pants");
    }

    @Test
    public void add_to_cart_searched_product_shirt(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("shirt");
    }

}
