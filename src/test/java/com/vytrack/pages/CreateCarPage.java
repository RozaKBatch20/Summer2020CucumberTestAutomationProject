package com.vytrack.pages;

import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateCarPage extends BasePage{

    @FindBy(css = "[title='Create Car']")
    private WebElement createCarBtn;

    @FindBy(name = "custom_entity_type[LicensePlate]")
    private WebElement licensePlateInputBox;

    @FindBy(name = "custom_entity_type[ModelYear]")
    private WebElement modelYearInputBox;

    public void clickOnCreateCar(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

        wait.until(ExpectedConditions.elementToBeClickable(createCarBtn)).click();
        System.out.println("Clicking on 'Create car' button");

    }

    public void enterLicensePlate(String licensePlate){
       /**
        ** WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        ** wait.until(ExpectedConditions.visibilityOf(licensePlateInputBox));
        ** licensePlateInputBox.clear();
        ** licensePlateInputBox.sendKeys(licensePlate);
        */

       //this is a shorter version
        BrowserUtils.enterText(licensePlateInputBox, licensePlate);


    }

    public void enterModelYear(String modelYear){
        BrowserUtils.enterText(modelYearInputBox,modelYear);
    }

    /**
     * sometimes, for very long strings webdriver might enter text, not fully.
     */

}
