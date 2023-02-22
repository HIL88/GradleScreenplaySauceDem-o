package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.LoginQuestion;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El cliente ingresa a la pagina website$")
    public void el_cliente_ingresa_a_la_pagina_website()  {
        theActorCalled("cliente").attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^El cliente (.+) y (.+)$")
    public void el_cliente_y(String usuario, String contrasena) {
        theActorCalled("cliente").attemptsTo(LoginTask.inicioSesion(usuario, contrasena));
    }

    @Then("^ver la cuenta (.+)$")
    public void ver_la_cuenta(String validtexto) {

      //  System.out.println("*******"+LoginQuestion.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.loginvalidtext(validtexto)));

    }


}
