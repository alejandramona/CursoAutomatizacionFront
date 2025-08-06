package demoqa.org.stepDefinitions;

import demoqa.org.pages.RegisterDemoQAPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class RegisterDemoQAStepDefinitions {

    @Managed
    WebDriver driver;


    public RegisterDemoQAPages registerDemoQAPages;
    @Given("Accedo a la Pagina de DemoQA")
    public void accedoALaPaginaDeDemoQA(){
        registerDemoQAPages.openUrlPrueba("https://demoqa.com/automation-practice-form");
    }
    @When("Completo los campos de manera correcta {string}")
    public void completoLosCamposDeManeraCorrecta(String nombre) throws InterruptedException {
        registerDemoQAPages.sendkeyPrimerNombre(nombre);
        Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Valido que se envie de manera correcta")
    public void validoQueSeEnvieDeManeraCorrecta() {
        // Write code here that turns the phrase above into concrete actions
    }

}
