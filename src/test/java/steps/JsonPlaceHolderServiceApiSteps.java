package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.JsonPlaceHolderServiceApiPage;

public class JsonPlaceHolderServiceApiSteps {
    private JsonPlaceHolderServiceApiPage jsonPlaceHolderServiceApiPage;
    @Given("I am on the api url {string}")
    public void iAmOnTheApiUrl(String url) {
        jsonPlaceHolderServiceApiPage = new JsonPlaceHolderServiceApiPage();
        jsonPlaceHolderServiceApiPage.captureUrl(url);
    }

    @When("I send a get request on {string}")
    public void iSendAGetRequestOn(String getUrl) {
        jsonPlaceHolderServiceApiPage.captureGetUrl(getUrl);
    }

    @Then("I get the {string} as {string}")
    public void iGetTheAs(String key, String value) {
        jsonPlaceHolderServiceApiPage.submitGetRequest(key, value);
    }

    @Then("I get a ststus of {string}")
    public void iGetAStstusOf(String arg0) {
    }
}
