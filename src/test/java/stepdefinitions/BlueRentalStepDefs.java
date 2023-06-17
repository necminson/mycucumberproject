package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BRHomePage;
import pages.BRLoginPage;

import java.util.List;
import java.util.Map;

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
    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(io.cucumber.datatable.DataTable credentials) {
             /*
//      1. GET DATA AS LIST<STRING>
        List<String> customerData=credentials.row(1);
//        System.out.println(customerData);//[jack@gmail.com, 12345]
        brLoginPage.userEmail.sendKeys(customerData.get(0));//jack@gmail.com
        brLoginPage.userPass.sendKeys(customerData.get(1));//12345

         */
       List<Map<String,String>> customerData =  credentials.asMaps(String.class,String.class);
        //System.out.println(customerData); //[{email=jack@gmail.com, password=12345}]
        for (Map<String,String>each :customerData) {
            brLoginPage.userEmail.sendKeys(each.get("email")); // email=jack@gmail.com
            brLoginPage.userPass.sendKeys(each.get("password")); //password=12345
        }
    }

}
