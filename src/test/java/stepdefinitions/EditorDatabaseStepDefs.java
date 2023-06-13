package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import pages.EditorDatabaseHomePage;

import java.text.DateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitFor;

public class EditorDatabaseStepDefs {
    EditorDatabaseHomePage databaseHomePage = new EditorDatabaseHomePage();
    @When("user clicks on home page new button")
    public void user_clicks_on_home_page_new_button() {

        databaseHomePage.HomePage_NewButton.click();
    }
    @When("user enters all fields credentials s.t {string} , {string} , {string} , {string}  , {string} ,{string},{string}")
    public void user_enters_all_fields_credentials_s_t(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        waitFor(1);
        databaseHomePage.firstname.sendKeys(string);
        waitFor(1);
        databaseHomePage.lastname.sendKeys(string2);
        waitFor(1);
        databaseHomePage.position.sendKeys(string3);
        waitFor(1);
        databaseHomePage.office.sendKeys(string4);
        waitFor(1);
        databaseHomePage.extension.sendKeys(string5);
        waitFor(1);
        databaseHomePage.startDate.sendKeys(string6);
        waitFor(1);
        databaseHomePage.salary.sendKeys(string7);

    }
    @When("user clicks on create button")
    public void user_clicks_on_create_button() {

    databaseHomePage.createButton.click();
    }
    @When("user search for the {string} and {string}")
    public void user_search_for_the_and(String string, String string2) {
    waitFor(1);
    databaseHomePage.searchBox.sendKeys(string+" "+string2);
    }
    @Then("verify the name field contains {string} and {string}")
    public void verify_the_name_field_contains_and(String string, String string2) {
        waitFor(1);
        assertEquals(string+" "+string2,databaseHomePage.searchNameField.getText());
       // assertTrue(databaseHomePage.searchNameField.getText().contains(string+" "+string2));
    }



}

