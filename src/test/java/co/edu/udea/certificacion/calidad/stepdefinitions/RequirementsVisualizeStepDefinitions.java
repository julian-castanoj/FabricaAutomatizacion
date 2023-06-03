package co.edu.udea.certificacion.calidad.stepdefinitions;

import com.calidad.calidadautomation.questions.ValidationRequirements;
import com.calidad.calidadautomation.tasks.*;
import com.calidad.calidadautomation.userinterfaces.UsuarioPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RequirementsVisualizeStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor estudiante = Actor.named("Carlitos");

    @Given("me encuentro en la pagina de home")
    public void meEncuentroPaginaHome(){
        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
    }
    @When("digito un documento incorrecto y le doy click en buscar")
    public void digitoNumeroIncorrecto(){
        estudiante.attemptsTo(HomePage.Browser(new UsuarioPage()));

    }

    @Then("puedo ver una alerta con un mensaje de error al buscar el documento")
    public void puedoVerAlerta(){
        estudiante.should(seeThat(ValidationRequirements.theRequirementsPage(),equalTo(true)));
    }

}
