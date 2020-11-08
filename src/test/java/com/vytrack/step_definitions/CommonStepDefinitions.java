package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefinitions {

   // don't need it anymore LoginPage loginPage = new LoginPage();
    BasePage basePage = new LoginPage();



    @Given("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {

        basePage.navigateTo(string, string2);

    }

    @When("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {

        basePage.clickSaveAndClose();

    }



/*
    @Given("user clicks on create car button")
    public void user_clicks_on_create_car_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user adds new vehicle information")
    public void user_adds_new_vehicle_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

 */



}
