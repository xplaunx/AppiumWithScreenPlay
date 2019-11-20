package co.com.qvision.eribank.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.qvision.eribank.questions.HomePageQuestion;
import co.com.qvision.eribank.tasks.LoginToTheApp;
import co.com.qvision.eribank.utils.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginUserStepDefinitions {

	private String userName = "company";
	private String userPassword = "company";
	
	private Actor sebas = Actor.named("sebas");

	@Given("^that sebas open the app$")
	public void thatSebasOpenTheApp() throws Exception {
	  sebas.can(BrowseTheWeb.with(MyDriver.abrirApp()));
	}

	@When("^he enters with valid user data$")
	public void heEntersWithValidUserData() throws Exception {
	  sebas.attemptsTo(LoginToTheApp.withUserData(userName, userPassword)); 
	}

	@Then("^he can see the main menu$")
	public void heCanSeeTheMainMenu() throws Exception {
	  sebas.should(
			  seeThat(HomePageQuestion.isVisible())
			);
	}
	
	
	
	
	
}
