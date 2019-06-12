package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends Menu{

    @FindBy(id = "txtUserName")
    public WebElement username;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(css = "input[data-bind='click:loginPageClick']")
    public WebElement loginButton;

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
