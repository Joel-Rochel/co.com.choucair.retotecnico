package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.Utest_Data;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.Formulario;
import co.com.choucair.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoChoucairStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Joel wants to register on the Utest site$")
    public void joelWantsToRegisterOnTheUtestSite() {
        OnStage.theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), (Registro.onThePage()));

    }


    @When("^start the registration process in Utest$")
    public void startTheRegistrationProcessInUtest(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.userData(data));

    }

    @Then("^check the final registration process$")
    public void checkTheFinalRegistrationProcess(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));

    }

}
