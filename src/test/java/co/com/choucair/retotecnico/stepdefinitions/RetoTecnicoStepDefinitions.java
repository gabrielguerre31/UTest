package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.UTestUserData;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^that Gabriel wants to register in utest$")
    public void thatGabrielWantsToRegisterInUtest() {
        theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage(),(SingUp.onThePage()));
    }

    @When("^he enters the data on the register page$")
    public void heEntersTheDataOnTheRegisterPage(List<UTestUserData> uTestUserData) {
        theActorInTheSpotlight().attemptsTo(
                EnterThePersonalData.onTheRegistrationPage(uTestUserData.get(0)),
                EnterTheAddressData.onTheRegistrationPage(uTestUserData.get(0)),
                EnterTheDevicesData.onTheRegistrationPage(uTestUserData.get(0)),
                EnterThePasswordAndPoliticsData.onTheRegistrationPage(uTestUserData.get(0)));
    }


    @Then("^he is able to register$")
    public void heIsAbleToRegister(List<UTestUserData> uTestUserData) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(uTestUserData.get(0).getStrRegister())));
    }

}
