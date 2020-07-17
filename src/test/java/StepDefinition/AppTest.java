package StepDefinition;

import io.cucumber.java.en.When;

public class AppTest {
    @When("^I login with \"(.*)\" id and \"(.*)\" password$")
    public void multiparams(String userid, String pass) {
        System.out.println("user id is:" + userid);
        System.out.println("password is:" + pass);
    }

    @When("^I signup with user name \"(.*)\" and email \"([^\"]*)\"$")
    public void multiparams2(String name, String email) {
        System.out.println("name is:" + name);
        System.out.println("email is:" + email);
    }
}