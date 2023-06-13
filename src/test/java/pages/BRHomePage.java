package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BRHomePage {
    public BRHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
    @FindBy(linkText = "Logout")
    public WebElement logOut;
    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;
}
