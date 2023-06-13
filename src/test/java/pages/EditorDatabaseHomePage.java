package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDatabaseHomePage {
    public EditorDatabaseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement HomePage_NewButton;
    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstname;
    @FindBy(xpath = "//*[@id='DTE_Field_last_name']")
    public WebElement lastname;
    @FindBy(xpath = "//*[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy(xpath = "//*[@id='DTE_Field_office']")
    public WebElement office;
    @FindBy(xpath = "//*[@id='DTE_Field_extn']")
    public WebElement extension;
    @FindBy(xpath = "//*[@id='DTE_Field_start_date']")
    public WebElement startDate;
    @FindBy(xpath = "//*[@id='DTE_Field_salary']")
    public WebElement salary;
    @FindBy(xpath = "(//button)[4]")
    public WebElement createButton;
    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;
    @FindBy(xpath = "(//td)[2]")
    public WebElement searchNameField;




}
