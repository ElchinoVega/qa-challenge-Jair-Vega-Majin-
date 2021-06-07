package pages;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    public void navigateToLogin(){
        navigateTo("http://localhost:4000/login");
    }
}
