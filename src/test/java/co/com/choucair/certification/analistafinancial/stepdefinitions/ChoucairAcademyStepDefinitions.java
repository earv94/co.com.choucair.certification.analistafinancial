package co.com.choucair.certification.analistafinancial.stepdefinitions;

import co.com.choucair.certification.analistafinancial.tasks.Login;
import co.com.choucair.certification.analistafinancial.tasks.OpenUp;
import co.com.choucair.certification.analistafinancial.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseFoundationExpressOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Foundation Express$")
    public void heFindsTheCourseCalledResourcesFoundationExpress() {

    }

}
