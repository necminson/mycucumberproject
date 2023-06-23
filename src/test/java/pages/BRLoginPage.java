package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BRLoginPage {
    public BRLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "formBasicEmail")
    public WebElement userEmail;
    @FindBy(id = "formBasicPassword")
    public WebElement userPass;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}
