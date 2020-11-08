package com.vytrack.pages;

import com.vytrack.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // to not use WebElements directly in step defitnition classes
    //helps to prevent code duplication and keep step definitions clean
    @FindBy (id="prependedInput")
    private WebElement userName;

    @FindBy (id="prependedInput2")
    private WebElement password;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;

    public String getWarningMessageText(){
        return warningMessage.getText().trim();
    }

    public void login(String usernameValue, String passwordValue){

        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }
    public void login() {
        String usernameValue = ConfigurationReader.getProperty("storemanager.username");
        String passwordValue = ConfigurationReader.getProperty("password");

        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
    public void login(String role){
        String usernameValue = ConfigurationReader.getProperty("storemanager.username");
        String passwordVale = ConfigurationReader.getProperty("password");

        if(role.equalsIgnoreCase("sales manager")){
            usernameValue = ConfigurationReader.getProperty("salesmanager.username");
        }else if (role.equalsIgnoreCase("driver")){
            usernameValue = ConfigurationReader.getProperty("driver.username");
        }else {
            usernameValue = ConfigurationReader.getProperty("storemanager.username");
        }

        userName.sendKeys(usernameValue);
        password.sendKeys(passwordVale, Keys.ENTER);
}


}
