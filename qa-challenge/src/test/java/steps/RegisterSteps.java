package steps;

import io.cucumber.java.en.*;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage register = new RegisterPage();

    @Given("^Cargo Pagina de Registro$")
    public void pageRegistro(){
        register.navigateToRegister();

    }

    @When("^Ingreso datos del Usuario obligatorios email y password$")
    public void ingresoDatosDelUsuarioObligatoriosEmailYPassword() {

    }


    @Then("^Registro de Usuario Exitoso$")
    public void registroDeUsuarioExitoso() {
    }
}
