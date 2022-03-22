package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.DeleteUser;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefDeleteUser {
    @Steps
    DeleteUser deleteUser;

    @When("I try delete user with ID {int}")
    public void DeleteUserWithID(int ID) {
        deleteUser.deleted(ID);
    }

    @Then("I can delete the user account")
    public void iCanDeleteTheUserAccount() {
        seeThatResponse("sukses menghapus user",
                response -> {
                    response.statusCode(200);

                }
        );
    }
}
