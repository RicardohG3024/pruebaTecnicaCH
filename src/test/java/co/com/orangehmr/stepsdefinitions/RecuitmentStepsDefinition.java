package co.com.orangehmr.stepsdefinitions;

import co.com.orangehmr.questions.CompareName;
import co.com.orangehmr.tasks.CandidateTask;
import co.com.orangehmr.tasks.LoginTask;
import co.com.orangehmr.tasks.RecruitmentTask;
import co.com.orangehmr.tasks.ScheduleInterviewTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class RecuitmentStepsDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUP(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Recruiter");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^the recruiter opens the website$")
    public void theRecruiterOpensTheWebsite() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("^the recruiter enters the credentials$")
    public void theRecruiterEntersTheCredentials() {
    OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredentials());
    }

    @When("^the recruiter fills in the employee's details in the form$")
    public void theRecruiterFillsInTheEmployeeSDetailsInTheForm() {
    OnStage.theActorInTheSpotlight().attemptsTo(RecruitmentTask.dataRegister());
    OnStage.theActorInTheSpotlight().attemptsTo(CandidateTask.dataCandidate());
    OnStage.theActorInTheSpotlight().attemptsTo(ScheduleInterviewTask.interviewCandidate());

    }

    @Then("^the employee details match the ones entered in the forms$")
    public void theEmployeeDetailsMatchTheOnesEnteredInTheForms() {


    }

    @Then("^the status is Hired$")
    public void theStatusIsHired() {

    }

}
