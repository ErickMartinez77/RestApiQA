package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    /*
    * {} -> reemplaza cualquier cadena
    * {word} -> reemplaza una palabra
    * {string} -> reemplaza palabra/s cuando estan entre ""
    * {int} -> reemplaza un valor entero
    * {float} -> reemplaza un valor decimal
    * */
    @Given("i have access to {}")
    public void iHaveAccessToFacebook(String app) {
    }

    @When("i type the email: {}")
    public void iTypeTheEmailErickmartinezGmailCom(String email) {
    }

    @And("i type the password: {int}")
    public void iTypeThePassword(int pwd) {
    }

    @And("i click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("i should be logged")
    public void iShouldBeLogged() {
    }
}
