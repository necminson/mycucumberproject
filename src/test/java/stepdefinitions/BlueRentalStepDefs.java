package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BRHomePage;
import pages.BRLoginPage;

import static utilities.ReusableMethods.verifyElementDisplayed;
import static utilities.ReusableMethods.waitFor;

public class BlueRentalStepDefs {
    BRHomePage brHomePage = new BRHomePage();
    BRLoginPage brLoginPage = new BRLoginPage();
    @Given("user clicks on home page login button")
    public void user_clicks_on_home_page_login_button() {
       brHomePage.homeLoginLink.click();
    }
    @Given("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
    brLoginPage.userEmail.sendKeys(string);
    brLoginPage.userPass.sendKeys(string2);
    waitFor(1);
    }
    @Given("user clicks on the login page login button")
    public void user_clicks_on_the_login_page_login_button() {
    brLoginPage.loginButton.click();
    }
    @Then("verify the default page is visible")
    public void verify_the_default_page_is_visible() {
    // if user ID is displayed then default page is visible
    verifyElementDisplayed(brHomePage.userID);
    }
    @Then("user logs out the application")
    public void userLogsOutTheApplication() {
    waitFor(1);
    brHomePage.userID.click();
    waitFor(1);
    brHomePage.logOut.click();
    waitFor(1);
    brHomePage.OK.click();
    waitFor(1);
    }
}
