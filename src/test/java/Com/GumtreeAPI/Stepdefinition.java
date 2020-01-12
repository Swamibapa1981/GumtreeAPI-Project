package Com.GumtreeAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

    @Given("^User set the  REST API URL with GET API endpoint\\.$")
    public void user_set_the_REST_API_URL_with_GET_API_endpoint() throws Throwable {

       URL.URL1();
    }

    @When("^User select User ID and send GET HTTP Method to retrieve the email address of that User ID\\.$")
    public void user_select_User_ID_and_send_GET_HTTP_Method_to_retrieve_the_email_address_of_that_User_ID() throws Throwable {

      CRUDRequest.getdataforid2();

    }

    @When("^User Using same User ID send GET HTTP Method to retrieve associated posts and verify they contain valid POST ID\\.$")
    public void user_Using_same_User_ID_send_GET_HTTP_Method_to_retrieve_associated_posts_and_verify_they_contain_valid_POST_ID() throws Throwable {

      CRUDRequest.associatedposts();
    }

    @When("^User send POST HTTP Method with same User ID with non-empty body and title and verify the correct response is returned\\.$")
    public void user_send_POST_HTTP_Method_with_same_User_ID_with_non_empty_body_and_title_and_verify_the_correct_response_is_returned() throws Throwable {

     CRUDRequest.postbyUser();
    }

    @Then("^User can see the respective result\\.$")
    public void user_can_see_the_respective_result() throws Throwable {


    }

}
