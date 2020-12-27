package com.krisztiansipos.nearchanicsapi.hello;

import com.krisztiansipos.nearchanicsapi.SpringIntegrationTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloTest extends SpringIntegrationTest {
    @When("I open the /hello endpoint")
    public void i_open_the_hello_endpoint() throws IOException {
        executeGet("http://localhost:8080/hello");
    }

    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(int statusCode) throws IOException {
        HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " +
                latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @And("The server returns with a {string} string")
    public void the_server_returns_with_a_string(String string) {
        assertThat(latestResponse.getBody(), is(string));
    }
}
