package stepsDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.SportLineSteps;

import java.io.IOException;

public class SportLineBuscarStepDefinitions {
    SportLineSteps sportLineSteps=new SportLineSteps();

    @Given("^Dado que me encuentro en la página de SportLine$")
    public void dadoQueMeEncuentroEnLaPáginaDeSportLine() throws IOException {
        sportLineSteps.abrirPagina();
        sportLineSteps.cargarDatos();
    }

    @When("^busque el nombre del producto$")
    public void busqueElProductoAirZoomVomero() {
        sportLineSteps.buscarYValidadElementosEnSportLine();
    }

    @Then("^puedo ver el producto en pantalla$")
    public void puedoVerElProductoEnPantalla() {
        sportLineSteps.cerrarNavegador();
    }
}
