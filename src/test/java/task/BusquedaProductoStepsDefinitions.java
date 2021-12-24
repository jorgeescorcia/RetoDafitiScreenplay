package task;

import UI.DafitiPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class BusquedaProductoStepsDefinitions {
    Actor actor = new Actor("Jorge");

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Navego en Dafiti$")
    public void navegoenDafiti() {
        actor.can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.dafiti.com.co/")));

    }


    @When("^Busco '(.*)' los en Dafiti$")
    public void escriboEnElBuscador(String producto) throws IOException {


        actor.attemptsTo(BuscarProducto.enDafiti(producto));



    }

    @Then("^Obtengo y Valido los Resultados$")
    public void validoResultados(String producto) {
        actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(DafitiPage.txtElementoBusqueda.of(producto)), WebElementStateMatchers.containsText(producto)));
        GoogleChromeDriver.driver.quit();

    }
}