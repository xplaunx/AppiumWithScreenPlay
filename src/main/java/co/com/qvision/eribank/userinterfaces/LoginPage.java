package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	
	public static final Target NAME_USER = Target.the("Input text user name").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
	public static final Target PASS_USER = Target.the("Input text user password").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
	public static final Target BUTTON_LOGIN = Target.the("Boton de login").located(By.id("com.experitest.ExperiBank:id/loginButton"));
	
}
