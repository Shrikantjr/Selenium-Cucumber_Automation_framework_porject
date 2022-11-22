package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import spicejet.Basepage.TestBase;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class homepageSteps extends TestBase {

    Logger log = Logger.getLogger(homepageSteps.class.getName());

    @When("I click on Departure city and I enter the city name {string}")
    public void iClickOnDepartureCity(){

        System.out.println("hello there");

    }


    @And("I select the Departure date")
    public void iSelectTheDepartureDate(DataTable data) {
        List<List<String>> obj = Collections.singletonList(data.asList());
        obj.get(0).get(0);

        //data driver testing
    }


    @Given("I enter the url")
    public void iEnterTheUrl(){
        driver.get("https://www.google.com");
        System.out.println("broswer is up");
    }


}