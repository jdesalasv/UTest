package co.com.choucair.certification.UTest.stepdefinitions;




import co.com.choucair.certification.UTest.model.UTestData;
import co.com.choucair.certification.UTest.questions.Answer;
import co.com.choucair.certification.UTest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestStepdefinitions {



    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jahaziel needs to enter uTest link$")
    public void thanJahazielNeedsToEnterUtest() throws Exception{

        OnStage.theActorCalled("Jahaziel").wasAbleTo(OpenUp.thePage());

    }

    @When("^he enter your data to be able to register on the uTest platform$")
    public void heEnterYourDataToBeAbleToRegisterOnTheUtestPlatform(List<UTestData> uTestData) throws Exception{
        OnStage.theActorCalled("Jahaziel").wasAbleTo(
                Access.onThePage(),
                PersonalData.userData(uTestData.get(0)),
                AddresData.insertInto(uTestData.get(0)),
                DeviceData.insertInto(uTestData.get(0)),
                PasswordData.insertInto(uTestData.get(0))

        );
    }

    @Then("^he see the welcome page on the uTest platform and see the message$")
    public void heSeeTheWelcomePageOnTheUtestPlatformAndSeeTheMessage(List<UTestData> uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrWelcomeMessage())));
    }
}
