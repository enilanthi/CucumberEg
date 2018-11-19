package com.qa.test.auto.stepdefs;

import com.qa.test.auto.stepdefs.dataTypes.User;
import com.qa.test.auto.transformation.EmailAddressCreator;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class LoginStepdefs {

    @Given("^I am in the login page$")
    public void iAmInTheLoginPage() {
        System.out.println("I am in login page");
    }

    @When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("I enter username: " + username + ", and password: " + password);
    }

    @And("^I click Login button$")
    public void iClickLoginButton() {
        System.out.println("I click login button");
    }

    @Then("^I should be directed to user form page$")
    public void iShouldBeDirectedToUserFormPage() {
        System.out.println("I am directed to userform page");
    }

    @When("^I enter following username and password$")
    public void iEnterFollowingUsernameAndPassword(DataTable table) {
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user : users) {
            System.out.println("UserName: " + user.getUserName() + ", Password: " + user.getPassword());
        }
    }

    @When("^I enter username as \"([^\"]*)\" and as password \"([^\"]*)\"$")
    public void iEnterUsernameUserNameAndPasswordPassword(String username, String password) {
        System.out.println("UserName: " + username + ", Password: " + password);
    }

    @And("^my email address should be created based on username: \"([^\"]*)\"$")
    public void myEmailAddressShouldBeCreatedBasedOnUsername(@Transform(EmailAddressCreator.class) String userName) {
        System.out.println("Email address: "+userName);
    }

    @Then("^I should not be directed to user form page$")
    public void iShouldNotBeDirectedToUserFormPage(){
        System.out.println("Failing the test on purpose");
        Assert.fail("Failing the test on purpose");
    }
}
