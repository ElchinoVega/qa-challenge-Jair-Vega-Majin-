package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Given("^Cargo Pagina de Login$")
    public void pageLogin(){
        login.navigateToLogin();

    }

    @When("Ingreso datos del Usuario previamente registrado para el Login obligatorios email y password")
    public void ingresoDatosDelUsuarioPreviamenteRegistradoParaElLoginObligatoriosEmailYPassword() {
        
    }

    @Then("Login Exitoso con mensaje")
    public void loginExitosoConMensaje() {

    }
}
