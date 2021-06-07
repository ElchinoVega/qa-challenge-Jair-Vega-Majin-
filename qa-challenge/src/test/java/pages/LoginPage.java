package pages;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    public void navigateToRegister(){
        navigateTo("http://localhost:4000/login");
    }
}
