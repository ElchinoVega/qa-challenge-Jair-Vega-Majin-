package pages;

public class RegisterPage extends BasePage{

    public RegisterPage(){
        super(driver);
    }

    public void navigateToRegister(){
        navigateTo("http://localhost:4000/register");
    }

}
